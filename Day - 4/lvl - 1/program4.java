import static java.lang.System.out;
import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {        
            out.print("Enter the length of side1 in meters: ");
            double side1 = scanner.nextDouble();
            out.print("Enter the length of side2 in meters: ");
            double side2 = scanner.nextDouble();
            out.print("Enter the length of side3 in meters: ");
            double side3 = scanner.nextDouble();
            
            double calculatedNoOfRounds = calculateNoOfRounds(side1, side2, side3);
            if (calculatedNoOfRounds == -1) {
                out.println("Error: The perimeter must be greater than zero.");
            } else {
                out.printf("Rounds Needed: %.2f%n", calculatedNoOfRounds);
            }
        } catch (Exception e) {
            out.println("Error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static double calculateNoOfRounds(double side1, double side2, double side3) {
        double totalDistance = 5000;
        double perimeter = side1 + side2 + side3;yy
        return totalDistance / perimeter;
    }
}
