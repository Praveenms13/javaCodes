import static java.lang.System.out;
import java.util.Scanner;
public class NumberChecker  {
    public static void main(String args[]){
        try {
           int number = 1742589;
           NumberChecker numberCheckerObj = new NumberChecker();
           int totalCount = numberCheckerObj.findCount(number);
           int[] storedDigitsArray = numberCheckerObj.storeDigits(number, totalCount);
           out.println(numberCheckerObj.isDuckNumber(storedDigitsArray) ? "Yes, the number is a duck number." : "No, the number is not a duck number.");
           out.println(numberCheckerObj.isArmstrong(storedDigitsArray, number) ? "Yes, the number is a amstrong number." : "No, the number is not a amstrong number.");
           out.println("Largest: " + numberCheckerObj.findLargestAndSecondLargest(storedDigitsArray)[0] + "\nSecond Largest: " + numberCheckerObj.findLargestAndSecondLargest(storedDigitsArray)[1] + "\n");
           out.println("Smallest: " + numberCheckerObj.findSmallestAndSecondSmallest(storedDigitsArray)[0] + "\nSecond Smallest: " + numberCheckerObj.findSmallestAndSecondSmallest(storedDigitsArray)[1]);
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
    public boolean isDuckNumber(int[] storedDigitsArray){
        boolean isDuck = false;
        for (int i=0;i<storedDigitsArray.length;i++){
            if (storedDigitsArray[i] == 0){
                isDuck=true;
                break;
            }
        }
        return isDuck;
    }
    public boolean isArmstrong(int[] storedDigitsArray, int num){
        int rootedSum = 0;
        for (int i=0;i<storedDigitsArray.length;i++){
            rootedSum += Math.pow(storedDigitsArray[i], storedDigitsArray.length);
        }
        return rootedSum == num;
    } 
    public int[] findLargestAndSecondLargest(int[] storedDigitsArray){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : storedDigitsArray){
            if (i > largest){
                secondLargest = largest;
                largest = i;
            }
            else if (i > secondLargest && i < largest){
                secondLargest = i;
            }
        }
        return new int[] {largest, secondLargest};
    }
    public int[] findSmallestAndSecondSmallest(int[] storedDigitsArray){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i : storedDigitsArray){
            if (i < smallest){
                secondSmallest = smallest;
                smallest = i;
            }
            else if (i < secondSmallest && i > smallest){
                secondSmallest = i;
            }
        }
        return new int[] {smallest, secondSmallest};
    }
}