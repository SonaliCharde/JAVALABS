package OOPS.InnerClasses;

public class Lab156 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            //Anonpmpus class
            @Override
            public void run(){
                System.out.println("I am a thread");
            }
        };
        t.run();
    }
}
