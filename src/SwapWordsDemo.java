import java.util.Scanner;
import java.util.Stack;

/**
 * Title: SwapWords Program
 *
 * Description: This program takes the input text from the user and reverses the words of each sentence.
 * The text is read until a period within the sentence is encountered, at which point the words
 * in the sentence are reversed using a stack data structure.
 */
public class SwapWordsDemo {

    /**
     * Reverses the words in each sentence of the input text.
     * @param inputText The text entered by the user.
     * @return The reversed sentences.
     */
    public static String SwapWords(String inputText) {
        Stack<String> wordStack = new Stack<>();
        String result = "";
        String[] words = inputText.split(" ");

        for (String word : words) {
            if (word.endsWith(".")) {
                // Remove period and push word onto the stack
                wordStack.push(word.substring(0, word.length() - 1));

                // Pop all words from the stack to reverse the sentence
                while (!wordStack.isEmpty()) {
                    result += wordStack.pop() + " ";
                }

                // Add period and start a new sentence
                result = result.trim() + ". ";
            } else {
                wordStack.push(word);
            }
        }
        return result.trim(); // Trim any extra spaces at the end
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter some text (end sentences with a period):");
        String userInput = scanner.nextLine();

        // Call the SwapWords method and display the result
        String reversedText = SwapWords(userInput);
        System.out.println("Reversed sentences:");
        System.out.println(reversedText);

        scanner.close();
    }
}
