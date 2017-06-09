import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number for array's length:");
		int[] arr=new int[sc.nextInt()];
		int min=1000000000;
		for(int i=0;i<arr.length;i++){
			System.out.println("Vuvedete chislo nomer "+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int el=0;el<arr.length;el++){
			if(arr[el]<min && arr[el]%3==0){
				min=arr[el];
			}
		}
		System.out.println("Nai-malkoto chislo kratno na 3 e:"+min);
		sc.close();
	}
}
