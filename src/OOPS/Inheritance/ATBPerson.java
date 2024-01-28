package OOPS.Inheritance;

public class ATBPerson {
    String Name;
    long Phone;
    String Email;
    boolean Status;
    String Occupation;

    //Default Constructor
    ATBPerson(){
        Occupation = "Software Tester";
    }

    //Parametarised Constructor
    ATBPerson(String ValueofRefObject){
        this.Name=ValueofRefObject;
    }
    void talk(){
        System.out.println("Talk");
    }
    void Print(){
        System.out.println(this.Name+this.Phone+this.Email);
    }

}
