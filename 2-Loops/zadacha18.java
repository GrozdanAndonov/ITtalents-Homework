import java.util.Scanner;

public class zadacha18 {

	public static void main(String[] args) {
		
//		Да се състави програма, чрез която се въвежда две числа от
//		интервала [1..9].
//		Програмата да извежда таблицата за умножение.
//		Максималната стойност на множителите е определена от 2-те
//		числа.
//		Пример: 2 2
//		Изход:
//		1*1= 1;
//		1*2= 2;
//		2*1= 2;
//		2*2= 4;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers[1-9]");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for(int i=1;i<=num1;i++){		
			for(int a=1;a<=num2;a++){
				System.out.println(i+"*"+a+"="+i*a);
			}
		}	
		sc.close();
	}
}
