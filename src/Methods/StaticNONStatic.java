package Methods;

public class StaticNONStatic {
    public static void main(String[] args) {
        Print(); // Printing non static method

        //Printing Static method
        StaticNONStatic p2 = new StaticNONStatic();
        p2.Print2();
    }
    static void Print(){
        System.out.println("I am a Static Method");
    }

    void Print2(){
        System.out.println("I am a non Static Method");
    }
}
