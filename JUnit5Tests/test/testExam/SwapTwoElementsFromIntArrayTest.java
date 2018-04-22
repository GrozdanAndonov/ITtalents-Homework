package test.testExam;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.exam.TasksFromExam;
import test.testExam.ReverseIntArrayTest.LongToBigInteger;

/**
 * @author Grozdan This test includes swapping two elements in array when input
 *         array is null, with only one element, even length, odd length, with
 *         negative arguments passed and arguments larger than the length of the
 *         array.
 */
final class SwapTwoElementsFromIntArrayTest {

	/**
	 * Testing if the method throws exception when the input array is null.
	 */
	@Test
	public void checkIfArrayIsNull() {
		this.checkArgumentsForException(() -> TasksFromExam.swapTwoElements(null, 1, 2));
	}

	/**
	 * Testing if the method can swap single element.
	 */
	@Test
	public void swapArrayWithSingleElement() {
		this.checkArguments(new int[] { 1 }, new int[] { 1 }, 0, 0);
	}

	/**
	 * Testing when the array has even length.
	 */
	@Test
	public void swapArrayWithEvenLength() {
		this.checkArguments(new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 1, 2, 5, 4, 3, 6 }, 2, 4);
	}

	/**
	 * Testing when the array has odd length.
	 */
	@Test
	public void swapArrayWithOddLength() {
		this.checkArguments(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 5, 4, 3 }, 2, 4);
	}

	/**
	 * Testing if the method throws IllegalArgumentException when it is empty.
	 */
	@Test
	public void swapEmptyArray() {
		this.checkArgumentsForException(() -> TasksFromExam.swapTwoElements(new int[] {}, 2, 0));
	}

	/**
	 * Testing if the method throws IllegalArgumentException when negative arguments
	 * are passed.
	 */
	@Test
	public void swapWithNegativeArgumentsPassed() {
		this.checkArgumentsForException(() -> TasksFromExam.swapTwoElements(new int[] {}, -12, -20));
	}

	/**
	 * Testing if the method throws IllegalArgumentException when the arguments
	 * passed are bigger than the length of the array.
	 */
	@Test
	public void swapWithArgumentsBiggerThanTheLengthOfTheInputArray() {
		this.checkArgumentsForException(() -> TasksFromExam.swapTwoElements(new int[] {}, 12, 20));
	}

	@SuppressWarnings("static-method")
	private void checkArgumentsForException(final LongToBigInteger arg) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> arg.applyAsBigInteger());
	}

	@SuppressWarnings("static-method")
	private void checkArguments(final int[] inputArray, final int[] expectedArray, final int firstIndex,
			final int secondIndex) {
		TasksFromExam.swapTwoElements(inputArray, firstIndex, secondIndex);
		Assert.assertArrayEquals(inputArray, expectedArray);
	}

}
