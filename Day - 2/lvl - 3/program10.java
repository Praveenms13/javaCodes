import java.util.Scanner;
import static java.lang.System.out;

public class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            out.print("Enter number 1: ");
            double number1 = scanner.nextDouble();

            out.print("Enter number 2: ");
            double number2 = scanner.nextDouble();
			
            out.print("+, -, /, *\n");
            out.print("Select the operator: ");
            String oper = scanner.next(); 
            double result;
            switch (oper) {
                case "+":
                    result = number1 + number2;
                    out.println("Result: " + result);
                    break;
                case "-":
                    result = number1 - number2;
                    out.println("Result: " + result);
                    break;
                case "*":
                    result = number1 * number2;
                    out.println("Result: " + result);
                    break;
                case "/":
                    if (number2 == 0) {
                        out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = number1 / number2;
                        out.println("Result: " + result);
                    }
                    break;
                default:
                    out.println("Invalid Operator. Please enter +, -, * or /.");
            }
        } catch (Exception e) {
            out.println("Error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
