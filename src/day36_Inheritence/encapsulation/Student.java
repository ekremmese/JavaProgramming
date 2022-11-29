package day36_Inheritence.encapsulation;

public class Student {

    public static void main(String[] args) {

    }

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            return;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + ", grade=" + grade + ", schoolName='" + schoolName + '\'' + '}';
    }
}
