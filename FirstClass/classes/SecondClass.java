package FirstClass.classes;

public class SecondClass {

    public static void main(String args[]) {

        System.out.println("Hello,Kent");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not sn Alien!");
        }
        int Topscore = 80;
        if (Topscore < 100 || isAlien) {
            System.out.println("You got the high score ");
        }
        int SecondTopscore = 81;
        if (Topscore > SecondTopscore && Topscore < 100) {
            System.out.println("Greater then Topscore and less them 100");

        }
        if ((Topscore > 90) || (SecondTopscore <= 90)) {
            System.out.println("Either or both of the conditions are true");

        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("this is not supposed to happen");
        }
        String makeofCar = "Volkswagen";
        boolean isDomestic = makeofCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("this csr is Domestic to our Country");

        }

        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        double myTotalValue = ((myFirstVariable + mySecondVariable) * 100.00d);
        System.out.println("myTotalValue = " + myTotalValue);
        double remainder = myTotalValue % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isnoRemainder = (remainder == 0) ? true : false;
        System.out.println("isnoRemainder = " + isnoRemainder);
        if (!isnoRemainder) {
            System.out.println("there is some remainder");
        }

    }

}