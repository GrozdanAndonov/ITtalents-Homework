import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
		
//		Да се състави програма, чрез която се въвеждат два низа съдържащи
//		до 40 главни и малки букви.
//		Като резултат на екрана да се извеждат низовете само с главни и само
//		с малки букви.
//		Пример: Abcd Efgh
//		Изход: ABCD abcd EFGH efgh
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert two strings:");
		String str1=sc.next();
		if(str1.length()>40){
			str1=str1.substring(0, 40);
		}
		String str2=sc.next();
		if(str2.length()>40){
			str2=str2.substring(0, 40);
		}
		System.out.print(str1.toUpperCase()+" "+str1.toLowerCase()+ " "+str2.toUpperCase()+ " "+str2.toLowerCase());
		
		
		sc.close();
	}
}
