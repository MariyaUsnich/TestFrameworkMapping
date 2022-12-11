public class LoginPo_Static extends BasePO {

    public LoginPo_Static(){
        // WebDriver driver = new WebDriver();

        System.out.println();
        System.out.println();
    }
    public static void login(Credentials creds)
    {
        System.out.println("LoginPo_Static login method with parameter: " + creds.toString());

        enterLogin(creds.getLogin());
        enterPassword(creds.getPassword());
        enterPhoneNumber(creds.getPhoneNumber());
        enterCode(creds.getCode());

        clickSubmitButton();

        System.out.println();
        System.out.println();
    }

    private static void enterLogin(String login)
    {
        System.out.println("LoginPo_Static enterLogin method with parameter: " + login);
        webDriver(login_editbox).enterText(login);

        System.out.println();
    }
    private static void enterPassword(String password)
    {
        System.out.println("LoginPo_Static enterPassword method with parameter: " + password);
        webDriver(password_editbox).enterText(password);

        System.out.println();
    }

    private static void enterPhoneNumber(String phone_number)
    {
        System.out.println("LoginPo_Static enterPhoneNumber method with parameter: " + phone_number);
        webDriver(approved_phone_number_editbox).enterText(phone_number);

        System.out.println();
    }
    private static void enterCode(String code)
    {
        System.out.println("LoginPo_Static enterCode method with parameter: " + code);
        webDriver(two_phase_auth_editbox).enterText(code);

        System.out.println();
    }
    private static void clickSubmitButton()
    {
        System.out.println("LoginPo_Static clickSubmitButton method");
        webDriver(submit_button).click();

        System.out.println();
    }
    private static WebElement login_editbox = new WebElement(); 		    // Selenium
    private static WebElement password_editbox = new WebElement(); 	    // Selenium
    private static WebElement submit_button = new WebElement(); 		    // Selenium

    private static WebElement approved_phone_number_editbox = new WebElement(); 	// Selenium
    private static WebElement two_phase_auth_editbox = new WebElement(); 	// Selenium

   // private static class WebDriver {
   // }
}

