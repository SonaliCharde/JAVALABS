package OOPS.Abstraction.RealTimeExamples.ATM;

public class ATMFunctionality {
    public static void main(String[] args) {
        ATM atm = new SBIATM(); //Upcasting methods

        atm.detect();
        atm.run();
    }
}
