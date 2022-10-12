package operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {

                //post Increment
        int num1 = 5;
        num1++;  //increase it by 1 but assign later | num1 is still 5 now
        System.out.println(num1);

                // preIncrement
        int num2 = 5;
        ++num2;  //increase it now and assign it now | num2 is 6 now
        System.out.println(num2);

        // difference between them is

         byte b1 = 5, b2 = 5;
        System.out.println(b1++);   //Still 5
        System.out.println(++b2);    //Now 6








    }
}
