import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter number for c: ");
        int c = scanner.nextInt();
        int oper1 = a + b * c;
        int oper2 = a * b + c;
        int oper3 = c + a / b;
        int oper4 = a % b + c;
        System.out.println("The results of the operations are " + oper1 + ", " + oper2 + ", " + oper3 +", "+ oper4);
        scanner.close();
    }
}
