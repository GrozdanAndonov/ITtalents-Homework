import java.util.Scanner;

public class zadacha4 {
	public static void main(String[] args){
//		Имате предварително въведени стойности на елементи в двумерен
//		масив - естествени числа.
//		Да се състави програма, чрез която се извеждат стойностите на
//		елементите в двумерен масив след обръщането му на +90 градуса.
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete broi redove:");
		int row=sc.nextInt();
		System.out.println("Vuvedete broi koloni:");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				System.out.println("Vuvedete stoinost na red "+(rows+1)+" i kolona "+(cols+1));
				arr[rows][cols]=sc.nextInt();
			}
		}
		// printira arr
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				System.out.print(arr[rows][cols]+ " ");
			}
			System.out.println();
		}
		//prenarejda arr v arr2
		int[][] arr2=new int[col][row];
		for(int rows=0;rows<arr2.length;rows++){
			for(int cols=0;cols<arr2[rows].length;cols++){
				arr2[rows][cols]=arr[arr.length-(cols+1)][rows];
			}
		}
		System.out.println();
		//printira arr2
		for(int rows=0;rows<arr2.length;rows++){
			for(int cols=0;cols<arr2[rows].length;cols++){
				System.out.print(arr2[rows][cols]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
