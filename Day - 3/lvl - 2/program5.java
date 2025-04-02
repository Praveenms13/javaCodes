
import static java.lang.System.out;
import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter the number: ");
            int number = scanner.nextInt();
            int originalNumber = number;
            int countOfTheNumber = 0;
            int index = 0;
            while (number != 0){
                number /= 10;
                countOfTheNumber++;
            }
            int[] digits = new int[countOfTheNumber];
            while (originalNumber != 0) {
                digits[index] = originalNumber%10;
                originalNumber /= 10;
                // out.print(digits[index]);
                index++;
            }
            for (int i = 0; i < digits.length; i++) {
                out.print(digits[i] + " ");
            }
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
