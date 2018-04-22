package main.sentence;

/**
 * @author Grozdan reversing whole char array which is sentence
 *
 */
public final class ReverseSentence {

	private ReverseSentence() {
		// utility class - only static methods
	}

	/**
	 * This method reverses sentence which is array of chars as input and keeping
	 * the words as they are with O(N) time complexity and O(1) memory complexity
	 *
	 * @param sentence
	 *            sentence char array
	 * @throws IllegalArgumentException
	 *             when the input char array is null
	 */
	public static void reverseSentenceFromCharArray(final char[] sentence) {
		if (sentence == null) {
			throw new IllegalArgumentException();
		}
		int startingIndex = -1;
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i] == ' ') {
				continue;
			}
			if (startingIndex < 0) {
				startingIndex = i;
			}
			if (i + 1 == sentence.length || sentence[i + 1] == ' ') {
				ReverseSentence.reverseArrayInRange(sentence, startingIndex, i);
				startingIndex = -1;
			}
		}
		ReverseSentence.reverseArrayInRange(sentence, 0, sentence.length - 1);
	}

	private static void reverseArrayInRange(final char[] inputArray, final int fromIndex, final int toIndex) {
		if (inputArray == null || fromIndex < 0 || fromIndex > inputArray.length - 1 || toIndex < 0
				|| toIndex > inputArray.length - 1) {
			throw new IllegalArgumentException();
		}
		for (int a = fromIndex, b = toIndex; a <= b; a++, b--) {
			ReverseSentence.swap(inputArray, a, b);
		}
	}

	private static void swap(final char[] inputArray, final int firstIndex, final int secondIndex) {
		final char temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = temp;
	}

}
