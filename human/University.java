package Refact.human;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();
    private int age;
    private String name;

    public University(String name, int age) {
        this.age = age; this.name = name;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade)
                return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        return  Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    public Student getStudentWithMinAverageGrade(){
        return  Collections.min(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    public void expel(Student student){
        students.remove(student);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

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
        this.age = age;
    }
}