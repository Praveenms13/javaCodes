import java.util.*;
public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int number = scanner.nextInt();
		System.out.print("Is the first " + number + " divisible by 5 ? " + (number % 5 == 0));
        scanner.close();
    }
}
