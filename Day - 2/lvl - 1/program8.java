import java.util.*;
public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter counter shld start with: ");
			int counter = scanner.nextInt();
			while (counter != 0){
				System.out.print(counter --);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}
