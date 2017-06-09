import java.util.Scanner;

public class zadacha5 {
	public static void main(String[] args) {
		
//		Да се въведат от потребителя 2 числа. И да се
//		изведат на екрана всички числа от по-малкото до по-голямото.

		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedi num1:");
		int num1=sc.nextInt();
		System.out.println("Vuvedi num2:");
		int num2=sc.nextInt();
		
		if(num1>num2){
			for(int n=num2;n<=num1;n++){
				System.out.println(n);
			}
		}else{
			if(num1<num2){
				for(int n=num1;n<=num2;n++){
					System.out.println(n);
				}
			}
		}
		sc.close();
	}
}
