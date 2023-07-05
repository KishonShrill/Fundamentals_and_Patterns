import java.util.HashMap;
import java.util.Map;

/**
 * The WordSignatureAnalyzer class is used to analyze the signature of words
 * and compare them with a target signature.
 */
public class WordSignatureAnalyzer {
    private Map<String, Integer> targetSignature;
    private Map<String, Integer> signature;
    private boolean hasOneExcessiveWord;

    /**
     * Constructs a WordSignatureAnalyzer object with the target signature
     * calculated based on the given words.
     *
     * @param words The array of words to calculate the target signature from.
     */
    public WordSignatureAnalyzer(String[] words) {
        targetSignature = new HashMap<>();
        signature = new HashMap<>();
        hasOneExcessiveWord = false;

        calculateTargetSignature(words);
    }

    private void calculateTargetSignature(String[] words) {
        for (String word : words) {
            targetSignature.put(word, targetSignature.getOrDefault(word, 0) + 1);
            /*
            *
            * Broken Down Form:
            *
            * int count = targetSignature.getOrDefault(word, 0);
            * count++;
            * targetSignature.put(word, count);
            *
            * */
        }
    }

    /**
     * Analyzes the signature of the given words and compares them with the target signature.
     *
     * @param words The array of words to analyze and compare.
     */
    public void analyzeWords(String[] words) {
        calculateSignature(words);
        compareSignatures();
    }

    private void calculateSignature(String[] words) {
        signature.clear();
        for (String word : words) {
            signature.put(word, signature.getOrDefault(word, 0) + 1);
            /*
             *
             * Broken Down Form:
             *
             * int count = signature.getOrDefault(word, 0);
             * count++;
             * signature.put(word, count);
             *
             * */
        }
    }

    private void compareSignatures() {
        for (Map.Entry<String, Integer> entry : targetSignature.entrySet()) {
            String word = entry.getKey();
            int targetCount = entry.getValue();
            int count = signature.getOrDefault(word, 0);

            if (count != targetCount) {
                hasOneExcessiveWord = true;
                break;
            }
        }
    }

    /**
     * Checks if there is at least one word that doesn't match the target signature.
     *
     * @return true if there is at least one word that doesn't match the target signature,
     *         false otherwise.
     */
    public boolean hasOneExcessiveWord() {
        return hasOneExcessiveWord;
    }

    /**
     * The main method demonstrates the usage of the WordSignatureAnalyzer class.
     * It creates an instance of WordSignatureAnalyzer, provides sample target words
     * and words to analyze, and prints whether the words match the target signature or not.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        String[] targetWords = {"apple", "banana", "cherry", "apple"};
        String[] wordsToAnalyze = {"apple", "banana", "cherry", "orange"};

        WordSignatureAnalyzer analyzer = new WordSignatureAnalyzer(targetWords);
        analyzer.analyzeWords(wordsToAnalyze);

        if (analyzer.hasOneExcessiveWord()) {
            System.out.println("The words do not match the target signature.");
        } else {
            System.out.println("The words match the target signature.");
        }
    }
}
