import java.util.Scanner;

public class zadacha3dopulnitelni {
	
//	Напишете програма, която за даден масив от символи arr и
//	символ ch, въведен от потребителя, проверява али arr съдържа
//	ch. Ако се съдържа, отпечатайте индекса на елемента. Ако не,
//	отпечатайте подходящо избрана от вас стойност.

	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char[] arr={'a','s','e','w'};
		char ch=sc.next().charAt(0);
		int index=-1;
		boolean bol=true;
		for(int i = 0; i<arr.length;i++){
			if(arr[i]==ch){
				index=i;
				bol=true;
				break;
			}else{
				bol=false;
			}
		}
		
		System.out.println(index + ":" + bol);
		
		sc.close();
	}
}
