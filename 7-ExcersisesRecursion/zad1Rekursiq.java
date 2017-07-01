import java.util.Scanner;

public class zad1Rekursiq {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a =nFactoriel(sc.nextInt());
		System.out.println(a);
	}
	static int nFactoriel(int n){
		if(n==1){
			//System.out.println(n);
			return 1;
		}else{
			//System.out.println(n);
			return n*nFactoriel(n-1);
		}
		
		
	}

}
