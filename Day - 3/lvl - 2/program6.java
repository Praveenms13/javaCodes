
import static java.lang.System.out;
import java.util.Scanner;

public class program6 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter total number of people: ");
            int number = scanner.nextInt();
            double height[] = new double[number];
            double weight[] = new double[number];
            double bmi[] = new double[number];
            for (int i = 0; i < number; i++) {
                out.print("Enter the height (m)> ");
                height[i] = scanner.nextDouble();
                out.print("Enter the weight (kgs)> ");
                weight[i] = scanner.nextDouble();
                bmi[i] = (weight[i]) / (height[i] * height[i]);
            }
            for (int i = 0; i < bmi.length; i++) {
                if (bmi[i] <= 18.4) {
                    System.out.printf("BMI of Person %d: %.2f - Underweight%n", (i + 1), bmi[i]);
                } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                    System.out.printf("BMI of Person %d: %.2f - Normal%n", (i + 1), bmi[i]);
                } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                    System.out.printf("BMI of Person %d: %.2f - Overweight%n", (i + 1), bmi[i]);
                } else if (bmi[i] >= 40.0) {
                    System.out.printf("BMI of Person %d: %.2f - Obese%n", (i + 1), bmi[i]);
                } 
            }
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
