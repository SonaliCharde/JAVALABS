package OOPS.Abstraction.RealTimeExamples.Bank;

public class BankFunctionality {
    public static void main(String[] args) {
        Bank bank = new PNB();
        bank.ROI();

        Bank bank1 = new SBI();
        bank1.ROI();

    }
}
