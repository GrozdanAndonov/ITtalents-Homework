import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
		
//		Да се състави програма, която чете от конзолата 2 естествени
//		двуцифрени числа a,b.
//		Програмата да изведе в конзолата дали последната цифра от
//		произведението на двете числа е четна, както и самата цифра.
//		Входни данни: a,b - естествени числа от интервала [10..99].
//		Пример: 15, 25
//		Изход: 375, 5 нечетна
		
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter a [10..99]:");
			int a=sc.nextInt();
			System.out.println("Enter b [10..99]:");
			int b=sc.nextInt();
			if((a>10 && a<99)||(b>10 && b<99)){			
				int result=a*b;
				if(result%2==0){
					System.out.println(result+", "+result%10+" even");
				}else{
					System.out.println(result+", "+result%10+" Odd");
				}
			}else{
				System.out.println("Wrong input!");
				sc.close();
				return;
			}
				sc.close();
	}
}
