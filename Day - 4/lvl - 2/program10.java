import static java.lang.System.out;
import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double[][] totalPersons = new double[10][3];
            String[] bmiStatus = new String[10];
            CalculateBMI CalculateBMObj = new CalculateBMI();
            for (int i=0;i<totalPersons.length;i++){
                out.printf("Enter Person %d's weight (in kgs) and height (in cms)> ", (i+1));
                totalPersons[i][0] = scanner.nextDouble();
                totalPersons[i][1] = scanner.nextDouble();
                totalPersons[i][2] = CalculateBMObj.getBMI(totalPersons[i][0], totalPersons[i][1]);
                bmiStatus[i] = CalculateBMObj.getBMIStatus(totalPersons[i][2]);
            }
            out.println("\nBMI Report:");
            out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
            for (int i = 0; i < totalPersons.length; i++) {
                out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", totalPersons[i][0], totalPersons[i][1], totalPersons[i][2], bmiStatus[i]);
            }
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        }
        scanner.close();
    }
    public double getBMI(double weight, double height) {
        height = height / 100;
        return weight / (height * height);
    }
    public String getBMIStatus(double bmi) {
        if (bmi <= 18.4) { return "Underweight"; }
        else if (bmi <= 24.9) { return "Normal"; }
        else if (bmi <= 39.9) { return "Overweight"; }
        else { return "Obese"; }
    }
}
