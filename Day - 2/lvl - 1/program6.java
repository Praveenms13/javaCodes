import java.util.*;
public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter number: ");
			int number = scanner.nextInt();
			if (number > 0){
				System.out.print("The Given Number is " + number + " and it is Positive.\n");
			} else if (number < 0) {
				System.out.print("The Given Number is " + number + " and it is Negative.\n");
			} else if (number == 0) {
				System.out.print("The Given Number is " + number + " and it is Zero.\n");
			} else {
				System.out.print("Invalid Input.\n");
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}
