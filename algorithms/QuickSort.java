import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = { 3, -5, 1, 2, 3, -6, 1, 1 };

		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void quickSort(int[] arr,int left, int right){
		if(left>=right){
			return;
		}
		
	int index = partition(arr,left,right);
		quickSort(arr,left,index-1);
		quickSort(arr,index+1,right);
	}
	
	static int partition(int[] arr, int left, int right){
		//izbirame pivot
		int pivot = arr[(int) ((Math.random() * (right - left + 1)) + left)]; //arr[right]
		swap(arr, right, pivot);
		pivot = right;
		//minavame vsichki elementi i sravnqvame elementite s pivota
		int index = left;
		for (int i = left; i < right; i++) {	
			//ako sa po-malki ot pivota-slagame gi v nachaloto
			if(arr[i] <  pivot){
				swap(arr,i,index++);
			}
		}
		swap(arr,right,index);
		//nakraq slagame pivota na poziciqta sled posledniq podreden po-maluk element	
		return index;
	}
	static void swap(int[] arr, int index1, int index2){
		
		int temp=arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}
}
