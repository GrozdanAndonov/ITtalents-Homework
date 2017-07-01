import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
//		Напишете програма, която проверява дали даден символен низ
//		е анаграма (съдържа същите символи, но не задължително в
//		същия ред) на друг символен низ. Проверявайте само
//		английските букви.
		Scanner sc=new Scanner(System.in);
		int[] result=new int[122];
		int[] result2=new int[122];
		System.out.println("Vuvedete niz:");
		String str=sc.nextLine();
		System.out.println("Vuvedete vtori niz za sravnenie:");
		String str2=sc.nextLine();
		
		checkAlphabets(str,result);
		checkAlphabets(str2,result2);
		System.out.println(checkArrays(result,result2));
		sc.close();
	}
	static boolean checkArrays(int[] res1,int[] res2){
		for(int i=0; i<res1.length;i++){
			if(res1[i]!=res2[i]){
				return false;
			}
		}
		return true;
	}
	static int[] checkAlphabets(String s,int[] res){
		int count=1;
		for(int i=0; i<s.length();i++){
			for(int a=0; a<s.length();a++){
				if(s.charAt(i)==s.charAt(a) && i!=a){
					count++;
				}
			}
			res[(int)s.charAt(i)]=count;
			count=1;
		}
		return res;
	}
}