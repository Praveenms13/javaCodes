import static java.lang.System.out;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            int calculatedMaximumNoOfHandshakes = calculateMaximumNoOfHandshakes();
            out.print(calculatedMaximumNoOfHandshakes);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    static int calculateMaximumNoOfHandshakes() {
        Scanner scanner = new Scanner(System.in);
        out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
}