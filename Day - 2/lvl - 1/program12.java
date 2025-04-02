import java.util.*;
public class program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter a natural number : ");		
			int naturalNumber = scanner.nextInt();
			int sumOfNaturalNumbersWithLoop = 0;
			if (naturalNumber >= 0){
				int i = 0;
				while (i <= naturalNumber) {
					sumOfNaturalNumbersWithLoop += i;
					i++;
				}
			} else {
				System.out.print("The given number is not a natural number.");
			}
			int sumOfNaturalNumbersWithoutLoop = naturalNumber * (naturalNumber+1) / 2;
			System.out.println("Sum Of Natural Numbers with Loop: " + sumOfNaturalNumbersWithLoop);
			System.out.println("Sum Of Natural Numbers without Loop: " + sumOfNaturalNumbersWithoutLoop);
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}