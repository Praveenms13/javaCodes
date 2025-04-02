import java.util.Scanner;
import static java.lang.System.out;
public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter your weight (in kgs): ");
			float weight = scanner.nextInt();
			
			out.print("Enter your height (in cms): ");
			float height = scanner.nextInt();
			
			if (weight <= 10 || height <= 100) {
				out.print("Invalid Input, Weight and Height shld be more that or equal to 10 and 100 Respectively.");
				System.exit(0);
			}
			height = height / 100;
			float bmi = weight / (height * height);
			out.printf("Your BMI is: %.2f", bmi);
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}