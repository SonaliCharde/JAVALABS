package OOPS.InheritanceAndCallingClasses;


public class Dog {
    public static void main(String[] args) {

    }
String name;

Dog(){
    System.out.println("DC");
}
Dog(String Refname){
    this.name=Refname;
    System.out.println("PC");
}
void bark(){
    System.out.println("Bark");
    System.out.println("Dog name is "+this.name);
}

}
