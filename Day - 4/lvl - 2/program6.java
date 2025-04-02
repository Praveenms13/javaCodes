import static java.lang.System.out;
import java.util.Scanner;
import java.time.*; 
public class UnitConvertor {
    public static void main(String[] args) {
		try {		
            out.printf("Converting 78 Fahrenheit To Celsius: %.2f%n", convertFahrenheitToCelsius(78));
            out.printf("Converting 32 Celsius To Fahrenheit: %.2f%n", convertCelsiusToFahrenheit(32));
            out.printf("Converting 40 POunds To Kilogram: %.2f%n", convertPoundsToKilograms(40));
            out.printf("Converting 20 KiloGram To Pounds: %.2f%n", convertKilogramsToPounds(20));
            out.printf("Converting 15 Gallons To Liters: %.2f%n", convertGallonsToLiters(15));
            out.printf("Converting 20 Liters To Gallons %.2f%n", convertLitersToGallons(20));
        } catch (Exception e) {
			out.printf("Error occurred" + e);
		}
    }

    public static double convertFahrenheitToCelsius(double far) {
        return (far - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double cel) {
        return (cel * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}