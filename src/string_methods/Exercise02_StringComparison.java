package string_methods;

public class Exercise02_StringComparison {
    public static void main(String[] args) {

        String str1 = "JAVA";
        String str2 = "java";

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.toLowerCase().equals(str2)); // true

            //2. Ornek
        String s1= "HELLO";
        String s2= "hello";

        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.toLowerCase().equals(s2)); // true
        System.out.println(s1.equals(s2.toUpperCase())); // true

    }
}
