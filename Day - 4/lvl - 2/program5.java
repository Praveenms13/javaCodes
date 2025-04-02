import static java.lang.System.out;
import java.util.Scanner;
import java.time.*; 
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.printf("Converting 10 Yards To Feet: %.2f%n", convertYardsToFeet(3));
            out.printf("Converting 10 Feet To Yards: %.2f%n", convertFeetToYards(0.333));
            out.printf("Converting 10 Meters To Inches: %.2f%n", convertMetersToInches(39.3701));
            out.printf("Converting 10 Inches To Meters: %.2f%n", convertInchesToMeters(0.0254));
            out.printf("Converting 10 Inches To CM: %.2f%n", convertInchesToCM(2.54));
        } catch (Exception e) {
			out.printf("Error occurred" + e);
		}
		scanner.close();
    }
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet){
        return feet / 3;
    }
    public static double convertMetersToInches(double meters){
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches){
        return inches * 0.0254;
    }
    public static double convertInchesToCM(double inches){
        return inches * 2.54;
    }
}