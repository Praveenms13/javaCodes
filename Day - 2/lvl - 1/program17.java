import java.util.*;
public class program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter your salary: ");		
			double salary = scanner.nextInt();
			
			System.out.print("Enter your years of service: ");		
			int service = scanner.nextInt();
			
			if (service > 5){
				double bonus = 0.05 * salary;
				System.out.print("Your Bonus Amount is " + bonus);
			} else {
				System.out.print("Sorry, you are not eligible for bonus.");
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}