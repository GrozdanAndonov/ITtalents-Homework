import java.util.Scanner;

public class zadacha16 {

	public static void main(String[] args) {
		
//		Да се състави програма, чрез която се въвеждат 2 естествени
//		числа N, M от интервала [10..5555].
//		Програмата, чрез цикъл for, да извежда всички числа от
//		интервала, които са кратни на 50 в низходящ ред.
//		Пример: 25,249
//		Изход: 200,150,100, 50.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in range[10-5555] two numbers:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		if((n<10 || n>5555)||(m<10||m>5555)){
			System.out.println("Not in range!");
		}else{
		for(int i=m;i>=n;i--){
			if(i%50==0){
				System.out.println(i);
			}
		}
		}
		sc.close();
	}
}