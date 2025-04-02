import static java.lang.System.out;
import java.util.Scanner;
import java.time.*; 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter Year to check it is a leap year or not: ");
            int yearInput = scanner.nextInt(); 
            if (yearInput<=1582 /* || yearInput > Year.now().getValue() */) {
                out.print("Invalid Year.");
                System.exit(0);
            }
            findLeapYear(yearInput);
        } catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    public static void findLeapYear(int year){
        if ((year > 1582) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            out.print(year + " is a leap year.");
        } else {
            out.print(year + " is not a leap year.");
        }
    } 
}