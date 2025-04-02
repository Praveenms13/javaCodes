import java.util.Scanner;
import static java.lang.System.out;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter a year: ");		
			int year = scanner.nextInt();
			if ((year > 1582) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				out.print(year + " is a leap year.");
			} else {
				out.print(year + " is not a leap year.");
			}
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}