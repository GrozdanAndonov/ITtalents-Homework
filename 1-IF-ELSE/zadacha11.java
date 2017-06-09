import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
		
//		Съставете програма, която по дадено трицифренo число проверява
//		дали числото се дели на всяка своя цифра. Във въведеното число да
//		няма цифра 0.
		
			System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num/100;
		int num2=(num/10)%10;
		int num3=num%10;
			if(num1==0||num2==0||num3==0){
				System.out.println("No zero allowed.");
				sc.close();
				return;
			}else{
				if(num%num1==0 && num%num2==0 && num%num3==0){
					System.out.println("True");
				}else{
					System.out.println("False");
				}
			}
			sc.close();
	}
}