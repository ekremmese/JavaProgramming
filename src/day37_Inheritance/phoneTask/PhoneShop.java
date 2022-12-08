package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 13 pro max" , "Large", 1000, "Black");

        Samsung samsung = new Samsung("A10s", "6 inches", 500, "White");

        Nokia nokia = new Nokia("Nokia", "5110", "4.5 inches", 400, "Black");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(3423423);
        iphone.faceTime("yahoo@gmail.com");
        iphone.faceTime(34324324);

        System.out.println("-------------------------------");

        samsung.call(12323234);
        samsung.text(34532234);
        samsung.freeze();

        System.out.println("-----------------------------------");

        nokia.call(911);
        nokia.text(44223123);
        nokia.selfDefense();

        System.out.println("-------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Nokia.hasBattery);
        System.out.println(Samsung.hasBattery);


    }
}
