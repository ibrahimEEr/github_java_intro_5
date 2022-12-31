package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Mock3_Answers {
    public static void main(String[] args) {

        /*
        Question 1
        -Write a public static method that takes an int array as an argument and returns an int array.
        -The method should add 3 to each element and return it back.
         -Method name can be called as add3.
        Test data:
         [2, 5, 0, 4]
        Expected:
        [5, 8, 3, 7]
        */

        int[] a = {2, 5, 0, 4};
        System.out.println(Arrays.toString(add3(a)));



        /*
        Question 2
        -Write a public static method that takes an Integer ArrayList as an argument and returns an int.
                -The method should find the max value from the list and return it.
                -Method name can be called as findMax.
        NOTE: DO NOT use sort method.
        Test data:
        [-20, 35, 70, 4, 5]
        Expected:
        70
        */

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-20, 35, 70, 4, 5));

        System.out.println(findMax(nums));


    }

    //Question 1
    public static int[] add3 (int[] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]+3;
        }

        return nums;
    }


   //Question 2
   public static int findMax(ArrayList<Integer> nums){

        int max = Integer.MIN_VALUE;

       for (Integer num : nums) {
           if(num > max) max = num;
       }

        return max;
    }

}

