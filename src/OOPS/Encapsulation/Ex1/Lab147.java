package OOPS.Encapsulation.Ex1;

public class Lab147 {
    public static void main(String[] args) {

    Student student = new Student();
    student.name = "Sonali";
    student.age = 32;
    student.name = "Tushar";
    student.age = 35;

    //getter and setter condition based
    // they should be hidden
    // In this example it is not hidden

    Person person = new Person();
    person.balance = 100;
    person.balance = -10;

    }

}
