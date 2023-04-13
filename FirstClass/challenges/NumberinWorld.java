package FirstClass.challenges;

public class NumberinWorld {

    public static void main(String[] args) {

        String wordnumber = printNumberinWord(3);
        System.out.println(wordnumber);

    }

    public static void printNumberinWord(int number) {

        String[] NumberinWord = new String[] {
                "Zero", "one", "two", "three", "four", "five",
        };
        switch (number) {
            case 1, 2, 3, 4, 5:
                System.out.println(NumberinWord[number]);
                break;
            default:
                System.out.println("other");

        }
    }

}
