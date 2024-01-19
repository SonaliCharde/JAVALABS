package OOPS.CallingMethodsfromsameORdifferentClass;

import java.security.spec.MGF1ParameterSpec;

public class StaticMethodsSameClass {
//    public static void main(String[] args) {
//
//        StaticMethodsSameClass.M1();
//        StaticMethodsSameClass.M2();
//
//
//    }

    public static void M1() {
        System.out.println("Printing static method M1");
        //return;
    }

    public static void M2() {
        System.out.println("Printing static method M2");
    }
    public static void M1(int a) {
        System.out.println("Printing static method M1");

    }
}

