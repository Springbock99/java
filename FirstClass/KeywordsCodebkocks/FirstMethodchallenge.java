package FirstClass.KeywordsCodebkocks;

public class FirstMethodchallenge {

    public static void main(String[] args) {

        int highscorePosition = calculateHighScorePosition(1500);
        displayhighscoreposition("kent", highscorePosition);
    }

    public static void displayhighscoreposition(String Playername, int highscorePosition) {
        System.out
                .println(Playername + " managed to get into position " + highscorePosition + "  on the highscorelist");
    }

    public static int calculateHighScorePosition(int PlayerScore) {

        if (PlayerScore >= 1000) {
            return 1;
        } else if (PlayerScore >= 500 && PlayerScore < 1000) {
            return 2;
        } else if (PlayerScore >= 100 && PlayerScore < 500) {
            return 3;

        } else {
            return 4;
        }

    }

}
