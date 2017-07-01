import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
//		Напишете програма, която проверява дали даден символен низ
//		е палиндром (един и същ е отпред назад и отзад напред).

		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete niz za proverka:");
		String str=sc.nextLine();
		boolean palindrome=false;
		for(int i=0; i< str.length();i++){
			if(str.charAt(i)==str.charAt(str.length()-i-1)){
				palindrome=true;
			}else{
				palindrome=false;
				break;
			}
		}
		System.out.println(palindrome);
		sc.close();
	}
}
