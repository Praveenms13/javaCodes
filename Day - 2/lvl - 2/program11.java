import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number: ");		
			int number = scanner.nextInt();
			if (number <= 0 || number >= 100){
				System.out.println("Invalid Data Detected !!");
				System.exit(0);
			}
			for (int i = number - 1;i>=1;i--) {
				if (number%i==0){
					System.out.println("Number " + number + " is Perfectly Divides with "+i);
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected, Error: " + e);
		}
		scanner.close();
    }
}