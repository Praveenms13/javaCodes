import static java.lang.System.out;
import java.util.Scanner;
public class NumberChecker  {
    public static void main(String args[]){
        try {
           int number = 121;
           NumberChecker numberCheckerObj = new NumberChecker();
           int totalCount = numberCheckerObj.findCount(number);
           int[] storedDigitsArray = numberCheckerObj.storeDigits(number, totalCount);
           int sumOfDigits = numberCheckerObj.sumOfTheDigits(storedDigitsArray);
           out.println("Sum of Digits: " + sumOfDigits);
           out.println("Sum Of Square Of Digits: " + numberCheckerObj.sumOfSquareOfDigits(storedDigitsArray));
           out.println(numberCheckerObj.isHarshadNumber(number, sumOfDigits) ? "Yes, the number is a harshad number." : "No, the number is not a harshad number.");
           numberCheckerObj.checkFrequency(storedDigitsArray);
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }
    public int findCount(int num){
        int count = 0;
        while (num!=0){
            num/=10;
            count++;
        }
        return count;
    }
    public int[] storeDigits(int num, int count) {
        int[] digitsArray = new int[count];
        int index = 0;
        while(num != 0){
            digitsArray[index] = num % 10;
            num /= 10;
            index++;
        }
        return digitsArray;
    }
    public int sumOfTheDigits(int[] storedDigitsArray){
        int sum = 0;
        for (int i=0;i<storedDigitsArray.length;i++){
            sum += storedDigitsArray[i];
        }
        return sum;
    }
    public int sumOfSquareOfDigits(int[] storedDigitsArray){
        int sum = 0;
        for (int i=0;i<storedDigitsArray.length;i++){
            sum += Math.pow(storedDigitsArray[i], 2);
        }
        return sum;
    }
    public boolean isHarshadNumber(int num, int sum){
        return num % sum == 0;
    }
    public void checkFrequency(int[] storedDigitsArray){
        int[][] frequency2d = new int[storedDigitsArray.length][2];
        int[] unique = new int[storedDigitsArray.length];
        for (int i=0;i<storedDigitsArray.length;i++){
            frequency2d[i][0] = storedDigitsArray[i];
            frequency2d[i][1] = 0;
            for (int j=0;j<storedDigitsArray.length;j++){
                if (storedDigitsArray[i] == storedDigitsArray[j]){
                    frequency2d[i][1]++; 
                }
            }
        }
        for (int i=0;i<frequency2d.length;i++){
            for (int j=0;j<2;j++){
                out.print(frequency2d[i][j] + " ");
            }
            out.println();
        }
    }
}