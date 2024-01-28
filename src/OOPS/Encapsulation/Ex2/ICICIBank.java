package OOPS.Encapsulation.Ex2;

public class ICICIBank {

    public ICICIBank(String name, long Balance) {
        this.name = name;
        this.Balance = Balance;
    }


    String name;
    long Balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance) {
        if (Balance > 0) {
            this.Balance = balance;
        } else {
            System.out.println("Not allowed");
        }
        System.out.println(name+balance);
    }
}
