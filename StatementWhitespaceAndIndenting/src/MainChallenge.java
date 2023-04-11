public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 8000000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        calculateScore(true, 800, levelCompleted, bonus);
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
