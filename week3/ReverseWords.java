import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate through each word, reverse its characters, and append it to the result
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = reverseString(word);
            result.append(reversedWord).append(" ");
        }

        // Output the modified sentence
        System.out.println("Reversed words in the sentence: " + result.toString().trim());
    }

    // Method to reverse a string
    public static StringBuilder reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed;
    }
}