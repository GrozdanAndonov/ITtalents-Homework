import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
		
//		Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
//		им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
//		а3 да има старата стойност на а1.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a1=sc.nextInt();
		System.out.println("Enter num2: ");
		int a2=sc.nextInt();
		System.out.println("Enter num3: ");
		int a3=sc.nextInt();

		int mid1=a1;
		a1=a2;
		a2=a3;
		a3=mid1;
		System.out.println(a1+" "+a2+" "+a3);
		sc.close();
	}

}
