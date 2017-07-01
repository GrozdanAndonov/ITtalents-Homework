import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		
//		Напишете програма, която отпечатва на екрана инициалите на
//		името ви. Въведете името си от клавиатурата.
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		str=new String();
		for(int i=0;i<arr.length;i++){
			
			str=str.concat(arr[i].substring(0, 1));
			//System.out.print(arr[i].charAt(0));
		}
		System.out.println(str);
		sc.close();

	}

}
