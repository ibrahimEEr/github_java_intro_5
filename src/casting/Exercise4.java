package casting;

public class Exercise4 {
    public static void main(String[] args){

        //Boolean to String

        // true false  -> "true" "false" "hello"
        System.out.println(true && false); // false

        //System.out.println("true" && "false"); compiler error. Bu olmaz cunku anlamsiz, String && String
        System.out.println(String.valueOf(true) + String.valueOf(false)); // truefalse (String)

        System.out.println("" + true + false); // truefalse Basina "" koyarak boolean'lari String'e cevirdik.
                                                // Bir usttekiyle ayni sonucu verir.


       //Char to String
        System.out.println(String.valueOf('A') + 'a'); // "A" + 'a' -> Aa (Birinci char String A'ya donustu,
                                                        // ikinci char oldugu gibi kaldi. "A"'a' yani Aa


       //Double to String
        System.out.println("" + 10.5 + 5); // "10.5" + 5 -> 10.55 String,  cunku ilk arguman double'i
                                           // String'e cevirdi sonra kalan 5 integer'i da yanina rakam eklendi.






    }
}
