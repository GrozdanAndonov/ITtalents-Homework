import java.util.Scanner;
public class zadacha14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete duljina na masiva:");
		double[] arr=new double[sc.nextInt()];
		double[] arr2=new double[arr.length];
		for(int i=0;i<arr.length;i++){
			System.out.println("Vuvedi chislo nomer "+ (i+1));
			arr[i]=sc.nextDouble();
		}
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>-2.99 && arr[i]<2.99){
				arr2[index]=arr[i];
				index++;
			}			
		}
		System.out.print("[");
			for (int i = 0; i < arr2.length; i++) {
				if(i==arr2.length-1){
					System.out.print(arr2[i]);
				}else{
					System.out.print(arr2[i]+", ");
				}				
			}
			System.out.println("]");		
		sc.close();
	}
}