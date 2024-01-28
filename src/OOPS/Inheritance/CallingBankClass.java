package OOPS.Inheritance;

public class CallingBankClass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.SetBank("SBI");
        bank.PrintDetails();

        System.out.println("-----------------------------------------------------");
        bank.SetBank("ICICI","ICICI123",100000);
        bank.PrintDetails();
        System.out.println("-----------------------------------------------------");
        bank.SetBank("TJSB","TJSB123",200000);
        bank.PrintDetails();



    }
}
