
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6 };
		
		int x = 3;
			int result = binarySearch(arr,x,0,arr.length-1);
		System.out.println(result);
		
	}

	
	static int binarySearch(int[] arr, int num, int left, int right){	
	
		if(left > right){
			return -1;
		}
		int mid = (left+right)/2;
		if(arr[mid] == num){
			return mid;
		}else if(arr[mid]>num){
			return binarySearch(arr,num,left,mid-1);
		}else{
			return binarySearch(arr,num,mid+1, right);
		}	
	}
}
