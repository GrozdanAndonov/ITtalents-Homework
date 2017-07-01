import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] arr={'a','s','d'};
		char ch=sc.next().charAt(0);
		boolean bol=false;
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ch){
				bol=true;
				index=i;
				break;
			}
		}
		if(bol){
			System.out.println(bol+" "+index);
		}else{
			System.out.println("Nqma!");
		}
		sc.close();
	}
}
