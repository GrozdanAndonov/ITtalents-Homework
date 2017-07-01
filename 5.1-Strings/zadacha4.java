import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		
//		Напишете програма, която брои колко пъти се среща всяка
//		английска буква в даден символен низ. Запазете резултатите в
//		масив.
		
		Scanner sc= new Scanner(System.in);
		int[] result=new int[122];
		System.out.println("Vuvedete niz:");
		String str=sc.nextLine();
		int count=1;
		for(int i=0; i<str.length();i++){
			for(int a=0; a<str.length();a++){
				if(str.charAt(i)==str.charAt(a) && i!=a){
					count++;
				}
			}
			result[(int)str.charAt(i)]=count;
			count=1;
		}
		for(int i=0; i<result.length;i++){
			if(result[i]!=0){
			System.out.println((char)i+":"+result[i]);
			}
		}
		sc.close();
	}
}
