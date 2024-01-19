package OOPS.Abstraction.RealTimeExamples.Tutor;

public class Students extends Tutor{
    public static void main(String[] args) {
        Tutor t = new Students();
        t.doHome();
    }
    @Override
    void doHome() {
        IwillMakeyou();
        System.out.println(":)");
    }
}

