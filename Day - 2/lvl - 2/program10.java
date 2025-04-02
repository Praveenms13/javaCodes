import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number: ");		
			int number = scanner.nextInt();
			int greatestFactor = 0;
			int i = 0;
			int counter = number - 1;
			while (counter != 0) {
				if (number%counter==0){
					greatestFactor = counter;
					break;
				}
				counter --;
			}
			System.out.println(greatestFactor);
		} catch (Exception e) {
			System.out.println("Invalid Input Detected, Error: " + e);
		}
		scanner.close();
    }
}