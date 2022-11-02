package arraylist_linkedlist_vector;

import java.util.*;

public class _06_Sorting {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> devices = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println(numbers);
        System.out.println(devices);

        Collections.sort(numbers);
        Collections.sort(devices);

        System.out.println(numbers);
        System.out.println(devices);



    }
}
