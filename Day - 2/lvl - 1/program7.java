import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter day: ");
			int day = scanner.nextInt();
			
			System.out.print("Enter month: ");
			int month = scanner.nextInt();
			
			if ((month > 3 && month < 6) || (month >= 3 && day >= 20) || (month <= 6 && day <= 20)){
				System.out.print("Its a spring season.");
			} else {
				System.out.print("Not a spring season.");
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}
