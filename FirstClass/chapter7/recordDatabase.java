package FirstClass.chapter7;

public class recordDatabase {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            students s = new students("94456" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "tom";
                case 3 -> " sara";
                case 4 -> "timmy";
                case 5 -> "lisa";
                default -> "Anonymous";

            }, "05/08/1999", "Java MAsterclass");
            System.out.println(s);
        }

    }

}
