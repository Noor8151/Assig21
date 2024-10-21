package assig;
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse each word: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            Stack stack = new Stack(word.length());

           
            for (char ch : word.toCharArray()) {
                stack.push(ch);
            }

            StringBuilder reversedWord = new StringBuilder();
            while (!stack.isEmpty()) {
                reversedWord.append(stack.pop());
            }
           
            reversedSentence.append(reversedWord).append(" ");
        }

        System.out.println("Reversed words: " + reversedSentence.toString().trim());
        scanner.close();
    }
}
