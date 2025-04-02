import java.util.Scanner;
import static java.lang.System.out;
public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter the number to check if it is a Harshad or not: ");
			int number = scanner.nextInt();
			if (number <= 1) {
				out.print("Please input the number that shld be greater than 1.");
				System.exit(0);
			}
			int sum = 0;
			int originalNumber = number;
			while (number != 0) {
				int singleDigit = number % 10;
				number = number / 10;
				sum += singleDigit;
			}
			// out.println(10%5);
			if (number % sum == 0) {
				out.print("The Given Number is a Harshad Number");
			} else {
				out.print("The Given Number is not a Harshad Number");
			}
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}