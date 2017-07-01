import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
//		Да се състави програма, която изчислява произведение на две
//		естествени числа =>2, като се използва само събиране.
//		Входни данни: 2 естествени числа.
//		Пример: 4, 5
//		Изход: 20

		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(multiply(a,b));
		sc.close();
	}
	
	static int multiply(int a , int b){
		if(b==1){
			return a;
		}
		return a+multiply(a,b-1);
		
		
	}

}
