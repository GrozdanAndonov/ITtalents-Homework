import java.util.Arrays;
import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete golemina na masiva");
		int[] arr=new int[sc.nextInt()];
		for(int i = 0; i<arr.length;i++){
			System.out.println("Vuvedi chislo nomer "+(i+1));
			arr[i]=sc.nextInt();
		}
		int a=0;
		for(int i=0;i<arr.length/2;i++){
			a=arr[i];
			arr[i]=arr[arr.length-(i+1)];
			arr[arr.length-(i+1)]=a;
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
