package day30_CostumClass;

import org.w3c.dom.ls.LSOutput;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public char gender;

    public void  setInfo(String dogName, int dogAage, String dogBreed, String dogSize, char dogGender, String dogColor){
        name = dogName;
        age = dogAage;
        gender = dogGender;
        breed = dogBreed;
        size = dogSize;
        color = dogColor;
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void play(){
        System.out.println(name + "is playing.");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
