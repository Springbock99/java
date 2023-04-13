package FirstClass.KeywordsCodebkocks;

public class main {

    public static void main(String[] args) {

        calculatescore(true, 800, 5, 100);
        calculatescore(true, 10000, 8, 200);

    }

    public static int calculatescore(boolean gameOver, int score, int levelComplete, int bonus) {

        int finalscore = score;

        if (gameOver) {
            finalscore += (levelComplete * bonus);
            finalscore += 1000;
            System.out.println("your final score is " + finalscore);

        }

        return 5;

    }
}
