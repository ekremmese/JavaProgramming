package day35_Encapsulation;

public class CybertekStudent {
    /*
    2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

     */

    public String name;
    public char gender;
    public int age;
    public String batchNumber, groupNumber;
    public static String schoolName;
    public  String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CybertekStudent(String name, char gender, int age, String batchNumber, String groupNumber, String fieldOfStudy,int secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;

    }

    static {
        schoolName = "CyberTech";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending to the class.");
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}

//1:08:30