import static java.lang.System.out;
import java.util.Scanner;
import java.time.*; 
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
            out.print("Enter number 1: ");
            int number1 = scanner.nextInt();
            out.print("Enter number 2: ");
            int number2 = scanner.nextInt();
            out.print("Enter number 3: ");
            int number3 = scanner.nextInt();
            out.println("Smallest Number: " + smallestNumber(number1, number2, number3));
            out.println("Largest Number: " + largestNumber(number1, number2, number3));
        } catch (Exception e) {
			out.printf("Error occurred" + e);
		}
		scanner.close();
    }
    public static int smallestNumber(int number1, int number2, int number3) {
        int smallest = 0;
        if (number1 < number2 && number1 < number3){
            smallest = number1;
        } else if (number2 < number1 && number2 < number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }
        return smallest;
    }
    public static int largestNumber(int number1, int number2, int number3) {
        int largest = 0;
        if (number1 > number2 && number1 > number3){
            largest = number1;
        } else if (number2 > number1 && number2 > number3) {
            largest = number2;
        } else {
            largest = number3;
        }
        return largest;
    }
}