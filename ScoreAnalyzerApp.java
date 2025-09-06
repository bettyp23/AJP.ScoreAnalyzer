// ScoreAnalyzerApp.java
import java.util.Scanner;

public class ScoreAnalyzerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreAnalyzer analyzer = new ScoreAnalyzer();
        double input;

        // Collect scores
        while (true) {
            System.out.print("Enter student score (0–100), or -1 to finish: ");
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                if (input == -1) break;
                if (input >= 0 && input <= 100) {
                    analyzer.addScore(input);
                } else {
                    System.out.println("Invalid score. Please enter 0–100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Display results
        System.out.printf("\nAverage Score: %.2f%n", analyzer.calculateAverage());
        System.out.printf("Minimum Score: %.2f%n", analyzer.getMinScore());
        System.out.printf("Maximum Score: %.2f%n", analyzer.getMaxScore());
        analyzer.printScoreDistribution();

        scanner.close();
    }
}