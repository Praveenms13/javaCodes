import java.util.Scanner;
import static java.lang.System.out;
public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter the number to check if it is a amstrong or not: ");
			int number = scanner.nextInt();
			if (number <= 1) {
				out.print("Please input the number that shld be greater than 1.");
				System.exit(0);
			}
			int sum = 0;
			int n = 0;
			int originalNumber = number;
			int temp = number;
			while (temp != 0) {
				temp /= 10;
				n++;
			}
			
			while (number != 0) {
				int singleDigit = number % 10;
				number = number / 10;
				sum += Math.pow(singleDigit, n);
			}
			if (sum == originalNumber){
				out.print("The Given Number is a amstrong number");
			} else {
				out.print("The Given Number is not a amstrong number");
			}
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}