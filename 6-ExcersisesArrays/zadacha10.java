
public class zadacha10 {

	public static void main(String[] args) {
		
		int[] arr={1,1,1,3,3,1,1,3,3,3,3,1};

		int count=0;
		int elem=-1;
		for(int i=0;i<arr.length;i++){
			count=1;
			for(int a=0;a<arr.length;a++){	
				if(arr[i]==arr[a] && i!=a){
					count++;
					elem=arr[i];
				}
			}
			
		}
		System.out.println(elem+":"+count);
	}

}
