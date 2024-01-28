package OOPS.InnerClasses;

public class Lab154 {
    public static void main(String[] args) {
        Pramod pramod = new Pramod();
        Pramod.Ipad pi = pramod.new Ipad();
        pi.eating();
    }

}
class Pramod{
    int age =31;

    void eat(){
        System.out.println("I am eating");
    }
    class Ipad{
        void eating(){
            System.out.println("Iam IPAD");
            System.out.println(age);
        }
}

}
