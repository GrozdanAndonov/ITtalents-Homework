import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		
		
//		Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
//		пари (число с плаваща запетая), дали съм здрав – булев тип.
//		Съставете програма, която взема решения на базата на тези данни по
//		следния начин:
//		 - ако съм болен, няма да излизам
//		 - ако имам пари, ще си купя лекарства
//		 - ако нямам – ще стоя вкъщи и ще пия чай
//		 - ако съм здрав, ще отида на кино с приятели
//		 - ако имам по-малко от 10 лв, ще отида на кафе.
//		Полученото решение покажете като съобщение в конзолата.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("What time is it(int):");
		int hour=sc.nextInt();
		System.out.println("How much money you have(float):");
		float money=sc.nextFloat();
		System.out.println("Are you healty(true/false):");
		boolean healty = sc.nextBoolean();
		if(healty){
			if(money<10){
				System.out.println("At "+hour+" I am going to the nearest Cafe.");
			}else{
				System.out.println("At "+hour+" I am going to the cinema with friends.");
			}
		}else{
			if(money<10){
				System.out.println("At "+hour+" I am staying home and drink a cup of tea.");
			}else{
				System.out.println("At "+hour+" I am going to buy a medicine and return home.");
			}
		}
		sc.close();
	}
}
