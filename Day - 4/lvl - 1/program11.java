import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter the temperature: ");
            double temperature = scanner.nextDouble();
            out.print("Enter the wind speed: ");
            double windSpeed = scanner.nextDouble();
            Main mainInstance = new Main();
            out.printf("Wind Speed: %.2f%n", mainInstance.calculateWindChill(temperature, windSpeed));
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}