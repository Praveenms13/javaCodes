import static java.lang.System.out;
import java.util.Scanner;

public class pr {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter total number of students: ");
            int number = scanner.nextInt();

            // Separate arrays for marks
            double[] physics = new double[number];
            double[] chemistry = new double[number];
            double[] maths = new double[number];
            double[] percentage = new double[number];
            String[] grade = new String[number];

            for (int i = 0; i < number; i++) {
                out.printf("Enter marks for Student %d (Physics, Chemistry, Maths): ", (i + 1));
                physics[i] = scanner.nextDouble();
                chemistry[i] = scanner.nextDouble();
                maths[i] = scanner.nextDouble();
                if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                    out.println("Negative values are not accepted. Please re-enter the marks.");
                    i--;
                    continue;
                }
                percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
                if (percentage[i] >= 80) {
                    grade[i] = "A";
                } else if (percentage[i] >= 70) {
                    grade[i] = "B";
                } else if (percentage[i] >= 60) {
                    grade[i] = "C";
                } else if (percentage[i] >= 50) {
                    grade[i] = "D";
                } else if (percentage[i] >= 40) {
                    grade[i] = "E";
                } else {
                    grade[i] = "R";
                }
            }
            for (int i = 0; i < number; i++) {
                out.printf(
                        "Student %d -> Physics: %.2f, Chemistry: %.2f, Maths: %.2f | Percentage: %.2f%% | Grade: %s%n",
                        (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
            }
            scanner.close();
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        }
    }
}
