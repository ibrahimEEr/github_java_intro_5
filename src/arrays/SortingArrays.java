package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

    int [] numbers = {5, -1, 3, 10};
    String[] objects = {"remote", "computer", "Cup", "Phone"};
        Arrays.sort(numbers);
        Arrays.sort(objects);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(objects));


    }
}
