package test.testExam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.exam.TasksFromExam;
import test.testExam.ReverseIntArrayTest.LongToBigInteger;

/**
 * @author Grozdan This test includes rotating array with: negative position
 *         variable and positive-larger than the length of the array, odd
 *         length, even length, null argument passed,
 */
final class RotateArrayTest {
	
	/**
	 * Checks if rotateArray throws IllegalArgumentException when the input array is
	 * null.
	 */
	@Test
	public void checkIfArrayIsNull() {
		this.checkArgumentsForException(() -> TasksFromExam.rotateArray(null, 3));
	}

	/**
	 * Test for correct result when rotating an array with even length.
	 */
	@Test
	public void rotateArrayWithEvenLength() {
		checkArrays(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }, 3);
	}

	/**
	 * Test for correct result when rotating an array with odd length.
	 */
	@Test
	public void rotateArrayWithOddLength() {
		checkArrays(new int[] { 1, 2, 3, 4 }, new int[] { 2, 3, 4, 1 }, 3);
	}

	/**
	 * Testing the rotation of the array when the positions variable is larger than
	 * the size of the array.
	 */
	@Test
	public void rotateArrayWithMorePositionsThanTheLengthOfTheArray() {
		checkArrays(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 2, 3, 4, 5, 6, 7, 1 }, 20);
	}

	/**
	 * Testing the rotation of the array when the positions variable is negative.
	 */
	@Test
	public void rotateArrayWithNegativePositions() {
		checkArrays(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 4, 5, 6, 7, 1, 2, 3 }, -3);
	}

	/**
	 * Testing the rotation of the array when the positions variable is negative and
	 * module the variable is larger than the length of the array
	 */
	@Test
	public void rotateArrayWithNegativeAndGreaterThanTheLengthOfTheArray() {
		checkArrays(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 3, 4, 5, 6, 7, 1, 2 }, -30);
	}

	@SuppressWarnings("static-method")
	private void checkArgumentsForException(final LongToBigInteger arg) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> arg.applyAsBigInteger());
	}

	@SuppressWarnings("static-method")
	private void checkArrays(final int[] inputArray, final int[] expectedArray, final int positions) {
		TasksFromExam.rotateArray(inputArray, positions);
		Assertions.assertArrayEquals(expectedArray, inputArray);
	}

}
