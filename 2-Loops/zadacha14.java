import java.util.Scanner;

public class zadacha14 {

	public static void main(String[] args) {
		
//		 Да се състави програма, която по въведено
//		 естествено число N от интервала [10..200] извежда в обратен
//		 ред всички числа, които са кратни на 7 и са по-малки от N.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num[10-200]:");
		int num=sc.nextInt();
		if(num<10 || num>200){
			System.out.println("Not in the interval!");
		}else{
			
			for(int i=num;i>0;i--){
				if(i%7==0 && i<num){
						System.out.println(i);
				}
			}
		}
		sc.close();
	}
}