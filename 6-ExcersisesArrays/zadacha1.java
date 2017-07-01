import java.util.Scanner;
public class zadacha1 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete  duljina na masiva:");
		int[] arr=new int[sc.nextInt()];
		boolean bol=true;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]<0){
				bol=false;
				break;
			}
		}
		if(bol){
		System.out.println("Chislata sa polojitelni");
		}else{
			System.out.println("Ne sa vsichki polojitelni.");
		}
		
		
		sc.close();
	}
	
}
