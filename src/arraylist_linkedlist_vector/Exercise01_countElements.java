package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {

        //ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Brown","Pink"));
        // gibi dogrudan assign yapabilirsin
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
            }

        //Counting elements that has 6 characters
        int counter = 0;

        for (String color : colors) {
            if(color.length() == 6) counter++;
            }
        System.out.println(counter); //2


        int oCounter = 0;
        for (String color : colors) {
            if(color.contains("o")) oCounter++;
        }
        System.out.println(counter);


        oCounter = 0;
        for (int i = 0; i < colors.size() ; i++) {
           if(colors.get(i).contains("o")) oCounter++;
        }
        System.out.println(oCounter);
    }
}
