import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter number 1: ");
            int number1 = scanner.nextInt();
            out.print("Enter number 2: ");
            int number2 = scanner.nextInt();
            out.print("Enter number 3: ");
            int number3 = scanner.nextInt();
            if (number1 <= 0 || number2 <= 0 || number3 <= 0){
                out.print("Please enter a positive number");
                System.exit(0);
            }
            int[] result = findSmallestAndLargest(number1, number2, number3);
            out.println("Smallest Number: " + result[0]);
            out.println("Largest Number: " + result[1]);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int largest, smallest;
        if (number1 > number2 && number1 > number3){
            largest = number1;
        } else if (number2 > number1 && number2 > number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        if (number1 < number2 && number1 < number3){
            smallest = number1;
        } else if (number2 < number1 && number2 < number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }
        return new int[]{smallest, largest};
    }
}