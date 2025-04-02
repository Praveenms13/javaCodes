import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker  {
    public static void main(String args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter the number: ");
            int number = scanner.nextInt();
            NumberChecker numberCheckerObj = new NumberChecker();
            int[] factorsArray = numberCheckerObj.findFactors(number);
            int greatestfactor = numberCheckerObj.findGreatestFactor(factorsArray);
            int sumOfTheFactors = numberCheckerObj.sumOfTheFactors(factorsArray);
            int productOfTheFactors = numberCheckerObj.productOfTheFactors(factorsArray);
            int productOfCubeOfTheFactors = numberCheckerObj.productOfCubeOfTheFactors(factorsArray);
            out.println(numberCheckerObj.isPerfectNumber(factorsArray, number));
            out.println(numberCheckerObj.isAbundantNumber(factorsArray, number));
            out.println(numberCheckerObj.isDeficient(factorsArray, number));
            out.println(numberCheckerObj.isStrong(factorsArray, number));
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }

    public int[] findFactors (int num){
        int count=0;
        for (int i=1;i<num;i++){
            if (num%i == 0){
                count ++;
            }
        }
        int[] factorsArray = new int[count];
        int index = 0;
        for (int i=1;i<num;i++){
            if (num%i == 0){
                factorsArray[index] = i;
                index ++;
            }
        }
        return factorsArray;
    }
    public int findGreatestFactor(int[] factorsArray){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<factorsArray.length;i++){
            if (factorsArray[i] > max){
                max = factorsArray[i];
            }
        }
        return max;
    }
    public int sumOfTheFactors(int[] factorsArray) {
        int sum = 0;
        for (int i=0;i<factorsArray.length;i++){
            sum += factorsArray[i];
        }
        return sum;
    }
    public int productOfTheFactors(int[] factorsArray) {
        int product = 1;
        for (int i=0;i<factorsArray.length;i++){
            product *= factorsArray[i];
        }
        return product;
    }
    public int productOfCubeOfTheFactors(int[] factorsArray) {
        int product = 1;
        for (int i=0;i<factorsArray.length;i++){
            product *= Math.pow(factorsArray[i], 3);
        }
        return product;
    }
    public boolean isPerfectNumber(int[] factorsArray, int num){
        int sum = 0;
        for (int i=0;i<factorsArray.length;i++){
            sum += factorsArray[i];
        }
        return num == sum;
    }
    public boolean isAbundantNumber(int[] factorsArray, int num){
        int sum = 0;
        for (int i=0;i<factorsArray.length;i++){
            sum += factorsArray[i];
        }
        return sum > num;
    }
    public boolean isDeficient(int[] factorsArray, int num){
        int sum = 0;
        for (int i=0;i<factorsArray.length;i++){
            sum += factorsArray[i];
        }
        return sum < num;
    }
    public boolean isStrong(int[] factorsArray, int num){
        int sum = 0, originalNum = num;
        while (num > 0){
            int digit = num % 10;  
            sum += factorial(digit);
            num /= 10;  
        }
        return sum == originalNum;
    }

    private int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}