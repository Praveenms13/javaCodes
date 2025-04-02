import static java.lang.System.out;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter the number: ");
            int number = scanner.nextInt();
            out.print(checkNumber(number));
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    static int checkNumber(int number) {
        if (number < 0){
            return -1;
        } else if (number > 0){
            return 1;
        } else {
            return 0;
        }
    }
}