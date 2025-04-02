import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
		if (number >= 0){
			int sumOfNaturalNumber = number * (number + 1) / 2;
			System.out.print("The sum of " + number + " natural numbers is " + sumOfNaturalNumber + "\n");
		} else {
			System.out.print("The Number " + number + "is not a natural number\n");
		}
		scanner.close();
    }
}
