package AccessModifiers.Police;

public class Cop {
    protected int gun;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void CanIshoot(){
        System.out.println("Offcourse you can shoot");
    }
}
