import java.util.ArrayList;

public class ScoreAnalyzer {

    private ArrayList<Double> scores; // List to store student scores

    // Constructor
    public ScoreAnalyzer() {
        scores = new ArrayList<>();
    }

    // Add a score to the list
    public void addScore(double score) {
        if (score >= 0 && score <= 100) {
            scores.add(score);
        } else {
            System.out.println("Score must be between 0 and 100.");
        }
    }

    // Calculate average
    public double calculateAverage() {
        if (scores.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    // Get minimum score
    public double getMinScore() {
        if (scores.isEmpty()) return 0.0;
        double min = scores.get(0);
        for (double score : scores) {
            if (score < min) min = score;
        }
        return min;
    }

    // Get maximum score
    public double getMaxScore() {
        if (scores.isEmpty()) return 0.0;
        double max = scores.get(0);
        for (double score : scores) {
            if (score > max) max = score;
        }
        return max;
    }

    // Print histogram-style score distribution
    public void printScore() {
        int below60 = 0, sixty69 = 0, seventy79 = 0, eighty89 = 0, ninety100 = 0;

        for (double score : scores) {
            if (score < 60) below60++;
            else if (score < 70) sixty69++;
            else if (score < 80) seventy79++;
            else if (score < 90) eighty89++;
            else ninety100++;
        }

        System.out.println("\nScore Distribution:");
        System.out.println("90–100: " + "*".repeat(ninety100));
        System.out.println("80–89 : " + "*".repeat(eighty89));
        System.out.println("70–79 : " + "*".repeat(seventy79));
        System.out.println("60–69 : " + "*".repeat(sixty69));
        System.out.println("Below 60: " + "*".repeat(below60));
    }
}