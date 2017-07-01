import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
		
//		Да се състави програма, чрез която се въвеждат 2 редици от знаци
//		(думи).
//		Ако в двете редици участва един и същи знак, да се изведе на екрана
//		първата редица хоризонтално, а втората вертикално, така че да се
//		пресичат в общия си знак.
//		Ако редиците нямат общ знак да се изведе само уведомително
//		съобщение.
//		Пример :
//		м
//		а
//		шапка
//		и
//		н
//		а
		Scanner sc= new Scanner(System.in);
		
		String[] str=sc.nextLine().split(", ");
		for(int i = 0; i<str[0].length();i++){
			if(str[0].charAt(i)==str[1].charAt(0)){
				System.out.println(str[1]);
			}else{
				System.out.println(str[0].charAt(i));
			}
		}
		sc.close();
	}
}