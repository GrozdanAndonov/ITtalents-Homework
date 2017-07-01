import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		
//		Да се състави програма, която проверява дали въведено естествено
//		число е просто.
//		Пример: 101
//		Изход: просто

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(prosto(a,a-1));
		sc.close();
		
	}

	static int prosto(int a,int div){
		if(div==1){
			return 1;
		}
		if(a%div==0){
			return -1;
		}
			return prosto(a,div-1);
	}
	
}
