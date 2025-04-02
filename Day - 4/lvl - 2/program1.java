import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter Number: ");
            int number = scanner.nextInt();
            findFactors(number);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    public static void findFactors(int number) {
        int count = 0;
        for (int i = 1;i <= number;i++){
            if (number%i==0){
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1;i <= number;i++){
            if (number%i==0){
                factors[index] = i;
                index++;
            }
        }
        out.print("Factors: ");
        for (int i=0;i<factors.length;i++){
            out.print(factors[i]+ " ");
        }
        out.println();
        out.println("Sum of the Factors: " + findSum(factors));
        out.println("Sum of square of Factors: " + findSumOfSquareOfFactors(factors));
        out.println("Product of Factors: " + findProductOfTheFactors(factors));
    }
    public static int findSum(int[] factors){
        int sum = 0;
        for (int i=0;i<factors.length;i++){
            sum += factors[i];
        }
        return sum;
    } 
    public static int findSumOfSquareOfFactors(int[] factors){
        int sum = 0;
        for (int i=0;i<factors.length;i++){
            sum += factors[i] * factors[i];
        }
        return sum;
    }
    public static int findProductOfTheFactors(int[] factors) {
        int product = 1; 
        for (int i = 0; i < factors.length; i++) { 
            product *= factors[i];
        }
        return product;
    }
}