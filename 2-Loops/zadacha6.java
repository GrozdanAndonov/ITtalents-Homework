import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
		
		//  Да се прочете число от екрана(конзолата) и да се
		//изведе сбора на всички числа между 1 и въведеното число.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
