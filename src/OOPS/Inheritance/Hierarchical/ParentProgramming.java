package OOPS.Inheritance.Hierarchical;

public class ParentProgramming {
    public static void main(String[] args) {
        Programming p1 = new Programming("ABC", 9);
        p1.PrintInfo();

        Java java = new Java("Difficult Language");
        java.PrintInfo();

        Python python = new Python("Easy Language");
        python.PrintInfo();
    }

}
