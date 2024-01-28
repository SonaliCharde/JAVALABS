package OOPS.Inheritance.SingleLevel;

public class Father {
    double FD_Amount = 1000000;
    String Property1 = "Bunglow";
    String Property2 = "5 Acres plot";
    String Gold = "1KG gold";

    public void CASH(){
        System.out.println("Rupees "+ this.FD_Amount);
    }
    public void Property(){
        System.out.println(this.Property1 +" AND "+ this.Property2);
    }
    public void Wealth(){
        System.out.println(this.Gold);
    }
}
