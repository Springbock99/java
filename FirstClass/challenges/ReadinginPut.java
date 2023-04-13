package FirstClass.challenges;

import java.util.Scanner;

public class ReadinginPut {

    public static void main(String[] args) {

        int currenYear = 2022;
        System.out.println(GetinputFromConsol(currenYear));
        System.out.println(GEtinoutFromScanner(currenYear));

    }

    public static String GetinputFromConsol(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + " Thanks for taking the course! ");
        String DateofBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(DateofBirth);

        return " So you are " + age + " Years old";

    }

    public static String GEtinoutFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        // String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi, what your Name");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " Thanks for taking the course! ");
        // String DateofBirth = System.console().readLine("What year were you born? ");
        String DateofBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(DateofBirth);

        return " So you are " + age + " Years old";

    }
}
