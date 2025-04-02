import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter number: ");		
			int number = scanner.nextInt();
			if (number <= 0){
				System.out.println("Invalid Input Detected ...");
				System.exit(0);
			} 
			for (int i = 1;i < number;i++){
				if (number%i==0){
					System.out.println("Number "+number+" is perfectly divisible by " + i);
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}