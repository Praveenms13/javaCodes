import java.util.Scanner;

public class BMICalculator {
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100;
            double bmi = weight / (height * height);
            result[i][0] = String.format("%.2f", data[i][0]);
            result[i][1] = String.format("%.2f", data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getBMIStatus(bmi);
        }
        return result;
    }

    public static void displayBMIResults(String[][] data) {
        System.out.println("Height(cm) | Weight(kg) | BMI   | Status");
        System.out.println("--------------------------------------");
        for (String[] row : data) {
            System.out.printf("%9s  | %9s  | %5s | %s%n", row[1], row[0], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightData = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeightData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeightData[i][1] = scanner.nextDouble();
        }
        
        String[][] bmiResults = computeBMI(heightWeightData);
        displayBMIResults(bmiResults);
        scanner.close();
    }
}
