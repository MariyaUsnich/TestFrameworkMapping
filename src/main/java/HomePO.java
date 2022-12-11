public class HomePO extends BasePO{
    public HomePO(){
        System.out.println("HomePO default constructor");

        System.out.println();
        System.out.println();
    }

    public boolean isVisible(){
        System.out.println("HomePO isVisible method");

        System.out.println();
        System.out.println();

        return true;
    }

    public String greeteeingsLabel(){
        System.out.println("HomePO greeteeingsLabel method");

        System.out.println();
        System.out.println();

        return "Home Page default Greetings";
    }
}
