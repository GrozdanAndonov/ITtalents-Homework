import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		
//		Да се състави програма, която чете набор от думи разделени с
//		интервал.
//		Като резултат да се извеждат броя на въведените думи, както и броя
//		знаци в най-дългата дума.
//		Пример: asd fg hjkl
//		Изход: 3 думи, най-дългата е с 4 символа.
		Scanner sc= new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int countedWords=str.length;
		int sum=0;
		int maxSum=0;
		for(int i=0;i<str.length;i++){
			sum=str[i].length();
			if(sum>maxSum){
				maxSum=sum;
			}
			sum=0;
		}
		System.out.println(countedWords+" "+ maxSum);
		sc.close();
	}
}
