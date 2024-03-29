package day30_CostumClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int id;
    public char grade;

    public void setInfo(String name, char gender, int age, int id, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                '}';




    }

    public void code(){
        System.out.println(name + " is coding.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

}
