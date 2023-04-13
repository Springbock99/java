package FirstClass.Statements;

public class primemethod {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + "is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Found 3 - exiting for the loop ");
                    break;

                }
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);

        }
        for (int diviser = 2; diviser < wholeNumber; diviser++) {
            if (wholeNumber % diviser == 0) {
                return false;
            }
        }

        return true;

    }
}
