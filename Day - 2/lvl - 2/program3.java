import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a number to print the multiplication table: ");		
			int number = scanner.nextInt();
			for (int i = 6; i <= 9; i++){
				System.out.println(number + " * " + i + " = " + (number * i));
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}