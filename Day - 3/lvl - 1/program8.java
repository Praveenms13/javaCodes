import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;
public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
            out.print("Enter a number> ");
            int number = scanner.nextInt();
            int maxFactor = 10;
            int[] factors = new int[maxFactor];
            // int[] temp = new int[];
            out.print("The Factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) {
                if (i == maxFactor) {
                    maxFactor += maxFactor;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                if (number%i==0){
                    out.print(i + ", ");
                }
            }
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}