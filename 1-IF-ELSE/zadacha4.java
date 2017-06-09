import java.util.Scanner;

public class zadacha4 {
		public static void main(String[] args) {
	
//			Въведете 2 различни числа от конзолата и ги разпечатайте в
//			нарастващ ред.
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1: ");
			int num1=sc.nextInt();
			System.out.println("Enter num2: ");
			int num2=sc.nextInt();
			
			if(num1<num2){
				System.out.println("Result: "+ num1 +", " + num2);
			}else{
				System.out.println("Result: "+ num2 +", " + num1);
			}
			sc.close();
   }
}
