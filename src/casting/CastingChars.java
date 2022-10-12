package casting;

public class CastingChars {
    public static void main(String[] args) {

        int i1 =  65;

        System.out.println(i1); // 65

        char c1 = (char)i1;

        System.out.println(c1); // A

        System.out.println(51); // 51
        System.out.println((char) 51); // 3

        System.out.println((char) 123); // {

        System.out.println((char) 32);

        System.out.println((char) 1020);


        char char1 = 'A';
        char char2 = 97; // 'a'

        System.out.println(char1 + char2); // 65 + 97 -> 162 ( Buradaki 162 bir sayi)
        System.out.println("" + char1 + char2); // Aa
        System.out.println("" + (char1 + char2)); // 162  (Buradaki 162 bir String (text), cunku basina String koyduk)
        System.out.println(char1 + char2 + ""); // 162 (Burada da String (text)
        System.out.println(char1 + "" + char2); // Aa

  //     primitive + String 		-> String
  //     String + primitive 		-> String
  //     p + p + S 				-> number String
  //     'A' + "" + 'a' 			-> Aa
  //     p + p + p + S + p + p + p 	-> String
  //     1 + 1 + 1 + "" + 1 + 1 + 1  -> 3111 (String) (ilk uc 1'i topluyor sonra Stringe ceviriyor
                                    //  kalan 1'ler de Stringe donecegi icin 111 = 3111 String cikiyor.
  //     1 + 1 + 1 + "" + (1 + 1 + 1)-> 33 // as a String

    }
}
