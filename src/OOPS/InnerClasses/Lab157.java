package OOPS.InnerClasses;

public class Lab157 {
    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a Thread");
            }
        };
    }
}
