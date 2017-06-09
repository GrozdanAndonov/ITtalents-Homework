import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Vuvedete duljina na masiva:");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			System.out.println("Vuvedi chislo nomer "+(i+1));
			arr[i]=sc.nextInt();
		}
		boolean bol=true;
		for(int i=0;i<arr.length/2;i++){
			if(arr[i]!=arr[(arr.length-1)-i]){
				bol=false;
				break;
			}
		}
		if(bol){
			System.out.println("Ogledalen e!");
		}else{
			System.out.println("Ne e ogledalen");
		}
		sc.close();
	}

}
