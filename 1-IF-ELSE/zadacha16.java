import java.util.Scanner;

public class zadacha16 {

	public static void main(String[] args) {
		
//		Въведено е трицифрено естествено число от вида abc.
//		Трябва да се провери дали:
//		ако a = b = c - Изход: цифрите са равни;
//		ако a>b>c - Изход: цифрите са във възходящ ред;
//		ако a<b<c цифрите са в низходящ ред;
//		и изход: цифрите са ненаредени, за неописаните случаи.
//		Да се състави програма, която извежда резултата от проверката за
//		наредба на цифрите в числото.
//		Пример: 345
//		Изход: възходящ ред.

		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete estestveno chislo ot vida abc:");
		int num=sc.nextInt();
		
		int part1=num/100%10;
		int part2=num/10%10;
		int part3=num%10;
		if(part1==part2 && part1==part3){
			System.out.println("Cifrite sa ravni!");
		}else{
			if(part1<part2 && part2<part3){
				System.out.println("Cifrite sa vuv vuzhodqsht red!");
			}else{
				if(part1>part2 && part2>part3){
					System.out.println("Cifrite sa vuv nizhodqsht red!");
				}else{
					System.out.println("Cifrite sa nenaredeni, za neopisanite sluchai!");
				}
			}
		}
		sc.close();
	}
}