package OOPS.Inheritance.Hierarchical;

public class Python extends Programming {
    String newFeature;

    Python(){
        System.out.println("DC");
    }
    Python (String newFeature){
        this.newFeature=newFeature;
    }

    @Override
    void PrintInfo() {
        System.out.println("New feature of JAVA is "+this.newFeature);
    }
}
