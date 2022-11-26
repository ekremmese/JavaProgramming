package day32_Constructor;

public class Test {

    public Test(){
        System.out.println("a");
    }

    public Test(int a){
        this();
        System.out.println("b");
    }

    public Test(double a){
        this(10);
        System.out.println("c");
    }

    public Test (String str){
        this(2.5);
        System.out.println("d");
    }


    public static void main(String[] args) {
        new Test(10);
        System.out.println("-------------");
        Test test1 = new Test("java");
    }
}
