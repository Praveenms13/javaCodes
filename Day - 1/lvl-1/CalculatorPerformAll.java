import java.util.Scanner;

public class Calculator__ {
    int num1;
    int num2;
    int add() {
        return (num1 + num2);
    }
    int sub() {
        return (num1 - num2);    
    }
    int multiply() {
        return (num1 * num2);    
    }
    int division() {
        if (num2 != 0) {
            return (num1 / num2);
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
}

public class CalculatorPerformAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator__ myCalculator = new Calculator__();    
        System.out.print("Enter num1: ");
        myCalculator.num1 = scanner.nextInt();       
        System.out.print("Enter num2: ");
        myCalculator.num2 = scanner.nextInt();
        int add = myCalculator.add();
        int sub = myCalculator.sub();
        int multiply = myCalculator.multiply();
        int division = myCalculator.division();
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + myCalculator.num1 + " and " + myCalculator.num2 + " is " + add + " , " + sub + " , " + multiply + " , and  " + division);
        scanner.close();
    }
}