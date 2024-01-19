package OOPS.InheritanceAndCallingClasses;

public class CallingATBPerson {
    public static void main(String[] args) {

        // this
        // constructor
        // inheritance
        // ecap
        // abstrc
        // super()

        ATBPerson at = new ATBPerson();
        at.Name = "Sonali";
        at.Email = "sonali.charde4790#gmail.com";
        at.Phone = 323232321l;
        at.Occupation = "Software Tester";
        at.Status= true;
        at.talk();
        at.Print();

    }
}
