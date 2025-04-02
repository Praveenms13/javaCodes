
import static java.lang.System.out;
import java.util.Scanner;

public class program9 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter total number of people: ");
            int number = scanner.nextInt();
            double[][] marks = new double[number][3];
            double[] percentage = new double[number];
            String[] grade = new String[number];
            out.println("Enter Physics Chemistry and Maths marks seperated by Space");
            for (int i = 0; i < number; i++) {
                out.printf("Enter marks for student %d > ", (i + 1));
                marks[i][0] = scanner.nextDouble();
                marks[i][1] = scanner.nextDouble();
                marks[i][2] = scanner.nextDouble();
                percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
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
                if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                    out.print("Negative vaues are not accepted.");
                    i--;
                    continue;
                }
            }
            for (int i = 0; i < number; i++) {
                out.printf("Student %d -> P: %.2f, C: %.2f, M: %.2f | Percentage: %.2f%% | Grade: %s%n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }
            scanner.close();
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
