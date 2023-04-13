package FirstClass.Statements;

public class forLoop {

    public static void main(String[] args) {

        // for (int counter = 1; counter <= 5; counter++) {
        // System.out.println(counter);

        // }

        // for (double rate = 2.0; rate <= 5; rate++) {
        // double IntrestAmoint = calculateIntrest(10000, rate);
        // System.out.println("10,000 at " + rate + "% intrest = " + IntrestAmoint);
        // }

        // for (double i = 7.5; i <= 10; i += 0.25) {
        // double IntrestaAmoint = calculateIntrest(100, i);
        // System.out.println("100 at " + i + "% intrest = " + IntrestaAmoint);

        // }

        Car bmw = new Car(3);
        bmw.noise2();
        Car.noise();
    }

    public static double calculateIntrest(double amount, double Intresrate) {

        return (amount * (Intresrate / 100));

    }

}
