import java.util.Scanner;
import static java.lang.System.out;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            out.print("Enter a positive number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                out.println("Please enter a positive number.");
                return;
            }

            String[] data = new String[number];

            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    data[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    data[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    data[i - 1] = "Buzz";
                } else {
                    data[i - 1] = Integer.toString(i);
                }
            }

            for (String s : data) {
                out.println(s);
            }
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        } finally {
            scanner.close();
        }
    }
}
