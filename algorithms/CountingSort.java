import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {

		int[] arr = { 3, -5, 2, 3, -6, 1, 1 };
		countingSort(arr);

		System.out.println(Arrays.toString(arr));
	}

		
	
	static void countingSort(int[] arr) {

		// find MAX and MIN
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}			
		
		// create helper with max-min+1 elements
		int[] helper = new int[max - min + 1];
		//count numbers and add in helper
		
		for (int i = 0; i < arr.length; i++) {
			helper[arr[i]-min]++;
		}
		
		// add in original the numbers in their order
		int originalIndex = 0;
		for (int i = 0; i < helper.length; i++) {
			while(helper[i]-->0){
				arr[originalIndex++] = min+i;
			}
		}
	}

}
