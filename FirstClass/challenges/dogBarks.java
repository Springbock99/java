package FirstClass.challenges;

public class dogBarks {

    public static void main(String[] args) {
        boolean awnser = shouldWakeUP(true, 6);
        System.out.println(awnser);

    }

    public static boolean shouldWakeUP(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;

        } else {
            return true;
        }

    }

}
