import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter Number: ");
            int number = scanner.nextInt();
            if (number <= 0){
                out.println("Only Natural Number is accepted.");
                System.exit(0);
            }
            out.println("Sum of Natural Number with recursion: " + sumOfNNaturalNumber(number));
            out.println("Sum of Natural Number with formula: " + sumOfNNaturalNumberUsingFormulae(number));
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    public static int sumOfNNaturalNumber(int number){
        if (number == 0){
            return 0;
        }
        return number + sumOfNNaturalNumber(number - 1);
    } 
    public static int sumOfNNaturalNumberUsingFormulae(int number){
        return number * (number + 1) / 2;
    } 
}