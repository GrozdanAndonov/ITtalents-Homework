import java.util.Scanner;

public class zadacha24 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete chislo[10 .. 30000]:");
		int num=sc.nextInt();
		if(num<=30000 && num>=10){
		int palindrome=num;
		int reverse=0;
		do{
			 int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
		}while (palindrome != 0);
		  if (num == reverse) {
	            System.out.println("Palindrom e!");
	        }else{
	        	System.out.println("Ne e palindrom!");
	        }
		}else{
			System.out.println("Not in range");
		}
		sc.close();
	}
}
