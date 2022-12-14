package Refact.user;


public class User {
    private String name;
    private String surname;
    private int age;

    private Address address;

    private Work work;

    private boolean man;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
    }

    public void printAdditionalInfo() {
        if (getAge() < 16)
            System.out.println("User under 16");
        else
            System.out.println("User over 16 years old");
    }

    public String getBoss(){
        return work.getBoss();
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
