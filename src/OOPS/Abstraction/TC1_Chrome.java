package OOPS.Abstraction;

public class TC1_Chrome extends Basebrowser{
    public static void main(String[] args) {
        TC1_Chrome chrome = new TC1_Chrome();
        chrome.Printlog();
        chrome.openBrowser();
        chrome.closeBrowser();
    }
    @Override
    String openBrowser() {
        System.out.println("Opening browser");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing browser");
        return null;
    }
}
