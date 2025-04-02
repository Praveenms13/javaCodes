import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {      
            out.print("Enter a natural nummber: ");
            int naturalNumber = scanner.nextInt();
            if (naturalNumber <= 0){
                out.print("Please enter a positive number");
                System.exit(0);
            }
            out.print(sumOfNaturalNumber(naturalNumber));
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
        scanner.close();
    }
    static int sumOfNaturalNumber(int naturalNumber) {
        return (naturalNumber * (naturalNumber+1)) / 2;
    }
}

