package Exceptions.ThrowThrows.CustomsException;



public class CustomsException extends Exception {

    public CustomsException(String msg){
        super(msg);
        System.out.println("This is customs Exception");
    }
}
