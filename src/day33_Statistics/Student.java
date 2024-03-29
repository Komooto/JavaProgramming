package day33_Statistics;

public class Student {

    public String name;
    public char gender, grade;
    public int studentID,age;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, char gender){
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID){
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade){
        this(name,studentID);
        this.grade = grade;
    }

    public Student(String name,char gender, int age){
        this(name,gender);
        this.age = age;
    }

    public Student(String name,char gender, int age, int studentID){
        this(name,gender,age);
        this.studentID = studentID;
    }

    public Student(String name,char gender, int age, int studentID, char grade){
        this(name,gender,age,studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", studentID=" + studentID +
                ", age=" + age +
                '}';
    }





}
