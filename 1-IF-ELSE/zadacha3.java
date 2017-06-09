import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		
//		Въведете 2 различни числа от конзолата и разменете стойността им.
//		Разпечатайте новите стойности

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		int mid=num1;
		num1=num2;
		num2=mid;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		sc.close();
	}

}
