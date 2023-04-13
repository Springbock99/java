package FirstClass.challenges;

public class megaBtes {

    public static void main(String[] args) {
        printMegabytesAndKiloBytes(5000);

    }

    public static void printMegabytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("invalid");

        } else {
            int megabyte = kiloBytes / 1024;
            int myremainder = (kiloBytes % 1024);
            System.out.println(kiloBytes + "kb = " + megabyte + "mb and " + myremainder + "kb");

        }

    }

}
