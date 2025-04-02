import java.util.Scanner;
import static java.lang.System.out;
public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter the number to check the digits: ");
			int number = scanner.nextInt();
			if (number <= 1) {
				out.print("Please input the number that shld be greater than 1.");
				System.exit(0);
			}
			int n = 0;
			int temp = number;
			while (temp != 0) {
				temp /= 10;
				n++;
			}
			out.print(n);
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}