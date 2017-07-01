import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		
//		Да се състави програма, чрез която по въведени трите имена на двама
//		човека разделени със запетая, се извежда чие име има по-голям сбор
//		от ASCII кодовете на съставящите името букви.
//		Пример: Anna Dosewa Asenowa, Iwo Peew Peew
//		Изход: Anna Dosewa Asenowa

		
		Scanner sc= new Scanner(System.in);

		String[] str=sc.nextLine().split(", ");
		int maxSum=0;
		int index=-1;
		int sum=0;
		for(int i=0;i<str.length;i++){
			for(int a=0;a<str[i].length();a++){
				 sum+=str[i].charAt(a);
			}
			if(sum>maxSum){
				maxSum=sum;
				index=i;
			}
			sum=0;
		}
		System.out.println(str[index]);	
		sc.close();
	}
}
