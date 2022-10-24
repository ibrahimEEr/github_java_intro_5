package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        boolean answer = false;

//        for (String object : objects) {
//
//            if(object.equals("mouse"))
//
//        }
//
        Arrays.sort(objects);
        System.out.println((Arrays.binarySearch(objects, "Mouse") >= 0 ));;



              /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        RESULT:
        true
        */





    }
}
