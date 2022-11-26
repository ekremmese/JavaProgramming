package day09_IfStatements;

public class MinnTaskWithIfStatement {

    public static void main(String[] args) {

        int a = 11,
                b = 9;

        if (a<b) {
            System.out.println(a + " is the minimum n");
        }
        else if (b<a) {
            System.out.println(b + " is the minimum n");
        }
        else {
            System.out.println(a + " and " + b + " are equal ns");
        }

    }
}
