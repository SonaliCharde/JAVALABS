package OOPS.InnerClasses;

public class Lab153 {
    public static void main(String[] args) {
        OOC ooc = new OOC();

        //Syntax to call Static inner class
        OOC.SNCI icref = new OOC.SNCI();
        icref.show();
    }

}
class OOC{
    static int o = 100;
    int a =900;

    static class SNCI{
        void show(){
            System.out.println(o);
            //System.out.println(a); Not possible
        }
    }
}
