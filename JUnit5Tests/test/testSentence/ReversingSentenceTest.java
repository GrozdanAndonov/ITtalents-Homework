package testSentence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.sentence.ReverseSentence;
import test.testExam.ReverseIntArrayTest.LongToBigInteger;

/**
 * @author Grozdan This test includes reversing whole sentence which is char
 *         array with the words including extra spaces and empty char array and
 *         special characters.
 */
final class ReversingSentenceTest {

	/**
	 * Testing method with several spaces.
	 */
	@SuppressWarnings("nls")
	@Test
	void testWithSeveralSpaces() {
		checkInputs("Az   sum bulgarche", "bulgarche sum   Az");
	}

	/**
	 * Testing method with one word only.
	 */
	@SuppressWarnings("nls")
	@Test
	void testWithOneWordOnly() {
		checkInputs("bulgarche", "bulgarche");
	}

	/**
	 * Testing method with one word and extra spaces.
	 */
	@SuppressWarnings("nls")
	@Test
	void testWithOneWordAndSpaces() {
		checkInputs("  bulgarche", "bulgarche  ");
	}

	/**
	 * Testing with numbers instead of words.
	 */
	@SuppressWarnings("nls")
	@Test
	void testWithDigits() {
		checkInputs("4 5 6", "6 5 4");
	}

	/**
	 * Testing with empty array passed as argument.
	 */
	@SuppressWarnings("static-method")
	@Test
	void testWithEmptyArray() {
		final char[] sentence = new char[5];
		ReverseSentence.reverseSentenceFromCharArray(sentence);
		Assertions.assertArrayEquals(new char[5], sentence);
	}

	/**
	 * Testing with special characters, extra spaces and several words.
	 */
	@SuppressWarnings("nls")
	@Test
	void testWithSpecialCharactersAndMoreSpaces() {
		checkInputs("Az%@   @#sum bulga@rche", "bulga@rche @#sum   Az%@");
	}

	/**
	 * Testing if exception is thrown when null array is passed.
	 */
	@Test
	void testWithNullArrayPassedAsArgument() {
		checkArgumentsForException(() -> ReverseSentence.reverseSentenceFromCharArray(null));
	}

	@SuppressWarnings("static-method")
	private void checkArgumentsForException(final LongToBigInteger arg) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> arg.applyAsBigInteger());
	}

	@SuppressWarnings("static-method")
	private void checkInputs(final String inputSentence, final String expectedOutput) {
		final char[] input = inputSentence.toCharArray();
		final char[] expectOut = expectedOutput.toCharArray();
		ReverseSentence.reverseSentenceFromCharArray(input);
		Assertions.assertArrayEquals(expectOut, input);
	}

}
