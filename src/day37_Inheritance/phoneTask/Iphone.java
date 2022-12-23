package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + brand + " " + phoneNumber + " is asking faceTime");
    }

    public void faceTime(String email){
        System.out.println(brand + " " + brand + " " + email + " is asking faceTime");
    }
}
