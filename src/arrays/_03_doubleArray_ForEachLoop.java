package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {

//        double[] numbers = {5.5, 6, 10.3, 25};
//       // System.out.print(Arrays.toString(numbers));
//
//
//       for (double number : numbers) {
//           System.out.print(number);


       String[] colors = {"blue", "green", "yellow", "pink"};
        System.out.println(Arrays.toString(colors));

        System.out.println(colors.length);

        System.out.println(colors[3]);

        for (String color : colors) {
            System.out.println(color);
        }



    }
}
