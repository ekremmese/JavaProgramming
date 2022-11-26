package day09_IfStatements;

public class MinNumber {


    public static void main(String[] args) {


        int n1 = 101;
        int n2 = 102;

        boolean n1IsMinimum = n1<n2;
        boolean n2IsMinimum = n2<n1;
        boolean n1Andn2Equal = n2 ==n1;
        //!n1IsMinimum && !n2IsMinimum we can also describe boolean in that way

        if (n1IsMinimum){  //if n1 is min n
            System.out.println(n1 + " is the minimum n");
        }
        if (n2IsMinimum){  //if n2 is min n
            System.out.println(n2 + " is the minimum n");
        }
        if(n1Andn2Equal) {   // if both are equal
            System.out.println("Both ns are equal");
        }

    }
}
