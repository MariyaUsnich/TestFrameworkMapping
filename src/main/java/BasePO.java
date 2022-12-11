public class BasePO {
    protected BasePO(){
        System.out.println("BasePO default constructor");
    }

    protected WebElement getWebDriver(WebElement element){
        System.out.println("BasePO getWebDriver method with parameter: " + element.toString());
        return element;
    }
}
