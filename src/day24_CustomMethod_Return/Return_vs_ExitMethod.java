package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("aa");

    }

    public static void nameOfMonth(int monthNumber) {
        String name = "";
        if (monthNumber < 1 || monthNumber > 12) {
            name = "Invalid!";
            System.out.println(name);
            // System.exit(0);
            return;
        }

        if (monthNumber >= 1 && monthNumber <= 12) {
            name = (monthNumber == 1) ? "January" : (monthNumber == 2) ? "February" : (monthNumber == 3) ? "March" : (monthNumber == 4) ? "April" : (monthNumber == 5) ? "May" : (monthNumber == 6) ? "June" : (monthNumber == 7) ? "July" : (monthNumber == 8) ? "August" : (monthNumber == 9) ? "September" : (monthNumber == 10) ? "October" : (monthNumber == 11) ? "November" : "December";
        }

        System.out.println(name);
    }


}
