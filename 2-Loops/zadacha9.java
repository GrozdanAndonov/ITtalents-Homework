import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
		
//		 Да се прочетат 2 числа от клавиатурата А и В.
//		 Да се изведат всички числа от А до В на степен 2(разделени с
//		 запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//		 числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//		 пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;a<=b;i++){
			if(i%3==0){
				System.out.print("skip 3, ");
				continue;
			}
			sum+=i*i;
			//if(sum>200) break;
			System.out.print(i*i+", ");
			if(sum>200) break;//kato stane po-golqmo ot 200 da se izpishe li ili ne(ako ne-purviq if)
		}
		sc.close();
	}
}