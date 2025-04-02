import java.util.*;
public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
		if (age >= 18){
			System.out.print("The person's age is " + age + " and can vote.\n");
		} else {
			System.out.print("The person's age is " + age + " and cannot vote.\n");
		}
		scanner.close();
    }
}
