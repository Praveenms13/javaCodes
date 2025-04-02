import static java.lang.System.out;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int size = 4;
            RandomArray randomArray = new RandomArray();
            double[] result = randomArray.findAverageMinMax(randomArray.generate4DigitRandomArray(size));
            out.println("Minimum Value: " + result[0]);
            out.println("Maximum Value: " + result[1]);
            out.println("Average Value: " + result[2]);       
        } catch (Exception e) {
            out.println("Error occurred: " + e);
        }
        scanner.close();
    }
    public int[] generate4DigitRandomArray(int size){
        int[] randomDigit = new int[size];
        for (int i=0;i<size;i++){
            randomDigit[i] = (int)(Math.random()*9000) + 1000;
        }
        return randomDigit;
    }
    public double[] findAverageMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double average = 0;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
            average += numbers[i];
        }
        average = average / numbers.length;
        return new double[]{min, max, average};
    }
}
