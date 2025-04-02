import java.util.*;
public class program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a number to find the factorial: ");		
			int factNum = scanner.nextInt();
			int i = 1;
			int result = 1;
			while (i <= factNum){
				result = result * i;
				i++;
			}
			System.out.print(result);		
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}