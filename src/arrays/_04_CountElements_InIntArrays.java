package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};


        int positives = 0;

        for (int number : numbers) {
            if(number > 0) positives++;
        }
        System.out.println(positives);

    }
}
