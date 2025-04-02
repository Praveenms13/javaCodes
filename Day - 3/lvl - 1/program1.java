import java.util.Scanner;
import static java.lang.System.out;
public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                out.print("Enter Student " + (i+1) + "'s age> ");
                numbers[i] = scanner.nextInt();
                if (numbers[i] < 0) {
                    out.println("Invalid age");
                } else if (numbers[i] >= 18) {
                    out.println("The student with the age " + numbers[i] + " can vote.");
                } else {
                    out.println("The student with the age " + numbers[i] + " cannot vote.");
                }
            }
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}