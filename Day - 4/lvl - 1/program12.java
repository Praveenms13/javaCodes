import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter the angle in degrees: ");
            double angle = scanner.nextDouble();
            Main mainInstance = new Main();
            double[] result = mainInstance.calculateTrigonometricFunctions(angle); 
            out.printf("Calculated Value for SIN: %.2f%n", result[0]);
            out.printf("Calculated Value for COS: %.2f%n", result[1]);
            out.printf("Calculated Value for TAN: %.2f%n", result[2]);
            scanner.close();
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
    }
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = angle * (Math.PI / 180);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }
}