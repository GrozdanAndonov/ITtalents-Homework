import java.util.Scanner;

public class zadacha15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete duljina na masiva!");
		double[] arr=new double[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Vuvedi chislo nomer "+(i+1));
			arr[i]=sc.nextDouble();
		}
		double num1=0;
		double num2=0;
		double num3=0;
		double maxSum=0;
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if(i!=j && i !=j2 && j!=j2){
					sum=arr[i]+arr[j]+arr[j2];
					if(sum>maxSum){
						maxSum=sum;
						num1=arr[i];
						num2=arr[j];
						num3=arr[j2];
					}
					}
				}
			}
		}
		System.out.println(num1 + " "+ num2+" "+ num3+ "Sum:" + maxSum);
		sc.close();		
	}
}
