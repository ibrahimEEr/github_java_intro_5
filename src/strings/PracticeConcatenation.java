package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {


        /*
                TASK-1
                String wordPart1 = "le";
                String wordPart2 = "ar";
                String wordPart3 = "ning";

                NOTE: Use "+" operator for concatenation

                Expected output:
                learning
                 */

        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";

        String word = wordPart1 + wordPart2 + wordPart3;  // with +

        System.out.println(word);

        String newWord = wordPart1.concat(wordPart2).concat(wordPart3); // concat method

        System.out.println(newWord);

        /*
                TASK-2
                String sentencePart1 = "I can";
                String sentencePart2 = "learn Java";

                Expected output:
                I can learn Java
                 */

        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";
        String wholeSentence = sentencePart1.concat(" ").concat(sentencePart2);

        System.out.println(wholeSentence);










    }
}
