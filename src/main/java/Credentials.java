public class Credentials
{
    public Credentials(String _login, String _password, String _phone_number, String _code)
    {
        login = _login;
        password = _password;
        phone_number = _phone_number;
        code = _code;

        System.out.println("Credentials constructor with parameters: " + _login + " " + _password + " " + _phone_number + " " + _code);

        System.out.println();
        System.out.println();
    }

    public String getLogin()
    {
        System.out.println("Credentials getLogin method, return value: " + login);
        return login;
    }

    public String getPassword()
    {
        System.out.println("Credentials getPassword method, return value: " + password);
        return password;
    }

    public String getPhoneNumber(){
        System.out.println("Credentials getPhoneNumber method, return value: " + phone_number);
        return phone_number;}


    public String getCode(){
        System.out.println("Credentials getCode method, return value: " + code);
        return code;}

    private String login;
    private String password;

    private String phone_number;
    private String code;
}
