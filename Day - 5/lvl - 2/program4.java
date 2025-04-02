import java.util.Scanner;

public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Str1: ");
        String str1 = scanner.nextLine();
        
        int length = findLengthOfTheString(str1);
        System.out.println("Calculated Length: " + length);

        String[] result = splitWithoutSplit(str1, length);
        System.out.println("After Splitting the words: ");
        for (String word : result) {
            System.out.println(word);
        }
        String[][] arr = return2DArray(result);
        System.out.println("2D Array as follows: ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i][0] + " " + Integer.parseInt(arr[i][1]));
        }
        int[] shortestLargest = findLargestAndShortest(arr);
        System.out.println("Shortest: " + shortestLargest[0]);
        System.out.println("Largest: " + shortestLargest[1]);
        scanner.close();
    }

    public static int findLengthOfTheString(String str1) {
        int count = 0;
        try {
            while (true) {
                str1.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWithoutSplit(String str1, int stringCount) {
        int wordCount = 1;
        for (int i = 0; i < stringCount; i++) {
            if (str1.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] arr = new String[wordCount];
        int wordStart = 0, wordIndex = 0;
        for (int i = 0; i < stringCount; i++) {
            if (str1.charAt(i) == ' ') {
                arr[wordIndex++] = str1.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        arr[wordIndex] = str1.substring(wordStart);
        return arr;
    }
    public static String[][] return2DArray(String[] str1) {
        String[][] arr = new String[str1.length][2];
        for (int i=0;i<str1.length;i++) {
            arr[i][0] = str1[i];
            arr[i][1] = String.valueOf(str1[i].length());
        }
        return arr;
    }
    public static int[] findLargestAndShortest(String[][] arr){
        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (Integer.parseInt(arr[i][1]) < result[0]) {
                result[0] = Integer.parseInt(arr[i][1]);
            }

            if (Integer.parseInt(arr[i][1]) > result[1]) {
                result[1] = Integer.parseInt(arr[i][1]);
            }
        }
        return result;
    }
}
