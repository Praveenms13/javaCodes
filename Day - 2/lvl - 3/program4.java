import java.util.Scanner;
import static java.lang.System.out;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter the number to check it is prime number or not: ");
			int number = scanner.nextInt();
			if (number <= 1) {
				out.print("Please input the number that shld be greater than 1.");
				System.exit(0);
			}
			for (int i=2;i<=Math.sqrt(number);i++) {
				if (number%i==0) {
					out.println(number + " Is not Prime.");
					System.exit(0);
				}
			}
			out.println("Is Prime.");
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}