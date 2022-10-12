package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Hey user, how much you make yearly?");
        double income = scanner.nextDouble();
        System.out.println("Your monthly payment is " + income / 12 + " then!");




    }
}
