import java.util.Scanner;
import static java.lang.System.out;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            double[] numbers = new double[10];
            double total = 0.0;
            int i = 0;
            while (true) {
                out.print("Enter Number " + (i++) + "> ");
                if (i == numbers.length) {
                    out.println("Array is full.");
                    i=0;
                    break;
                }
                numbers[i] = scanner.nextInt();
                if (numbers[i] > 0) {
                    out.println("You've entered a positive number.");
                }  else if (numbers[i] == 0 || numbers[i] < 0) {
                    out.println("Exiting ...");
                    i=0;
                    break;
                }
            }
            for (i=0;i<numbers.length;i++) {
                total += numbers[i];
            }
            out.println("The sum of the numbers is " + total);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}