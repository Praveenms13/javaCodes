import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number: ");		
			int number = scanner.nextInt();
			
			System.out.print("Enter power: ");		
			int power = scanner.nextInt();
			int result = 1;
			for (int i=0;i<power;i++) {
				result *= number;
			}
			System.out.print(result);
		} catch (Exception e) {
			System.out.println("Invalid Input Detected, Error: " + e);
		}
		scanner.close();
    }
}