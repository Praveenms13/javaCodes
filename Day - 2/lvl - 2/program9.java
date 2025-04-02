import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number: ");		
			int number = scanner.nextInt();
			int greatestFactor = 0;
			for (int i = number - 1;i>=1;i--) {
				if (number%i==0){
					greatestFactor = i;
					break;
				}
			}
			System.out.println(greatestFactor);
		} catch (Exception e) {
			System.out.println("Invalid Input Detected, Error: " + e);
		}
		scanner.close();
    }
}