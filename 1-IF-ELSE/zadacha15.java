import java.util.Scanner;
public class zadacha15 {
	public static void main(String[] args) {
		
//		Да се състави програма, която въвежда естествено число от интервала
//		[0..24].
//		Програмата да изведе съответстващо съобщение съобразно въведения
//		час.
//		Периодите са:
//		[18..4] - Добър вечер;
//		[4..9] - Добро утро;
//		[9..18] - Добър ден
//		Пример: 10
//		Изход: Добър ден

		
		System.out.println("Da se vuvede v intervala [0-24]");
		Scanner sc=new Scanner(System.in);	
		int hour=sc.nextInt();	
		if(hour>=18 || hour<=4){
			System.out.println("Dobur vecher!");
		}else{
			if(hour>4 && hour<=9){
				System.out.println("Dobro utro!");
			}else{
				System.out.println("Dobur den!");
			}
		}
		sc.close();
	}
}