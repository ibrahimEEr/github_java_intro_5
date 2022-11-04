package arraylist_linkedlist_vector;

public class FooBarPractice {
    public static void main(String[] args) {
        printFoorBar();


    }

    public static void printFoorBar(){

        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if(i % 5 == 0) System.out.println("Bar");
            else if(i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }



    }









}
