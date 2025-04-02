import java.util.*;
public class program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a number to find the factorial: ");		
			int factNum = scanner.nextInt();
			int result = 1;
			for (int i = 1; i <= factNum; i ++){
				result = result * i;
			}
			System.out.print(result);		
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}