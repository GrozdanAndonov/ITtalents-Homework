
public class zadacha6 {

	public static void main(String[] args) {
		
		int[] arr1={1,2,3,4,1};
		int[] arr2={1,2,32,4};
		boolean bolEqual=true;
		boolean bolLength=true;
		if(arr1.length==arr2.length){
			
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					bolEqual=false;
					break;
				}
			}
		}else{
			bolLength=false;
		}
		
		if(bolLength){
			if(bolEqual){
				System.out.println("Ednakvi sa!");
			}else{
				System.out.println("S ednakva duljina, no sa razlichni!");
			}
		}else{
			System.out.println("Razlichni sa");
		}
		
		
		
	}
	
}
