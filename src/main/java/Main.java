public class Main {
    public static void main(String[] args) {
        Credentials creds = new Credentials("Some login", "Some password", "Phone number", "A code");
        LoginPO loginPO = new LoginPO();
        loginPO.login(creds);

        HomePO homePO = new HomePO();
        boolean result = homePO.isVisible() &&
                homePO.greeteeingsLabel().equalsIgnoreCase("Home Page default Greetings");

        if (result) {
            System.out.println("We successfully login to the system!");
        } else {
            System.out.println("Login Failed!");
        }

        System.out.println("----------------- Static-------------------");
        LoginPo_Static.login(creds);
        boolean result_static = HomePO_Static.isVisible() &&
                HomePO_Static.greetingsLabel().equalsIgnoreCase("Home Page default Greetings");

        if (result_static) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}
