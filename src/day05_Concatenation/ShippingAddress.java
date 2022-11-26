package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

       /* String name = "Ekrem Meşe";
        String buildingn = "5";
        String streetName = "Yeşil Fidan";
        String city = "İstanbul";
        String state = "Türkiye";
        String zipCode = "34665";

        */

        String name = "Ekrem Meşe",
                buildingn = "5",
                streetName = "Yeşil Fidan",
                city = "İstanbul",
                state = "Türkiye",
                zipCode = "34665";

        String shippingAdress = name + "\n" + buildingn + " " + streetName + "\n" + city + ", " + zipCode + " " + state;

        System.out.println(shippingAdress);

        //System.out.println(name + "\n" + buildingn + " " + streetName + "\n" + city + ", " + zipCode + " " + state  );

        // if you wanna use concatenation and escape sequences , escape sequences must be in " "


    }
}
