package OOPS.InnerClasses;

public class Lab155 {
    public static void main(String[] args) {
        Student s1 = new Student() {
            //Anonomous Class - No name as Student is interface
            //We cannot create object for interface and abstract
            @Override
            public void setId() {

            }
        }; //Semicolon for Anonomous class
        s1.setId();
    }
}
abstract class B{
    int var_b = 12;
}
interface Student{
    int id = 11;
    void setId();
}
