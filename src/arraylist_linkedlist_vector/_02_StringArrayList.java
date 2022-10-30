package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");

        System.out.println(cities);
        System.out.println("The size of the ArrayList = " + cities.size());

        cities.set(2, "Evanston");
        System.out.println(cities);

                        /*
            Create an ArrayList and store below cities in it
            Chicago
            Berlin
            Miami

            Print the size of the ArrayList
            Print the ArrayList

            EXPECTED:
            3
            [Chicago, Berlin, Miami]
             */


        cities.remove("Berlin");
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println(cities.remove(0));

        System.out.println(cities);
        System.out.println(cities.size());


        //Task - 4
        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());



        cities.clear();
        System.out.println(cities);
        System.out.println(cities.size());







    }
}
