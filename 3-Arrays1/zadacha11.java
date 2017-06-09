import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Vuvedete duljina na masiva!");
		int[] arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Vuvedi chislo nomer "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0 && arr[i]>5){
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}
