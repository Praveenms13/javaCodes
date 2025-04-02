import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker  {
    public static void main(String args[]){
        try {
           int number = 12345;
           NumberChecker numberCheckerObj = new NumberChecker();
           int totalCount = numberCheckerObj.findCount(number);
           int[] storedDigitsArray = numberCheckerObj.storeDigits(number, totalCount);
           int[] reversedArray = numberCheckerObj.reverseArray(storedDigitsArray);
           out.println("Is Array Same: " + numberCheckerObj.arrayIsEqual(storedDigitsArray, reversedArray));
           out.println("Is Palindrome: " + numberCheckerObj.isPalindrome(storedDigitsArray));
           out.println("Is Duck Number: " + numberCheckerObj.isDuckNumber(storedDigitsArray));
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
        int index = count - 1;
        while(num != 0 && index >= 0){
            digitsArray[index] = num % 10;
            num /= 10;
            index--;
        }
        return digitsArray;
    }
    public int[] reverseArray(int arr[]){
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }
    public boolean arrayIsEqual(int arr1[], int arr2[]){
        return Arrays.equals(arr1, arr2);
    }
    public boolean isPalindrome(int[] digitsArray) {
        int left = 0;
        int right = digitsArray.length - 1;
        
        while (left < right) {
            if (digitsArray[left] != digitsArray[right]) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
    public boolean isDuckNumber(int[] digitsArray) {
        for (int i = 1; i < digitsArray.length; i++) { 
            if (digitsArray[i] == 0) {
                return true; 
            }
        }
        return false;  
    }
}