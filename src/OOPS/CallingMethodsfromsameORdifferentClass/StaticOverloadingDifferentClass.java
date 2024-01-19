package OOPS.CallingMethodsfromsameORdifferentClass;

public class StaticOverloadingDifferentClass {
    public static void main(String[] args) {
        StaticMethodsSameClass.M1();
        StaticMethodsSameClass.M2();
        StaticMethodsSameClass.M1(10);
    }
}
