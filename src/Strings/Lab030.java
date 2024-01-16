package Strings;

public class Lab030 {
    public static void main(String[]args){
        String s1 = "Pramod";
        String s2 = "Kumar";
        int a = 10;
        int b = 30;
        System.out.println(a+b+s1+s2); //40PramodKumar
        System.out.println(s1+s2+(a+b)); //PramodKumar40
        System.out.println(s1+s2+a+b); //PramodKumar1030
    }
}
