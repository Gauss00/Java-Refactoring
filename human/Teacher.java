package Refact.human;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends UniversityPerson {

    private int numberOfStudents;

    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }

    public String getPosition(){
        return "Teacher";
    }

    public void live() {
        teach();
    }

    public void teach() {
    }


}
