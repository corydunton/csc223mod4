package csc223_cdunton_mod4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordDataSummaryTest {

	private WordDataSummary wdsJava;
	private WordDataSummary wdsRome;

	@BeforeEach
	public void setup() {
		String textJava = "In the Java kingdom, the sun always shines, and the code always compiles.";
		wdsJava = new WordDataSummary(textJava);

		String textRome = "When in Rome, do as the Romans do.";
		wdsRome = new WordDataSummary(textRome);
	}

	@Test
	public void testFindMostPopularWordJava() {
		assertEquals("the", wdsJava.findMostPopularWord());
	}

	@Test
	public void testCountOccurrencesJava() {
		assertEquals(3, wdsJava.countOccurrences());
	}

	@Test
	public void testCountRepeatedWordsJava() {
		assertEquals(2, wdsJava.countRepeatedWords());
	}

	@Test
	public void testFindMostPopularWordRome() {
		assertEquals("do", wdsRome.findMostPopularWord());
	}

	@Test
	public void testCountOccurrencesRome() {
		assertEquals(2, wdsRome.countOccurrences());
	}

	@Test
	public void testCountRepeatedWordsRome() {
		assertEquals(1, wdsRome.countRepeatedWords());
	}

}
