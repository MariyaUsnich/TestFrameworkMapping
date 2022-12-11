public class BasePO {
    protected BasePO() {
        System.out.println("BasePO default constructor");
    }

    protected WebElement getWebDriver(WebElement element) {
        System.out.println("BasePO getWebDriver method with parameter: " + element.toString());
        return element;
    }

    protected static WebElement webDriver(WebElement element) {
        System.out.println("LoginPo_Static driver method with parameter: " + element.toString());
        return element;
    }
}
