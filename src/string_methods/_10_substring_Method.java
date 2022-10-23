package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {

        String s2 = "TechGlobal";
        System.out.println(s2.substring(0, 4)); // "Tech"
        System.out.println(s2.substring(-2, 25)); // Runtime Error

                /*
           -return
           -returns a String
           -non-static
           -it is overloaded and takes either one or 2 int index arguments
         */

                String s = "Techstrlobal";

        //Get "Global"
                String s1 = s.substring(4); // from index 4 to the end
                System.out.println(s1);

        //Get "Tech"
                System.out.println(s.substring(0, 4));

                System.out.println(s.substring(2,15)); // StringIndexOutOfBoundsException


    }
}
