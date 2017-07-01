import java.util.Scanner;
public class zadacha2 {

	
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Vuvedete duljina na masiva:");
			int arr[]=new  int[sc.nextInt()];
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			boolean bol=true;
			for(int i=1;i<arr.length-1;i++){
				if(!(arr[i]>arr[i-1] && arr[i]>arr[i+1])||(arr[i]<arr[i-1] && arr[i]>arr[i+1])){
				bol=false;
				break;
			}
			}
			System.out.println(bol);
		sc.close();
		}
}
