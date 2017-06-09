
public class zadacha17 {

	public static void main(String[] args) {
	
		int[] arr={1 ,3, 2 ,4, 9, 7};
		boolean bol=true;
		for (int i = 0; i < arr.length-1; i++) {
			if((i+1)%2!=0 && arr[i]<arr[i+1]){
				bol=true;
			}else{
				if((i+1)%2==0 && arr[i]>arr[i+1]){
					bol=true;
				}else{
					bol=false;
					break;
				}
			}
		}
			System.out.println(bol);
	}
}
