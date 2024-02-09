package Exceptions.TryCatch;

public class Ex1 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.trim();
        }catch (Exception e) {
//        }catch (Throwable e){}
//        catch (Error error){
            e.printStackTrace();
        }
        System.out.println("I am done");
    }
}
