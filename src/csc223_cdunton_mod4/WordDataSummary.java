package csc223_cdunton_mod4;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Cory Dunton
 * Date: 9/23/2023
 * 
 * The WordDataSummary program analyzes a given text to provide insights about
 * the words contained within. The program should be case-insensitive and
 * consider only alphabetic characters.
 * 
 * You must implement the following methods: - findMostPopularWord: Returns the
 * most popular word in the text. - countOccurrences: Returns the count of how
 * many times the most popular word appears. - countRepeatedWords: Returns the
 * count of total words that repeat more than once.
 * 
 * Feel free to add whatever other fields and methods you find helpful!
 *
 * Run the associated JUnit tests to ensure your solution works. Optionally, you
 * can also use the main method provided below for your own testing.
 */
public class WordDataSummary {

	private String text;
	private Map<String, Integer> wordFrequency;

	public WordDataSummary(String text) {
		this.text = text.toLowerCase();
		wordFrequency = new HashMap<>();
	}

	/**
	 * Find the most popular word in the text.
	 * 
	 * @return The most popular word.
	 */
	public String findMostPopularWord() {
		wordFrequency.clear();
        String[] words = text.split("\\W+");
        String mostPopularWord = null;
        int maxFrequency = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                int frequency = wordFrequency.getOrDefault(word, 0) + 1;
                wordFrequency.put(word, frequency);

                if (frequency > maxFrequency) {
                    mostPopularWord = word;
                    maxFrequency = frequency;
                }
            }
        }

        return mostPopularWord;
	}

	/**
	 * Returns the count of how many times the most popular word appears.
	 * 
	 * @return Count of most popular word.
	 */
	public int countOccurrences() {
        String mostPopularWord = findMostPopularWord();

        if (mostPopularWord == null) {
            return 0;
        }

        return wordFrequency.get(mostPopularWord);
	}

	/**
	 * Returns the count of total words that repeat more than once.
	 * 
	 * @return Count of repeated words.
	 */
	public int countRepeatedWords() {
	    int repeatedWordsCount = 0;

	    for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
	        int frequency = entry.getValue();

	        if (frequency > 1) {
	            repeatedWordsCount += 1; // Increment by one for each word that repeats
	        }
	    }

	    return repeatedWordsCount;
	}

	// This main method might help you to run your code
	public static void main(String[] args) {
		WordDataSummary summary = new WordDataSummary("When in Rome, do as the Romans do.");
		System.out.println("Most popular word: " + summary.findMostPopularWord());
		System.out.println("Occurrences: " + summary.countOccurrences());
		System.out.println("Repeated words count: " + summary.countRepeatedWords());
		
		summary = new WordDataSummary("In the Java kingdom, the sun always shines, and the code always compiles.");
		System.out.println("Most popular word: " + summary.findMostPopularWord());
		System.out.println("Occurrences: " + summary.countOccurrences());
		System.out.println("Repeated words count: " + summary.countRepeatedWords());
	}
}
