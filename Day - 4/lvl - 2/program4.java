import static java.lang.System.out;
import java.util.Scanner;
import java.time.*; 
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.printf("Converting 10 Km To Miles: %.2f%n", convertKmToMiles(10));
            out.printf("Converting 10 Miles To Km: %.2f%n", convertMilesToKm(100));
            out.printf("Converting 10 Miles To Feet: %.2f%n", convertMilesToFeet(100));
            out.printf("Converting 10 Feet To Meters: %.2f%n", convertFeetToMeters(10));
        } catch (Exception e) {
			out.printf("Error occurred" + e);
		}
		scanner.close();
    }
    public static double convertKmToMiles(double km){
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles){
        return miles * 1.60934;
    }
    public static double convertMilesToFeet(double miles){
        return miles * 5280;
    }
    public static double convertFeetToMeters(double feet){
        return feet * 0.3048;
    }
}