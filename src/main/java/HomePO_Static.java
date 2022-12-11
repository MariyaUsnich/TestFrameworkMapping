public class HomePO_Static extends BasePO{

        public HomePO_Static(){
           // System.out.println("HomePO default constructor");

            System.out.println();
            System.out.println();
        }

        public static boolean isVisible(){
            System.out.println("HomePO_Static isVisible method");

            System.out.println();
            System.out.println();

            return true;
        }
        public static String greetingsLabel(){
            System.out.println("HomePO_Static greetingsLabel method");

            System.out.println();
            System.out.println();

            return "Home Page default Greetings";
        }
    }

