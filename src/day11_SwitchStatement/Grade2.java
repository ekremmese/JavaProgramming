package day11_SwitchStatement;

public class Grade2 {

    public static void main(String[] args) {

        // if the greade is A or B or C or D =====> "Passed"
        //Otherwise ===> failed
        //We applied || operator by declaring cases back to back

        char ch = 'A';
        String result = "";

        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);
    }
}
