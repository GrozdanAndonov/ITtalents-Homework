import java.util.Scanner;

public class zadacha14 {
	public static void main(String[] args) {

//		Да се състави програма, която по въведени координати на 2 позиции
//		от шахматната дъска извежда отговор дали са оцветени в еднакъв или
//		различен цвят.
//		Шахматната дъска е квадратна.
//		Въвеждат се две двойки числа от интервала [1..8].
//		Пример: 2 2 3 2
//		Изход: Позициите са с различен цвят

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedi v intervala [1-8]:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		if((x1<1 || x1>8) || (x2<1 || x2>8) || (y1<1 || y1>8) || (y2<1 || y2>8)){
			System.out.println("Ne sa v intervala!");
		}else{
		int pos1=0;//1(black) 2(white)
		int pos2=0;
//////Position 1				
		if(x1%2!=0){
			if(y1%2!=0){
				pos1=1;
			}else{
				pos1=2;
			}
		}else{
			if(y1%2!=0){
				pos1=2;
			}else{
				pos1=1;
			}
		}
//////Position 2		
		if(x2%2!=0){
			if(y2%2!=0){
				pos2=1;
			}else{
				pos2=2;
			}
		}else{
			if(y2%2!=0){
				pos2=2;
			}else{
				pos2=1;
			}
		}
		
		if(pos1==pos2){
			System.out.println("Ednakuv cvqt");
		}else{
			System.out.println("Razlichen scqt");
		}
		sc.close();
	}
	}
}
