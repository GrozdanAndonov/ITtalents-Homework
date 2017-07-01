
public class zadacha4dopulnitelni {

	public static void main(String[] args) {
		
//		Напишете програма, която сортира (подрежда елементите във
//				възходящ ред) масив, съдържащ само 0 и 1.
		
		int[] arr = {1,1,1,1,0,0,1,0};
		int count=0;
		for(int i = 0;i < arr.length; i++){
			if(arr[i]==1){
				count++;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(i<arr.length-count){
				arr[i]=0;
			}else{
				arr[i]=1;
			}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
		}
	}
}
