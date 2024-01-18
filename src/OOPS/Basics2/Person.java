package OOPS.Basics2;

public class Person {
    // Attributes

    String name;
    long phoneNumber;
    double height;
    int age;
    String edu_back;
    String address;
    String gender;
    String emailId;

    // Behaviour - What you can do?
    void sleep(){
        System.out.println(name+ " sleeps");
    }
    void work(){
        System.out.println(name +" Works in an IT firm");
    }
    boolean status(){
        return true;
    }
}
