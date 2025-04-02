import java.util.Scanner;
import static java.lang.System.out;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            int[] numbers = new int[5];
            for (int i = 0; i < numbers.length; i++) {
                out.print("Enter Number " + (i+1) + "> ");
                numbers[i] = scanner.nextInt();
                if (numbers[i] < 0) {
                    out.println("You've entered a negative number.");
                } else if (numbers[i] > 0) {
                    out.println("You've entered a positive number.");
                    if (numbers[i] % 2 == 0) {
                        out.println("You've entered an even number.");
                    } else {
                        out.println("You've entered an odd number.");
                    }
                }  else if (numbers[i] == 0) {
                    out.println("You've entered a 0.");
                }
            }
            if (numbers[0] == numbers[numbers.length - 1]) {
                out.println("The first and last elements are equal.");
            } else if (numbers[0] > numbers[numbers.length - 1]) {
                out.println("The first element is greater than the last element.");
            } else {
                out.println("The first element is lesser than the last element.");
            }
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}