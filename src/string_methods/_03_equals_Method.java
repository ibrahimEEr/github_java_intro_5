package string_methods;

public class _03_equals_Method {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "Java";
        String s3 = "Hello";

        boolean b1 = s1.equals(s2);

        System.out.println(b1);

        System.out.println(s2.equals(s3)); // false

        System.out.println("abc".equals("abc ")); // false because there is a space

        System.out.println("".equals(" ")); // false birisi empty birisi space



        System.out.println(s1.equalsIgnoreCase(s3)); // true cunku bu defa sadece harflerin
                                                       // buyuklugune bakmiyor

        //eguals() VS equals.IgnoreCase()
        System.out.println("abc".equals("ABC")); // false
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // equals.IgnoreCase() --> CASE SENSITIVE DEGIL "Ignore Case Sensitivity"'den geliyor ismi






    }
}
