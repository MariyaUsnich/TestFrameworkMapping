public class LoginPO extends BasePO{
    public LoginPO(){
        System.out.println("LoginPO default constructor");

        login_editbox = new WebElement();
        password_editbox = new WebElement();
        submit_button = new WebElement();
        approved_phone_number_editbox = new WebElement();
        two_phase_auth_editbox = new WebElement();

        System.out.println();
        System.out.println();
    }

   public void login(Credentials creds)
    {
        System.out.println("LoginPO login method with parameter: " + creds.toString());

        enterLogin(creds.getLogin());
        enterPassword(creds.getPassword());
        enterPhoneNumber(creds.getPhoneNumber());
        enterCode(creds.getCode());

        clickSubmitButton();

        System.out.println();
        System.out.println();
    }

   private void enterLogin(String login)
    {
        System.out.println("LoginPO enterLogin method with parameter: " + login);
        getWebDriver(login_editbox).enterText(login);

        System.out.println();
    }

    private void enterPassword(String password)
    {
        System.out.println("LoginPO enterPassword method with parameter: " + password);
        getWebDriver(password_editbox).enterText(password);

        System.out.println();
    }

    private void enterPhoneNumber(String phone_number)
    {
        System.out.println("LoginPO enterPhoneNumber method with parameter: " + phone_number);
        getWebDriver(approved_phone_number_editbox).enterText(phone_number);

        System.out.println();
    }

    private void enterCode(String code)
    {
        System.out.println("LoginPO enterCode method with parameter: " + code);
        getWebDriver(two_phase_auth_editbox).enterText(code);

        System.out.println();
    }
    private void clickSubmitButton()
    {
        System.out.println("LoginPO clickSubmitButton method");
        getWebDriver(submit_button).click();

        System.out.println();
    }

    //private String login_locator_string;
    //private BY login_locator;
   private WebElement login_editbox; 		    // Selenium
   private WebElement password_editbox; 	    // Selenium
    private WebElement submit_button; 		    // Selenium
    private WebElement approved_phone_number_editbox; 	// Selenium
    private WebElement two_phase_auth_editbox; 	// Selenium
}
