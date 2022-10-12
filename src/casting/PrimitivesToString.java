package casting;

public class PrimitivesToString {
    public static void main(String[] args) {

            // Bunu yapmanin iki yolu var. ister bas tarafina "" + koyariz veya
            // String.valueOf() metodunu kullaniriz.

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2); // 15 - primitive - number
        System.out.println("" + num1 + num2); // 510 - String - text
        System.out.println("" + (num1 + num2)); // 15 - String - text

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); // 510 - String - text

        System.out.println(String.valueOf(23) + 5); // "23" + 5 ->235 as a String
        System.out.println("" + 23 + 5); // bir usttekinin aynisi sadece 1. yolla yaptik (basina "" koyarak)




    }
}
