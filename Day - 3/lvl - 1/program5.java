import java.util.Scanner;
import static java.lang.System.out;
public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            int number;
            out.print("Enter a number> ");
            number = scanner.nextInt();
            int[] multiplicationTable = new int[4];
            int multiplier = 6;
            for (int i = 0; i < multiplicationTable.length; i++) {
                multiplicationTable[i] = number * (multiplier);
                multiplier++;
            }
            for (int i = 0; i < multiplicationTable.length; i++) {
                out.println(number + " * " + (i + 6) + " = " + multiplicationTable[i]);
            }

		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}