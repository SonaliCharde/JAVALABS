package Strings;

public class Lab018 {
    public static void main(String[]args){
        int a =10;
        int b = 20;
        System.out.println(a+b);

        String name = "Sonali";
        System.out.println(a+name); //10Sonali
        System.out.println(name+a); //Sonali10

        // String concatenation  = String+others
        //Interview question
        System.out.println(name+a+b); //Sonali1020

        //First integer addition then string
        System.out.println(a+b+name); //30Sonali
    }
}
