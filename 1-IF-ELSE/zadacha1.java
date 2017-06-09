import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {

//		Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//		клавиатурата A и B (може да са с плаваща запетая – double).
//		После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//		Да се изведе подходящо съобщение за това дали C е между A и B.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		double num1=sc.nextDouble();
		System.out.println("Enter num2:");
		double num2=sc.nextDouble();
		System.out.println("Enter num3:");
		double num3=sc.nextDouble();
		if(num3>num1 && num3<num2){
			System.out.println("Number: "+num3+" is between " + num1 + " and "+ num2);
		}else{
			System.out.println("Number: "+num3+" is not between " + num1 + " and "+ num2);
		}
		sc.close();
	}
}
