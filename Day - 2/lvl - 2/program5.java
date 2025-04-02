import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a positive integer: ");		
			int number = scanner.nextInt();
			if (number<0){
				System.out.println("Feed the positive values only ...");
				System.exit(0);
			}
			int i = 0;
			while (i<=number){
				if (i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				} else if (i%3==0){
					System.out.println("Fizz");
				} else if (i%5==0){
					System.out.println("Buzz");
				}
				i++;
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}