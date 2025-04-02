import java.util.*;
public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter counter shld start with: ");			
			int counter = scanner.nextInt();
			for (int i = counter;i > 0;i--){
				System.out.print(i + "\n");
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}
