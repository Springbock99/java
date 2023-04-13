package FirstClass.challenges;

public class Speedconverter {

    public static void main(String[] args) {
        printConversion(10.25);

    }

    public static long toMilesPerHoure(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;

        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHoure(kilometersPerHour) + "mp/h");
        }
    }

}
