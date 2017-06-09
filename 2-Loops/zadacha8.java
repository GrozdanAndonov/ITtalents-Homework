import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
		
//		По зададено число n, да се изведе на екрана таблица по
//		следния начин:
//		Пример:
//		Въведете n:
//		2
//		11
//		33		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int nums=n-1;
		for(int rows=1;rows<=n;rows++){
			for(int cols=1;cols<=n;cols++){
				System.out.print(nums);	
			}
			System.out.println();
			nums+=2;
		}	
		sc.close();
	}
}
