import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {3,5,2,6,1};
		//selectionSort(arr);
		optimizedSelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void optimizedSelectionSort(int[] arr){
	
		int start = 0;
		int end = arr.length-1;
		
		for (int i = 0; i < arr.length/2; i++) {
			
			int maxIndex = start;
			int minIndex = start;
			
			for (int j = start; j <= end; j++) {				
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
				if(arr[maxIndex]<arr[j]){
					maxIndex = j;
				}		
			}
			
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[end];
			arr[end] = temp;
			
			if(end == minIndex){
				minIndex = maxIndex;
			}
			
			temp = arr[minIndex];
			arr[minIndex] = arr[start];
			arr[start] = temp;
			
			end--;
			start++;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static void optimizedSelectionSort(int[] arr){
//		
//		
//		int start = 0;
//		int end = arr.length - 1;
//		
//		for (int i = 0; i < arr.length / 2; i++) {
//			
//			int maxIndex = start;
//			int minIndex = start;
//			
//			for (int index = start; index <= end; index++) {
//				
//				if(arr[index] > arr[maxIndex]){
//					maxIndex = index;
//				}
//				if(arr[index] < arr[minIndex]){
//					minIndex = index;
//				}
//			}
//			
//			int temp = arr[maxIndex];
//			arr[maxIndex] = arr[end];
//			arr[end] = temp;
//			
//			if(minIndex == end){
//				minIndex = maxIndex;
//			}
//			
//			temp = arr[minIndex];
//			arr[minIndex] = arr[start];
//			arr[start] = temp;
//
//			end--;
//			start++;
//			
//		}
//
//	}
//	
//	static void selectionSort(int[] arr){
//		int maxIndex = arr.length-1;
//		
//		for (int i = 1; i < arr.length; i++) {
//			int numMaxIndex=0;
//			for (int j = 1; j <= maxIndex; j++) {
//				if(arr[numMaxIndex]<arr[j]){
//					numMaxIndex = j;
//				}
//			}
//			if(maxIndex!=numMaxIndex){
//			int temp = arr[maxIndex];
//			arr[maxIndex] = arr[numMaxIndex];
//			arr[numMaxIndex] = temp;
//			}
//			maxIndex--;
//		}	
//	}
//	
}
