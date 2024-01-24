package AccessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop Jrcop = new Cop(1);
        System.out.println(Jrcop.gun);
        Jrcop.CanIshoot();
    }
}
