package csc223_cdunton_mod4;

/**
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

	public WordDataSummary(String text) {
		this.text = text.toLowerCase();
	}

	/**
	 * Find the most popular word in the text.
	 * 
	 * @return The most popular word.
	 */
	public String findMostPopularWord() {
		// TODO
		return "TBD"; // update
	}

	/**
	 * Returns the count of how many times the most popular word appears.
	 * 
	 * @return Count of most popular word.
	 */
	public int countOccurrences() {
		// TODO
		return 0; // update
	}

	/**
	 * Returns the count of total words that repeat more than once.
	 * 
	 * @return Count of repeated words.
	 */
	public int countRepeatedWords() {
		// TODO
		return 0; // update
	}

	// This main method might help you to run your code
	public static void main(String[] args) {
		WordDataSummary summary = new WordDataSummary("When in Rome, do as the Romans do.");
		System.out.println("Most popular word: " + summary.findMostPopularWord());
		System.out.println("Occurrences: " + summary.countOccurrences());
		System.out.println("Repeated words count: " + summary.countRepeatedWords());
	}
}
