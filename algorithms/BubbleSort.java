import java.util.Arrays;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		
		int[] arr = {3,5,1,6,2};
		optimizedBubbleSort(arr);
		System.out.println(Arrays.toString(arr));	
		}
	
		static void optimizedBubbleSort(int[] arr){
			boolean hasSwap = false;
			for (int i = 0; i < arr.length; i++) {
				hasSwap = false;
				for (int j = 0; j < arr.length-1; j++) {
					
					if(arr[j]>arr[j+1]){
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1] = temp;
						hasSwap = true;
					}
				}
				if(!hasSwap){
					return;
				}
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

