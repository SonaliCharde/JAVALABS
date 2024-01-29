package OOPS.Polymorphism.MOverloading;

public class person {
    public static void main(String[] args) {
        person p = new person();
        p.gift(10);
        p.gift("Sonali");
        p.gift(29);
    }

    //Multiple methods with same name but different arguments

    void gift(String a){
        System.out.println("A String is "+a);
    }
    int gift(int a){
        System.out.println("Integer is "+a);
        return a;
    }

    //Float will always return integer in sout
    float gift(float a){
        System.out.println("Float is "+a);
        return a;
    }

}
