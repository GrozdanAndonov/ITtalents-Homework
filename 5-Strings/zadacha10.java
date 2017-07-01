import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		
//		Да се състави програма, която по даден низ връща друг,
//		символите, на който са получени като към всеки код на символ
//		от ASCII таблицата е добавеното числото 5 и е записан
//		новополучения символ.
//		Пример :
//		Вход: Hello
//		Изход: Mjqqt
		
		Scanner sc= new Scanner(System.in);
		StringBuilder strbuild = new StringBuilder();
		char[] str=sc.nextLine().toCharArray();
		for(int i = 0;i<str.length;i++){
			str[i]+=5;
			strbuild.append(str[i]);
		}
		String str2=strbuild.toString();
		System.out.println(str2);
		sc.close();
	}
}
