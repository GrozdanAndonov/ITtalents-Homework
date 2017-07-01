import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		boolean bol=true;
		for(int i=0; i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				bol=false;
				break;
			}
		}
		System.out.println(bol);
		sc.close();
	}
}
