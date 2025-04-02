import java.util.Scanner;

public class volumeOfEarth {
    public static void main(String[] args) {
        int radiusOfTheEarth = 6378;
        double cubicKilometer = (4.0/3.0) * Math.PI * Math.pow(radiusOfTheEarth, 3);
        double cubicMiles = cubicKilometer * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is " + cubicKilometer + " and cubic miles is " + cubicMiles);
    }
}