import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter your Bonus: ");
        int bonus = scanner.nextInt();
        int total = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + total);
        scanner.close();
    }
}
