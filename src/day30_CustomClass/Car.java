package day30_CustomClass;

public class Car {

    public String name;
    public int year;
    public String brand;
    public String color;

    public void start(){
        System.out.println(name + " is started.");
    }

    public void drive(){
        System.out.println(name + " is driving now.");
    }

    public void setInformation(String carName, int carYear, String carBrand, String carColor){ // method created to assign info easier
        name = carName;
        year = carYear;
        brand = carBrand;
        color = carColor;
    }
    public String toString() { //we can not print if we don t have toString method, we can generate it
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }



}
