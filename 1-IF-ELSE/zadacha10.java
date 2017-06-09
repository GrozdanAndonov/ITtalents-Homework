import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		
//		Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
//		3 литра и ги ползвате едновременно.
//		Да се състави програма, която по даден обем извежда как ще прелеете
//		течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
//		кофите. Кофите не могат да се ползват с частично количество вода.
//		Входни данни: естествено число от интервала [10..9999].
//		Пример: 107
//		Изход: 21 пъти по 2 литра,
//		 21 пъти по 3 литра
//		 допълнително кофа от 2 литра

		
		Scanner sc=new Scanner(System.in);
			int kursa2=0;
			int kursa3=0;
		int obem=sc.nextInt();
		
		int kursa=Math.round(obem/5);
		System.out.println(kursa);
		if(((obem%10)==0)||((obem%10)==5)){
			kursa2=kursa;
			kursa3=kursa;
		System.out.println(kursa2+" puti po 2 litra");
		System.out.println(kursa3+" puti po 3 litra");
		}else{
			if(obem%10==1){
				kursa2=--kursa;
				kursa3=kursa+2;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
			}
			if(obem%10==2){
				kursa2=kursa;
				kursa3=kursa;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
				System.out.println("Dopulnitelno kofa ot 2 litra");
			}
			if(obem%10==3){
				kursa2=kursa;
				kursa3=kursa+1;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
				System.out.println("Dopulnitelno kofa ot 3 litra");
			}
			if(obem%10==4){
				kursa2=kursa+2;
				kursa3=kursa;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
			}
			if(obem%10==6){
				kursa2=kursa+2;
				kursa3=kursa-1;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
			}
			if(obem%10==7){
				kursa2=kursa+1;
				kursa3=kursa;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
				System.out.println("Dopulnitelno kofa ot 2 litra");
			}
			if(obem%10==8){
				kursa2=kursa;
				kursa3=kursa+1;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
				System.out.println("Dopulnitelno kofa ot 3 litra");
			}
			if(obem%10==9){
				kursa2=kursa+2;
				kursa3=kursa;
				System.out.println(kursa2+" puti po 2 litra");
				System.out.println(kursa3+" puti po 3 litra");
			}
		}
		sc.close();
	}
}