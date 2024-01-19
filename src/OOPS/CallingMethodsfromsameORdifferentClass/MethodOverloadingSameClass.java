package OOPS.CallingMethodsfromsameORdifferentClass;

public class MethodOverloadingSameClass {
    int x=1;
    int y=2;
//    public static void main(String[] args) {
//
//
//
//    MethodOverloadingSameClass mo = new MethodOverloadingSameClass();
//    mo.Method1(1,2);
//    mo.Method1(true);
//    mo.Method1("Sonali","Charde");
//    mo.Method1();
//
//
//}
public void Method1(int a, int b){
    System.out.println(a+b);
}
public void Method1(String a, String b){
    System.out.println(a.concat(b));
}
public void  Method1(boolean a){
    System.out.println(a);
}
public void Method1(){
    System.out.println(this.x+this.y);
}
}
