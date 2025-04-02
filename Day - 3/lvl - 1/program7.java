import java.util.Scanner;
import static java.lang.System.out;
public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
            out.print("Enter a number> ");
            int number = scanner.nextInt();
            int size = (number/2);
            // out.print(size);
            int[] oddArray = new int[size];
            int[] evenArray = new int[size];

            int evenCounter = 0;
            int oddCounter = 0;

            for (int i = 0;i < number;i++){
                if (i % 2 == 0) {
                    evenArray[evenCounter] = i;
                    evenCounter++;
                } else {
                    oddArray[oddCounter] = i;
                    oddCounter++;
                }
            }
            out.println("Even Numbers:");
            for (int i = 0;i < evenArray.length;i++){
                out.println(evenArray[i]);
            }
            out.println("Odd Numbers:");
            for (int i = 0;i < oddArray.length;i++){
                out.println(oddArray[i]);
            }
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}