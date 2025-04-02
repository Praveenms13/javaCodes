import static java.lang.System.out;
import java.util.Scanner;
public class CalculateFootBallPlayersData {
    public static void main(String args[]){
        CalculateFootBallPlayersData calculateFootBallPlayersDataObj = new CalculateFootBallPlayersData();
        try {
            int[] heights = new int[11];
            for (int i : heights) {
                heights[i] = (int)(Math.random()*101) + 150;
            }
            out.println("Sum of all the elements: " + calculateFootBallPlayersDataObj.sum(heights));
            out.printf("Mean the elements: %.2f%n", calculateFootBallPlayersDataObj.mean(heights));
            out.println("Shortest of all elements: " + calculateFootBallPlayersDataObj.shortest(heights));
            out.println("Tallest of all elements: " + calculateFootBallPlayersDataObj.tallest(heights));
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }
    public int sum(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
    public float mean(int[] arr){
        float mean;
        float sum = 0;
        float numberOfElements = 0;
        for (int i : arr){
            sum += i;
            numberOfElements++;
        }
        mean = sum / numberOfElements;
        return mean;
    }
    public int shortest(int[] arr){
        int shortest = Integer.MAX_VALUE;
        for (int i:arr){
            if (shortest > i){
                shortest = i;
            }
        }
        return shortest;
    }
    public int tallest(int[] arr){
        int tallest = Integer.MIN_VALUE;
        for (int i:arr){
            if (tallest < i){
                tallest = i;
            }
        }
        return tallest;
    }
}