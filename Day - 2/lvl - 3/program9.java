import java.util.Scanner;
import static java.lang.System.out;
public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter the number to check if it is a Abundant or not: ");
			int number = scanner.nextInt();
			if (number <= 1) {
				out.print("Please input the number that shld be greater than 1.");
				System.exit(0);
			}
			int sum = 0;
			for (int i=1;i<number;i++){
				if (number%i==0){
					sum += i;
				}
			}
			if (sum > number) {
				out.print("The Given Number is a Abundant Number");
			} else {
				out.print("The Given Number is not a Abundant Number");
			}
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}