import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
	
//		 Въведете число N чрез конзолата и изкарайте като
//		 резултат следния триъгълник с височина N:
//			 *
//	    	***
//		   *****
//	      .......
//Кaто допълнително упражнение – нарисувайте същия
//триъгълник, но незапълнен.

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
	//	int stars=1;
		int empty=n-2;
		int emptyMid=0;
		
//1zad.!!!	for(int rows=1;rows<=n;rows++){	
//			for(int cols=1;cols<=empty;cols++){
//				//prazni
//				System.out.print(" ");
//			}
//			for(int s=0;s<stars;s++){
//				System.out.print("*");
//			}
//			System.out.println();
//			stars+=2;
//			empty--;
//		}
//2zad.!!!		
		for(int rows=1;rows<=n;rows++){	
			for(int empt=empty;empt>=0;empt--){
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(int empt=1;empt<emptyMid;empt++){
				if(rows==n){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			if(rows!=1){
			System.out.print("*");
			}
			empty--;
			emptyMid+=2;
			System.out.println();
		}
		sc.close();
	}
}
