import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Chocolates: ");
        int noOfChocolates = scanner.nextInt();
        System.out.print("Enter No of Childreb: ");
        int noOfChildren = scanner.nextInt();
        int chocolatesPerChild = noOfChocolates / noOfChildren;
        int remainingChocolates = noOfChocolates % noOfChildren;
        System.out.println("The Number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        scanner.close();
    }
}
