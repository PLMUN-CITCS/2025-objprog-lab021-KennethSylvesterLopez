import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Get sentence from the user
        String sentence = getSentenceInput();

        // Count the number of words
        int wordCount = countWords(sentence);

        // Display the word count to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        
        // Read the full sentence using nextLine()
        String sentence = input.nextLine();

        // Close the scanner after use
        input.close();
        
        // Return the entered sentence
        return sentence;
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Trim any leading or trailing whitespace
        sentence = sentence.trim();

        // Check for empty sentence
        if (sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Return the word count
        return words.length;
    }
}
