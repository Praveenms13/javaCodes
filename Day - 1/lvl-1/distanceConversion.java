import java.util.Scanner;

public class distanceConversion {
    public static void main(String[] args) {
        float milesValue = 1.6f;
        float distance = 10.8f;
        float distance2Miles = distance * milesValue;
        System.out.println("The distance " + distance + " km in miles is " + distance2Miles);
    }
}