import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = (userWins / (double) totalGames) * 100;
        double computerWinPercentage = (computerWins / (double) totalGames) * 100;
        return new String[][]{
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"User Win %", String.format("%.2f", userWinPercentage)},
            {"Computer Win %", String.format("%.2f", computerWinPercentage)}
        };
    }

    public static void displayResults(String[][] results, int totalGames) {
        System.out.println("Game Results:");
        System.out.println("--------------------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        System.out.println("Total Games Played: " + totalGames);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numGames = scanner.nextInt();
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.next();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + (winner.equals("Draw") ? "It's a Draw!" : winner));
            
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }
        
        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(stats, numGames);
        scanner.close();
    }
}
