package FirstClass.Method;

public class Overloading {

    public static void main(String[] args) {
        int newScore = calculateScre("Tim", 500);
        System.out.println("new score is " + newScore);

        calculateScre(75);

    }

    public static int calculateScre(String PlayerName, int score) {
        System.out.println("Player " + PlayerName + " Scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScre(int score) {
        System.out.println("Unnamed player Scored " + score + " points");
        return score * 1000;

    }

}
