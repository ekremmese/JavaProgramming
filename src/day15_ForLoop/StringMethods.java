package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "   ";

        boolean r = str.isEmpty();   // Space makes it not empty

        System.out.println("r = " + r);

        boolean t = str.isBlank();   // Space makes this boolean true // str is not empty but it is blank,

        System.out.println("t = " + t);

        String str2 = "Cydeo     ";

        boolean r1 = str2.isBlank();
        boolean r2 = str2.isEmpty();

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        System.out.println("======================================================");

        String a1 = "NASA";
        String a2 = "nAsa";

        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));


        System.out.println("======================================================");

        String d1 = "I will go to school early in the morning to learn my favorite programming language Java";

        boolean hasCSharp = d1.contains("C#");
        boolean hasJava = d1.contains("Java");
        boolean hasJava2 = d1.contains("java");
        boolean hasJava3 = d1.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);


        System.out.println("======================================================");

        String input1 = "I love Java";
        String input2 = " java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains(input2));
        System.out.println(input1.toLowerCase().contains(input2));

        System.out.println("======================================================");

        String b1 = "Wooden Spoon";

        boolean boo1 = b1.toLowerCase().startsWith("wo");  // When we type .toLowerCase the lower case version of String created then we searched if the beginning is "woo"

        boolean boo2 = b1.endsWith("on");

        System.out.println("boo1 = " + boo1);
        System.out.println("boo2 = " + boo2);


    }
}
