package OOPS.Inheritance;

public class Bank {
    String BankName;
    String IFSCcode;
    int FDAmount;

    public void SetBank(String SBI){
        BankName = "SBI";
        IFSCcode = "SBI123";
        FDAmount = 100000;
        System.out.println("Default Constructor");
    }
    public void SetBank(String bankName, String IFSCcode, int FDAmount){
        this.BankName=bankName;
        this.IFSCcode=IFSCcode;
        this.FDAmount=FDAmount;
        System.out.println("Parametarised Constructor");

    }
    void PrintDetails(){
        System.out.println("Bank name is "+this.BankName);
        System.out.println("IFSC code is "+this.IFSCcode);
        System.out.println("FD amount should be "+ this.FDAmount);
    }
}
