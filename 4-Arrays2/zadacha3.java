import java.util.Scanner;
public class zadacha3 {

	public static void main(String[] args) {
//		Имате двумерен масив от числа, чийто стойности са въведени
//		предварително. Да се отпечатат сумата на елементите на масива,
//		както и средноаритметичното на тези числа.
		Scanner sc= new Scanner(System.in);
		System.out.println("Vuvedete kolko reda e masiva:");
		int rows=sc.nextInt();
		System.out.println("Vuvedete kolko koloni e masiva:");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
		int sum=0;
		double sredno=0;
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				System.out.println("Vuvedete stoinost na red "+(row+1)+ " i kolona:"+(col+1));
				arr[row][col]=sc.nextInt();
				sum+=arr[row][col];
			}
		}
		sredno=(double) sum/(rows*cols);
		System.out.println("Sumata="+sum);
		System.out.println("Srednoaritmetichno="+sredno);
		sc.close();
	}

}
