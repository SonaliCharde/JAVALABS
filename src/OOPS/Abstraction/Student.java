package OOPS.Abstraction;

public class Student extends BaseTutor{
    public static void main(String[] args) {
        Student student = new Student();
        student.IwillMakeYouAt();
        student.doHomework();
    }
    @Override
    void doHomework() {
        System.out.println("If you will do your homework then");
        System.out.println(":)");
    }
}

