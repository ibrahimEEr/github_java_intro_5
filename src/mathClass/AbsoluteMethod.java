package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static <scanner> void main(String[] args) {


                //Sonucu pozitif veriyor, mutlak deger
        System.out.println("Difference between your numbers is = " + Math.abs(10 - 14));

            Scanner input = new Scanner(System.in);




        System.out.println("Please enter an age ");

        int age = input.nextInt();

        System.out.println("Please enter age 2 ");

        int age2 = input.nextInt();

        System.out.println("Difference is = " + Math.abs(age2 - age));
        System.out.println("Biggest age is = " + Math.max(age, age2));  //Higher age






    }
}
