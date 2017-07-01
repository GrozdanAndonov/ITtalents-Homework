import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		StringBuilder strBuilder=new StringBuilder("0");
		System.out.println("Vuvedete stoinost:");
		int num=sc.nextInt();
		if(num>0){
		String str=new String();
		for(int i = 1;i<=num;i++){
			strBuilder.append(Integer.toString(i));
		}
		str=strBuilder.toString();
		System.out.println(str);
		}else{
			System.out.println("not valid!");
		}
		sc.close();
	}

}
