package FirstClass.Statements;

public class whileLoopChallenge {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;

            System.out.println("Even number " + number);
            if (!isEvennumber(number)) {
                continue;
            }
        }

    }

    public static boolean isEvennumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;

        }
    }

}
