import static java.lang.System.out;
import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        try {
            for (int i = 0; i < numbers.length; i++) {
                out.printf("Enter number %d: ", (i + 1));
                numbers[i] = scanner.nextInt();
            }
            
            for (int num : numbers) {
                if (isPositive(num)) {
                    out.printf("%d is positive and %s.\n", num, isEven(num) ? "even" : "odd");
                } else {
                    out.printf("%d is negative.\n", num);
                }
            }
            
            int result = compare(numbers[0], numbers[numbers.length - 1]);
            if (result == 1) {
                out.println("First number is greater than the last number.");
            } else if (result == 0) {
                out.println("First and last numbers are equal.");
            } else {
                out.println("First number is less than the last number.");
            }
            
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        }
        scanner.close();
    }
    
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        return Integer.compare(number1, number2);
    }
}
