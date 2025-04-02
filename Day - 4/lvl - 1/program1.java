import static java.lang.System.out;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            double calculatedInterest = calculateSimpleInterest();
            out.print(calculatedInterest);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    static double calculateSimpleInterest() {
        Scanner scanner = new Scanner(System.in);
        out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        out.print("Enter the time taken in yrs: ");
        double time = scanner.nextDouble();
        return ((principal * rate * time) / 100);
    }
}