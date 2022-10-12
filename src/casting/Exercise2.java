package casting;

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println();

        System.out.println('A' + 'b' + 20 + " Hello" + 2 + 1); // 183 Hello21 (As String) Oncelikle Char olan
        // A ve b charlarinin toplam rakamsal degeri olan 163'u buluyor,  sonra bunu 20 ile topluyor. (primitive + primitive) = 183
        // 183 String olan Hello ile concat edilince "183 Hello" Stringi olmus oluyor. Kalan 2 ve 1
        // artik String olarak goruleceginden 21 sekline donusuyor. Sonuc: 183 Hello21 (String)

        System.out.println('A' + 'b' + 20 + " Hello" + (2 + 1)); // 183 Hello3 (As String)

        // If there is a + between primitives it is definitely an arithmetical operator.
        // 'A' + 'b' topladi ve 163 bulmasi gibi.  ya da 5 + 3 = 8 gibi



    }
}
