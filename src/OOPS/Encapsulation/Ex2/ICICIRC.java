package OOPS.Encapsulation.Ex2;

import OOPS.Encapsulation.Ex2.ICICIBank;

public class ICICIRC {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("Sonali", 1000);
        iciciBank.setName("Tushar");
        iciciBank.getName();
        iciciBank.getBalance();
        iciciBank.setBalance(1000000);
    }
}
