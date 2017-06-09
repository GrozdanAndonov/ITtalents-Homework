
public class zadacha8 {

	public static void main(String[] args) {
		
		int[] arr={1,2,2,2,3,3,4};
		
			int count=1;
			int num=0;
			int longest=0;
		for(int i=0;i<arr.length-1;i++){		
			if(arr[i]==arr[i+1]){
				count++;	
				if(count>=longest){
					longest=count;
					num=arr[i];
				}
			}else{
				count=1;
			}
		}
		for(int i=0;i<longest;i++){
			System.out.print(num+" ");
		}
	}
}
