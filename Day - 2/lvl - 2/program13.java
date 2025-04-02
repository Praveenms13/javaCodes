import java.util.Scanner;
public class program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number: ");		
			int number = scanner.nextInt();
			if (number <= 0 || number >= 100){
				System.out.println("Invalid Data Detected !!");
				System.exit(0);
			}
			int counter = number - 1;
			while (counter!=0) {
				if (number%counter==0){
					System.out.println("Number " + number + " is Perfectly Divides with "+counter);
				}
				counter--;
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected, Error: " + e);
		}
		scanner.close();
    }
}