package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "Javascript", "Ruby", "Go", "java", "Ruby", "Java"));

        ArrayList<String> uniques = new ArrayList<>();

        for (String language : languages) {
            if(!uniques.contains(language)) uniques.add(language);
        }
        System.out.println(uniques);
        System.out.println(languages);



        

    }
}
