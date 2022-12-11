public class WebElement {
    public WebElement(){
        System.out.println("WebElement default constructor");
    }

    public void enterText(String text){
        System.out.println("WebElement enterText method with parameter: " + text);
    }

    public void click(){
        System.out.println("WebElement click method");
    }
}
