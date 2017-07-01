import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се въвежда изречение с отделни
//		думи.
//		Като резултат на екрана да се извежда същия текст, но всяка отделна
//		дума да започва с главна буква, а следващите я букви да са малки.
//		Пример: супер яката задача
//		Изход: Супер Яката Задача
		
		Scanner sc= new Scanner(System.in);
		String str2="";
		String[] str=sc.nextLine().split(" ");
		for(int i=0;i<str.length;i++){
			str[i]=str[i].substring(0, 1).toUpperCase()+str[i].substring(1);
		}
		str2=String.join(" ", str);	
		System.out.println(str2);		
		sc.close();
	}
}




