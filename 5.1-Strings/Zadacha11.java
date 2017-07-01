import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
//		Реализирайте играта “Бесеница” – за тайна дума, потребителят
//		трябва да въвежда буква, след което да се отпечатва думата, в
//		която са показани отгатнатите букви, а на мястото на
//		неотгатнатите има _. Също така потребителят трябва да знае
//		колко опита му остават.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter secret word:");
		char[] secretWord=sc.nextLine().toCharArray();
		char[] revealingWord=new char[secretWord.length];
		int tries=8;
		
		for(int i=tries;i>=1;i--){
			System.out.println("Enter character:"+ i);
			char ch=sc.nextLine().charAt(0);
			checkLetter(ch,secretWord,revealingWord);
				for(int a=0;a<revealingWord.length;a++){
					if(revealingWord[a]==0){
					System.out.print("_");
					}else{
						System.out.print(revealingWord[a]);
					}
				}
			System.out.println();
	}
		sc.close();
	}
	static void checkLetter(char ch,char[] arr,char[] arr2){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ch){
				arr2[i]=ch;
			}
		}
	}
}
