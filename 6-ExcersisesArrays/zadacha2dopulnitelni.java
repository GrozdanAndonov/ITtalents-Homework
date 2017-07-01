
public class zadacha2dopulnitelni {

	public static void main(String[] args){
//		Едномерен масив наричаме назъбен, ако всеки елемент в
//		масива е < от предишния и > от следващия. Напишете
//		програма, която проверява дали даден масив от числа е
//		назъбен.
		int[] arr={1,3,2,4,1,5,1};
		boolean result=true;
		for(int i = 1; i < arr.length-1; i++){
			if(!((arr[i]<arr[i-1]&&arr[i]<arr[i+1])||(arr[i]>arr[i-1]&&arr[i]>arr[i+1]))){
				result=false;
				break;
			}			
		}
		System.out.println(result);
	}
}
