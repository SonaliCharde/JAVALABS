package OOPS.Inheritance.Hierarchical;

public class Java extends Programming{
    String newFeature;

    Java(){
        System.out.println("DC");
    }
    Java (String newFeature){
        this.newFeature=newFeature;
    }

    @Override
    void PrintInfo() {
        System.out.println("New feature of JAVA is "+this.newFeature);
    }
}
