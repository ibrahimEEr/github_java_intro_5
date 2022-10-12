package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {

        String s = "John";
        System.out.println(s.length()); // 4

        //veya boyle yapabiliriz
        System.out.println("John".length()); // 4

        System.out.println("".length()); // 0
        System.out.println(" ".length()); // 1
        System.out.println("  ".length()); // 2
    }
}
