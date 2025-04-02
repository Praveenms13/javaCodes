
import static java.lang.System.out;
import java.util.Scanner;

public class program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            int count = 0;
            int originalNumber = number;
            while (number != 0) {
                number /= 10;
                count++;
            }
            int[] digits = new int[count];
            int[] frequency = new int[10];
            while (originalNumber != 0) {
                int og = originalNumber % 10;
                frequency[og]++;
                originalNumber /= 10;
            }
            for (int i = 0; i < 10; i++) {
                out.println("Frequency of " + i + " => " + frequency[i]);
            }
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        } finally {
            scanner.close();
        }
    }
}
