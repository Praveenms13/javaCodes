import java.util.*;
public class program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a number: ");		
			int number = scanner.nextInt();
			for (int i = 1; i <= number; i++){
				if (i%2 == 0){
					System.out.println(i + " => Even");
				} else {
					System.out.println(i + " => Odd");
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}