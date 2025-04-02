import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        var name = scanner.nextLine();
        System.out.print("Enter From City: ");
        var fromCity = scanner.nextLine();
        System.out.print("Enter Via City: ");
        var viaCity = scanner.nextLine();
        System.out.print("Enter To City: ");
        var toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        var distanceFromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        var distanceViaTo = scanner.nextDouble();

        System.out.print("Enter the total time taken (in hours): ");
        var timeTaken = scanner.nextDouble();

        var totalDistance = distanceFromToVia + distanceViaTo;
        var averageSpeed = totalDistance / timeTaken;

        System.out.println("\nTravel Summary:");
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.printf("Total Time Taken: %.2f hours%n", timeTaken);
        System.out.printf("Average Speed: %.2f mph%n", averageSpeed);

        scanner.close();
    }
}
