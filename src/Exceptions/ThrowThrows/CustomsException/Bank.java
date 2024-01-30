package Exceptions.ThrowThrows.CustomsException;

public class Bank {
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    private String currency;
    private Integer amount;

public Integer add (Bank bankName)throws CustomsException{
    if (!(bankName.currency.equalsIgnoreCase("INR"))){
        throw new CustomsException("USD to INR not possible");

    }
    Integer sum=this.amount+ bankName.amount;
    return sum;
}


}
