import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter day: ");
            int day = scanner.nextInt();
            out.print("Enter month: ");
            int month = scanner.nextInt();
            out.print(springSeason(day, month) ? "Yes, It's a Spring Season." : "No, Its not a spring Season.");
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    static boolean springSeason(int day, int month) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }
}