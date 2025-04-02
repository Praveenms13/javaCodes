import java.util.Scanner;

public class Calculator__ {
    int num1;
    int num2;
    void add() {
        System.out.println("The Sum of " + num1 + " and " + num2 + " = " + (num1 + num2));
    }
    void sub() {
        System.out.println("The Subtraction of " + num1 + " and " + num2 + " = " + (num1 - num2));
    }
    void multiply() {
        System.out.println("The Multiplication of " + num1 + " and " + num2 + " = " + (num1 * num2));
    }
    void division() {
        if (num2 != 0) {
            System.out.println("The Division of " + num1 + " and " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator__ myCalculator = new Calculator__();    
        System.out.print("Enter num1: ");
        myCalculator.num1 = scanner.nextInt();       
        System.out.print("Enter num2: ");
        myCalculator.num2 = scanner.nextInt();
        System.out.println("Enter Operator To Do Calculation: \n1. +\n2. -\n3. *\n4. /");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                myCalculator.add();
                break;
            case '-':
                myCalculator.sub();
                break;
            case '*':
                myCalculator.multiply();
                break;
            case '/':
                myCalculator.division();
                break;
            default:
                System.out.println("Invalid operator!");
        }
        scanner.close();
    }
}