import java.util.Scanner;

public class zadacha15 {

	public static void main(String[] args) {
		
//		 Да се състави програма, която да изчисли сумата на
//		 всички числа от 1 до въведено число N.
//		 Пример: 5
//		 Изход: 15
		 
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int counter=1;
		 int sum=0;
		 do{
			 sum+=counter;
			 counter++;
		 }while(counter!=num+1);
		 System.out.println(sum);
		 sc.close();
	}
}
