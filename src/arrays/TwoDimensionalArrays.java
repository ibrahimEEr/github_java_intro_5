package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String [][] students = {

                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}

        };
//        System.out.println(students[1][1]);

        for (String[] group : students) {
            for (String student : group) {
                System.out.println(student);
            }
        }


    }
}
