import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[7];
		double mid=0;
		double adder=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("Vuvedi chislo nomer "+(i+1));
			arr[i]=sc.nextInt();
			adder+=arr[i];
		}
		mid=adder/7;
		System.out.println(mid);
		double minSubstr=1000;
		double substr=0;
		int num=0;
		for(int i=0;i<arr.length;i++){
			substr=Math.max(mid, arr[i])-Math.min(mid, arr[i]);
			if(substr<=minSubstr){
				minSubstr=substr;
				num=arr[i];
			}
		}
		System.out.println(num);	
		sc.close();
	}

}
