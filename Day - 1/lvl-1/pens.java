import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int remainingPens = pens % students;
        int split = pens - remainingPens;
        System.out.println("The Pen Per Student is "+ split +" and the remaining pen not distributed is " + remainingPens);
    }
}