package OOPS.Abstraction.RealTimeExamples.ATM;

import OOPS.Abstraction.RealTimeExamples.ATM.ATM;

public class SBIATM extends ATM {
    @Override
    void detect() {
        System.out.println("Detect SBI ATm card and process");
    }
}
