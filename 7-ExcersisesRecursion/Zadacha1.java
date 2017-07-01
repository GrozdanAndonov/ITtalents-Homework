import java.util.Scanner;
public class Zadacha1 {
	public static void main(String[] args) {
		
//		Да се състави програма, която изчислява N-тото число на Фибоначи.
//		Първото и второто число на Фибоначи са 1-ци, всяко следващо е равно
//		на сбора на предходните 2.
//		Пример: 8
//		Изход: 21
//		Първите 5 числа на Фибоначи са : 1, 1, 2, 3, 5, 8, 13, 21
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibon(n));
		sc.close();
	}
	static int fibon(int n){
		
		if(n==1 || n==2){
			return 1;
		}
		return fibon(n-1)+fibon(n-2);
		
	}
}
