package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(4.5, 10.5, 5.5, 20.0));

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        System.out.println(numbers.peekFirst());

        System.out.println(numbers.pop());
        System.out.println(numbers);

        System.out.println(numbers.poll());
        System.out.println(numbers);


        numbers.push(2.0);
        System.out.println(numbers);

        numbers.removeFirstOccurrence(2.0);
        System.out.println(numbers);




    }
}
