import java.util.Scanner;

public class zadacha13 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int[] arr=new int[10];
		int del=num;
		for(int i=0;i<arr.length;i++){
			if(del%2==0){
				arr[i]=0;
			}else{
				arr[i]=1;
			}
			del=del/2;
			if(del<1){
				break;
			}
		}
		System.out.print("[");
		for(int i=arr.length-1;i>=0;i--){
			if(i!=0){
			System.out.print(arr[i]+", ");
			}else{
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
		sc.close();
	}
}