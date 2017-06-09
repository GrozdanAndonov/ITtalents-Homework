import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
		
		// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
		//ред.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Enter num3: ");
		int num3=sc.nextInt();
		
		int max=0;
		
		if(num1>=num2 && num1>=num3) {
			max=num1;
			if(num2>=num3){
				System.out.println("Result: " + num1 + ", " + num2 + ", " + num3);
				}else{
				System.out.println("Result: " + num1 + ", " + num3 + ", "+ num2);
				}
		}else{
			if(num2>=num1 && num2>=num3){
				max=num2;
				if(num1>=num3){
					System.out.println("Result: " + num2 + ", " + num1 + ", " + num3);
					}else{
						System.out.println("Result: " + num2 + ", " + num3 + ", "+ num1);
					}
			}else{
				if(num3>=num1 && num3>=num2){
					max=num3;
					if(num1>=num2){
						System.out.println("Result: " + num3 + ", " + num1 + ", " + num2);
						}else{
							System.out.println("Result: " + num3 + ", " + num2 + ", "+ num1);
						}
				}
			}
		}
		sc.close();
	}
}
