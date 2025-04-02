import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a positive integer: ");		
			int number = scanner.nextInt();
			if (number<0){
				System.out.println("Feed the positive values only ...");
				System.exit(0);
			}
			for (int i = 0; i <= number; i++){
				if (i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				} else if (i%3==0){
					System.out.println("Fizz");
				} else if (i%5==0){
					System.out.println("Buzz");
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}