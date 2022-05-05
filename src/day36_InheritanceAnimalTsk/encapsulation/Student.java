package day36_InheritanceAnimalTsk.encapsulation;

public class Student {

    private String name, schoolName;
    private char gender, grade;
    private int age;

    public Student(String name, String schoolName, char gender, char grade, int age) {
        setName(name);
        setSchoolName(schoolName);
        setGender(gender);
        setGrade(grade);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 5 || age > 90){
            return;
        }
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            return;
        }
        this.grade = grade;
    }

    public String  toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}
