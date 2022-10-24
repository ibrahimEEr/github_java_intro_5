package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int [] numbers = {3, 5, 8, 10};

//        boolean answer = false;
//        for (int number : numbers) {
//            if(number == 5) {
//                answer = true;
//          break;
//            }
//        }
//        System.out.println(answer);

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 7));


    }
}
