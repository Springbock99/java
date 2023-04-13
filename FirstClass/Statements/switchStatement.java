package FirstClass.Statements;

public class switchStatement {

    public static void main(String[] args) {

        // int Value = 1;
        // if (Value == 1) {
        // System.out.println("Value is 1");
        // } else if (Value == 2) {
        // System.out.println("Value is 2");
        // } else {
        // System.out.println("Value is not 1 or 2");
        // }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Acually it was a " + switchValue);

            default:
                System.out.println("was not 1, 2, 3, 4, 5");
                break;
        }

        String month = "apr";
        System.out.println(month + " is in the " + getQuoters(month) + " quater");

    }

    public static String getQuoters(String month) {
        switch (month) {
            case "JANUARY":
            case "FEB":
            case "MAR":
                return "1st";
            case "apr":
            case "may":
            case "june":
                return "2nd";
            case "july":
            case "aug":
            case "sep":
                return "2";
            case "okt":
            case "nov":
            case "dec":
                return "4";

        }
        return "bad";

    }

}
