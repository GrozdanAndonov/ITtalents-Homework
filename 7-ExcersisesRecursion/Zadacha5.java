import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се въвежда естествено число N.
//		Програмата да извежда число, чиито цифри са написани в ред обратен
//		на въведеното число.
//		Да се извежда съобщение дали въведеното число е палиндром.
//		Пример: 12321
//		Изход: 12321 да.
//		Пример: 12578
//		Изход: 87521 не.
//		Използвайте рекурсия
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//int length = String.valueOf(num).length();
		String str=Integer.toString(num);
		int result=isPalindrome(str,0);
		if(result==num){
			System.out.println(result+" da");
		}else{
			System.out.println(result+" ne");
		}
		sc.close();
	}
	static int isPalindrome(String number,int pos){
		if(pos==number.length()){
			return Integer.parseInt(number);
		}
		if(number.charAt(pos)==number.charAt(number.length()-(pos+1))){
			return isPalindrome(number,pos+1);
		}else{
			return reverseString(number);
		}
	}
	static int reverseString(String str){
		String str2="";
		for(int i=str.length()-1;i>=0;i--){
			str2+=str.charAt(i);
		}
		return Integer.parseInt(str2);
	}
}
