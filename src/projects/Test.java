package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Test{

    public static void main(String[] args) {

        String[] myFavCars = {"opel", "toyota", "Lexus", "Ferarri"};

        System.out.println(myFavCars[2]);

        myFavCars[2] = "Honda";
        System.out.println(Arrays.toString(myFavCars));


        System.out.println(myFavCars.length);
        System.out.println(myFavCars[3]);


    }
}
