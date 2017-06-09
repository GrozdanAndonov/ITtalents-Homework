import java.util.Scanner;
public class zadacha19 {

	public static void main(String[] args) {
		
//		 Да се състави програма, чрез която по въведено
//		 естествено число от интервала [10..99] се извежда поредица
//		 числа, при спазване на следните изисквания:
//		 1) ако предходното число е четно се извежда 0.5*числото;
//		 2) ако предходното число е нечетно се извежда 3*числото +1.
//		 Извеждането продължава докато не се получи стойност 1.
//		 Пример: 11
//		 Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num!=1){
		if(num%2==0){
			num=(int) (0.5*num);
			System.out.println(num);
		}else{
			num=3*num+1;
			System.out.println(num);
		}	
		}
		sc.close();
	}
}