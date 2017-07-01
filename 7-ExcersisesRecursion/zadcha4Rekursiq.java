import java.util.Arrays;

public class zadcha4Rekursiq {

	public static void main(String[] args) {
		
		int[] arr1={1,2,3,4,5,12,323,12};
		int[] arr2={6,7,8,9,10,11};
		System.out.println(Arrays.toString(sumArrays(arr1,arr2)));
		
	}

	public static int[] sumArrays(int[] arr1,int[] arr2){
		int[] mas=new int[arr1.length+arr2.length];
		int index=0;
		
		for(int i=0;i<arr1.length;i++){
			mas[i]=arr1[i];
			index=i;
		}
		for(int i=0;i<arr2.length;i++){
			mas[i+(index+1)]=arr2[i];
		}
		return mas;
	}
	
}
