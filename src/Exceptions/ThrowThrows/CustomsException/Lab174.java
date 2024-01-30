package Exceptions.ThrowThrows.CustomsException;

public class Lab174 {
    public static void main(String[] args) throws CustomsException {

        Bank jpchase = new Bank("USD",100);
        Bank HDFC = new Bank("INR",200);

        System.out.println(HDFC.add(jpchase));

    }
}
