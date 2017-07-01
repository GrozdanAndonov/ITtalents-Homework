import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
		
//		Напишете програма, която конкатенира елементите на масив от
//		символни низове в един символен низ.
		Scanner sc= new Scanner(System.in);
		//String[] strArr= {"adadad", "fgffgfgfgf","lrrlrlrlrllr"};
			
		System.out.println("Vuvedete kolko reda iskate:");
		int row=sc.nextInt();
		sc.nextLine();
		String str=new String();
		String[] strArr1=new String[row];
		System.out.println("Vuvejdaite:");
		for(int rows=0;rows<strArr1.length;rows++){
			strArr1[rows]=sc.nextLine();
		}
		
		for(int i=0;i<strArr1.length;i++){
			 str=str.concat(strArr1[i]);
		}
		System.out.println(str);
		sc.close();
	}

}
