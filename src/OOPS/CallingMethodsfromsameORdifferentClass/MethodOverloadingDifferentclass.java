package OOPS.CallingMethodsfromsameORdifferentClass;

public class MethodOverloadingDifferentclass {
    public static void main(String[] args) {


        MethodOverloadingSameClass mo = new MethodOverloadingSameClass();
        mo.Method1(1,2);
        mo.Method1();
        mo.Method1("Sonali", "Charde");
        mo.Method1(true);

        MethodOverloadingDifferentclass mod = new MethodOverloadingDifferentclass();
        mod.M1(10);
        mod.M1(false);
    }

    public void M1(int a) {
        System.out.println("False");
    }

    public void M1(boolean a) {
        System.out.println(a);
    }
}
