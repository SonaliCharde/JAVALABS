package OOPS.Abstraction;

public class TC1_Firefox extends Basebrowser {
    public static void main(String[] args) {

        Test();

        TC1_Firefox firefox = new TC1_Firefox();
        firefox.openBrowser();
        firefox.closeBrowser();
        firefox.Printlog();

    }

    String openBrowser() {
        System.out.println("Opening Firefox");
        return null;
    }

    String closeBrowser(){
        System.out.println("Closing Firefox");
        return null;
    }
    static String Test(){
        System.out.println("testing static abstract method");
        return null;
    }
}

