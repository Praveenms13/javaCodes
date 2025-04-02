import static java.lang.System.out;
import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            out.print("Enter the value of a: ");
            int a = scanner.nextInt();
            out.print("Enter the value of b: ");
            int b = scanner.nextInt();
            out.print("Enter the value of c: ");
            int c = scanner.nextInt();
            CalculateQuadratic(a, b, c);
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        }
        scanner.close();
    }
    public static void CalculateQuadratic(int a, int b, int c){
        int delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            out.println("Roots: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            out.println("Single root: " + root);
        } else if (delta < 0) {
            out.print("No real roots");
        }
    }
}
