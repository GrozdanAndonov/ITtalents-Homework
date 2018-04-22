package test.testExam;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.exam.TasksFromExam;

/**
 * @author Grozdan This test includes reversing input char array with: no
 *         elements, one element, odd length, even length, null argument passed,
 */
public final class ReverseIntArrayTest {

	/**
	 * Testing reverseArray with two arrays with a single element inside them.
	 */

	@Test
	public void reverseArrayWithASingleElementTest() {
		this.checkInputs(new int[] { 1 }, new int[] { 1 });
	}

	/**
	 * Testing reverseArray with two arrays is the input. The length of the arrays
	 * is odd.
	 */

	@Test
	void reverseArrayWithOddLengthTest() {
		this.checkInputs(new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 });
	}

	/**
	 * Testing reverseArray with two arrays is the input. The length of the arrays
	 * is even.
	 */

	@Test
	void reverseWithEvenLengthTest() {
		this.checkInputs(new int[] { 1, 2, 3, 4 }, new int[] { 4, 3, 2, 1 });
	}

	/**
	 * Testing reverseArray if it throws IllegalArgumentException after empty array
	 * is passed. Empty array is passed as argument.
	 */

	@Test
	void emptyArrayTest() {
		this.checkInputs(new int[] {}, new int[] {});
	}

	/**
	 *
	 * Testing reverseArray if it throws IllegalArgumentException after null array
	 * is passed.Null array is passed as argument.
	 *
	 */

	@Test
	void arrayIsNullTest() {
		this.checkForBadArgument(() -> TasksFromExam.reverseArray(null));
	}

	/**
	 * passing Executable argument to assertThrows using the private interface
	 * LongToBigInteger
	 *
	 * @param LongToBigInteger
	 */

	@SuppressWarnings("static-method")
	private void checkForBadArgument(final LongToBigInteger argument) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> argument.applyAsBigInteger());
	}

	/**
	 * @param inputArray
	 * @param expectedOutput
	 */

	@SuppressWarnings("static-method")
	private void checkInputs(final int[] inputArray, final int[] expectedOutput) {
		TasksFromExam.reverseArray(inputArray);
		Assert.assertArrayEquals(expectedOutput, inputArray);
	}

	/**
	 * @author Grozdan
	 *
	 */
	public interface LongToBigInteger {
		/**
		 * used for passing an argument to methods who need Executable inside them
		 */
		void applyAsBigInteger();
	}
}
