import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi chislo:");
		int num=sc.nextInt();
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++){
			if(i==0 || i==1){
				arr[i]=num;
			}else{	
				arr[i]=arr[i-1]+arr[i-2];
			}
		}
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("]");
		sc.close();
	}
}
