
public class zadacha1dopulnitelni {

	public static void main(String[] args){
		
//		Напишете програма, която проверява дали в масив от цели
//		числа всички числа са неотрицателни.

		
		int[] arr={1,-2,3,4};
		boolean bol=true;
		for(int i = 0; i < arr.length; i++){			
			if(arr[i]<0){
				bol=false;
				break;
			}			
		}
		
	System.out.println(bol);
		
		
		
		
	}
}
