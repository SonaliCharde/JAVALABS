package Functions;

public class Lab113 {
    public static void main(String[]args) {
        SayHello();
        HRU();
        SayHello();
        HRU();
        SayHello();
        HRU();

        double d = Math.pow(2,3);
        System.out.println(d);

    }
        static void SayHello() {
            for (int i = 1; i <= 4; i++) {
                System.out.println("Hello");
            }
        }
            static void HRU(){
                for (int j=1; j<=4; j++){
                    System.out.println("HRU");
                }
            }
                   }


