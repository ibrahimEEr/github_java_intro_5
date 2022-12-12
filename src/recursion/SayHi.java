package recursion;

import org.w3c.dom.ls.LSOutput;

public class SayHi {

    public static void main(String[] args) {

        sayHi(3);

    }

    public static void sayHi(int num){
        System.out.println("Hi");
        if(num <= 1) return;
        sayHi(num-1);

    }



}
