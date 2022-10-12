package casting;

public class Min_Max_Of_Primitives {
    public static void main(String[] args) {

            // Dikkatli ol primitiveler Class'a dondu Buyuk harfle basliyorlar,
            // byte yerine Byte gibi. boylelikle bu wrapper classlarin methodlarindan faydalaniyoruz.


        System.out.println("The min value of byte = " + Byte.MIN_VALUE);
        System.out.println("The max value of byte = " + Byte.MAX_VALUE);

        System.out.println("The min value of short = " + Short.MIN_VALUE);
        System.out.println("The max value of short = " + Short.MAX_VALUE);

        System.out.println("The min value of int = " + Integer.MIN_VALUE);
        System.out.println("The max value of int = " + Integer.MAX_VALUE);


    }
}
