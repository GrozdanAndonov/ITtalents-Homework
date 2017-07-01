import java.util.Scanner;

public class zadacha1 {

		public static void main(String[] args){
		
//			Напишете програма, която проверява дали даден символен низ
//			е префикс (начало) на друг символен низ.
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Vuvedete glaven niz:");
			String str1=sc.nextLine();
			System.out.println("Vuvedete niz za proverka:");
			String str2=sc.nextLine();
			System.out.println(checkPrefix(str1,str2));	
			sc.close();
		}
		public static boolean checkPrefix(String mainStr,String checkStr){
			if(mainStr.indexOf(checkStr)==0){
				return true;
			}
			return false;
		}
}
