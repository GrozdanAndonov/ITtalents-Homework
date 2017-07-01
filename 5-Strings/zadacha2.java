import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		
//		Да се състави програма, чрез която от клавиатурата се въвеждат
//		последователно две думи с дължина 10-20 знака.
//		Програмата да размени първите им 5 знака и да изведе дължината на
//		по-дългата, както и новото им съдържание.
//		Пример: uchilishe uchenik
//		Изход: 9 uchenishe
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()>20 || str1.length()<10 || str2.length()>20 || str2.length()<10){
			System.out.println("Not in range!");
		}else{
			if(str1.length()>=str2.length()){
				str1=str1.substring(5, str1.length());
				str2=str2.substring(0,5);
				str1=str2.concat(str1);
				System.out.println(str1.length()+" "+ str1);
			}else{
				if(str1.length()<str2.length()){
					str2=str2.substring(5, str2.length());
					str1=str1.substring(0,5);
					str2=str1.concat(str2);
					System.out.println(str2.length()+" "+ str2);
				}
			}
		}
		sc.close();
	}

}
