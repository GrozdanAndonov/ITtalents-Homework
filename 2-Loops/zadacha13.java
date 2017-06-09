import java.util.Scanner;

public class zadacha13 {

	public static void main(String[] args) {
		
//		Да се състави програма, която извежда всички
//		естествени трицифрени числа, които имат сбор на цифрите равен
//		на дадено число.
//		Дадено : sum, където 2>=sum<=27.
//		Пример: 26
//		Изход: 899, 989, 998.
		Scanner sc=new Scanner(System.in);
		int part1=0;
		int part2=0;
		int part3=0;
		System.out.println("Vuvedi chislo:");
		int num=sc.nextInt();
		for(int i=100;i<=999;i++){			
			 part1=i/100%10;
			 part2=i/10%10;
			 part3=i%10;
			int sum=part1+part2+part3;
			if(sum==num){
				System.out.println(i);
			}
		}
		sc.close();
	}
}
