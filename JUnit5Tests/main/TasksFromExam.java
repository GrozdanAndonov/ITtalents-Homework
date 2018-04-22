package main.exam;

/**
 * @author Grozdan tasks from the first exam
 */
public final class TasksFromExam {

	private TasksFromExam() {
		// utility class : only static methods
	}

	/**
	 * @param inputArray
	 *            array of integers
	 * @param firstIndex
	 *            first index for swapping
	 * @param secondIndex
	 *            second index for swapping
	 */
	public static void swapTwoElements(final int[] inputArray, final int firstIndex, final int secondIndex) {
		if (inputArray == null || firstIndex > inputArray.length - 1 || firstIndex < 0
				|| secondIndex > inputArray.length - 1 || secondIndex < 0) {
			throw new IllegalArgumentException();
		}
		final int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = temp;
	}

	/**
	 * @param inputArray
	 *            array of integers
	 */
	public static void reverseArray(final int[] inputArray) {
		if (inputArray == null) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < inputArray.length / 2; i++) {
			final int temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length - 1 - i];
			inputArray[inputArray.length - 1 - i] = temp;
		}
	}

	private static void reverseArrayInRange(final int[] inputArray, final int indexFrom, final int indexTo) {
		if (indexFrom < 0 || indexTo < 0 || indexFrom > inputArray.length - 1 || indexTo > inputArray.length - 1
				|| indexFrom > indexTo) {
			throw new IllegalArgumentException();
		}
		for (int a = indexFrom, b = indexTo; a <= b; a++, b--) {
			final int temp = inputArray[a];
			inputArray[a] = inputArray[b];
			inputArray[b] = temp;
		}
	}

	/**
	 * @param inputArray
	 *            input array for rotating right
	 * @param positions
	 *            rotating right
	 */
	public static void rotateArray(final int[] inputArray, final int positions) {
		if (inputArray == null) {
			throw new IllegalArgumentException();
		}
		int rotatingPositions = 0;
		if (positions > inputArray.length || positions < 0) {
			rotatingPositions = positions % inputArray.length;
			TasksFromExam.rotate(inputArray, rotatingPositions);
		} else {
			TasksFromExam.rotate(inputArray, positions);
		}

	}

	private static void rotate(final int[] inputArray, final int positions) {
		TasksFromExam.reverseArray(inputArray);
		if (positions < 0) {
			TasksFromExam.reverseArrayInRange(inputArray, 0, inputArray.length - 1 - (positions * -1));
			TasksFromExam.reverseArrayInRange(inputArray, inputArray.length - (positions * -1), inputArray.length - 1);
		} else {
			TasksFromExam.reverseArrayInRange(inputArray, 0, positions - 1);
			TasksFromExam.reverseArrayInRange(inputArray, positions, inputArray.length - 1);
		}
	}

}
