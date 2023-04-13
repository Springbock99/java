package FirstClass.Statements;

public class digitSumChallenge {

    public static void main(String[] args) {

        int Return = sumDigits(1293747993);
        System.out.println(Return);

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;

        } else {
            while (number > 0) {

                int remainder = number % 10;
                number = number / 10;
                sum += remainder;

            }
            return sum;

        }
    }

}
