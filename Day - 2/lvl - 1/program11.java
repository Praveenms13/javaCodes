import java.util.*;
public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {			
			double total = 0.0;
			double userVal;
			while (true){
				System.out.print("Enter Number > ");
				userVal = scanner.nextDouble();
				if (userVal <= 0){
					break;
				}
				total += userVal;
				// System.out.print(val + "\n");
			}
			System.out.print("Total Val: " + total + "\n");
			System.out.print("Exiting ...\n");
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}