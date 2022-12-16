package day39_Recap.cydeoTask;

public class Student  extends  Person{
    /*
    6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
     */

    private int studentID;
    private String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName() + " " + getStudentID() + " is studying");
    }

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
