import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		System.out.println("Vuvedi razmer za masiva:");
		Scanner sc=new Scanner(System.in);
		int[] arr1= new int[sc.nextInt()];
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			System.out.println("Vuvedi chislo nomer "+(i+1));
			arr1[i]=sc.nextInt();
		}
		arr2[0]=arr1[0];
		arr2[arr2.length-1]=arr1[arr1.length-1];
		for(int i =1;i<arr1.length-1;i++){
			
			arr2[i]=arr1[i-1]+arr1[i];
			
		}
		System.out.print("[");
		for(int i=0;i<arr1.length;i++){
			if(i!=arr1.length-1){
			System.out.print(arr2[i]+", ");
			}else{
				System.out.print(arr2[i]);
			}
		}
		System.out.println("]");		
		sc.close();
	}
}
