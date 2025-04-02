
import static java.lang.System.out;
import java.util.Scanner;

public class program7 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter total number of people: ");
            int number = scanner.nextInt();
            double personDatas[][] = new double[number][3];
            String[] weightStatus = new String[number];
            out.println("Enter values for weight and heigth seperated by space");
            for (int i = 0; i < number; i++) {
                out.print("Enter Person " + (i + 1) + "'s Weight and Height> ");
                personDatas[i][0] = scanner.nextDouble();
                personDatas[i][1] = scanner.nextDouble();
                personDatas[i][2] = personDatas[i][0] / (personDatas[i][1] * personDatas[i][1]);
                if (personDatas[i][2] < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (personDatas[i][2] >= 18.5 && personDatas[i][2] < 24.9) {
                    weightStatus[i] = "Normal weight";
                } else if (personDatas[i][2] >= 25 && personDatas[i][2] < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }
            out.println("\nResults (Weight Height BMI Status):");
            for (int i = 0; i < number; i++) {
                out.printf("Person %d: %.2f kg %.2f m BMI: %.2f (%s)\n",(i + 1), personDatas[i][0], personDatas[i][1], personDatas[i][2], weightStatus[i]);
            }
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
