package OOPS.Inheritance.Hierarchical;

public class Programming {
    int version;
    String Author;

    Programming(){
        System.out.println("Program- Default Constructor");
    }
    Programming(String author, int version){
        this.Author= author;
        this.version = version;
    }
    void PrintInfo(){
        System.out.println("Program Information - "+this.Author + " & "+this.version);
    }


}
