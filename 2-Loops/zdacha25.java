import java.util.Scanner;

public class zdacha25 {

	public static void main(String[] args) {
		
//		Да се направи програма, която по дадено число N, да изчислява
//		N!, т.е. 1*2*3*4...*N.
//		Пример: 5
//		Изход: 120
//		Използвайте цикъл do-while. 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int result=1;
		int i=1;
		do{
			result*=i;
			i++;
		}while(i<=num);
		System.out.println(result);
		sc.close();
	}

}
