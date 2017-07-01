import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {	
//		Да се състави програма, чрез която се въвеждат последователно две
//		редици от символи без интервали.
//		Програмата да извежда съобщение за резултата от сравнението им по
//		позиции.
//		Пример: хипопотам, хипопотук
//		Изход:
//		Двата низа са с равна дължина.
//		Разлика по позиции:
//		8 а-у
//		9 м-к
		Scanner sc= new Scanner(System.in);
		System.out.println("Vuvedete dva niza:");
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()==str2.length()){
			for(int i=0;i<str2.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					System.out.println(i+1 +" "+str1.charAt(i)+"-"+str2.charAt(i));
				}
			}
		}else{
			System.out.println("Dvata niza sa s razlichna duljina ==>> ne sa ednakvi!");
		}
		sc.close();
	}
}