package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;


    public CydeoStudent(String studentName){
        this.studentName=studentName;
        //schoolName = "Cyedo School";
    }

    static {
        schoolName = "Cydeo School";
    }

}


class CydeoStudentObject{
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Ali");
        CydeoStudent student2 = new CydeoStudent("Veli");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }
}