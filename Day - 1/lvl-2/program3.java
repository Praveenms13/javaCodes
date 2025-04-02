import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter number for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter number for c: ");
        double c = scanner.nextDouble();
        double oper1 = a + b * c;
        double oper2 = a * b + c;
        double oper3 = c + a / b;
        double oper4 = a % b + c;
        System.out.print("The results of the operations are " + oper1 + ", " + oper2 + ", " + oper3 +", "+ oper4);
        scanner.close();
    }
}
