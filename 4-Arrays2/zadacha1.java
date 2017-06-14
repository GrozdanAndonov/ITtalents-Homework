import java.util.Scanner;

public class zadacha1 {
	public static void main(String[] args){
//		Имате двумерен масив 6х5 от естествени числа, чийто стойности са
//		въведени предварително.
//		Да се състави програма, чрез която се извеждат елементите от масива
//		с най-малката и най-голямата стойност.
		int[][] array=new int[6][5];
		int min=100000000;
		int max=-100000000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers for the 2 dimensional array 6x5:");
		for(int rows=0;rows<array.length;rows++){
			for(int cols=0;cols<array[rows].length;cols++){
				System.out.println("Enter value for row:"+(rows+1)+" and column:"+(cols+1));
					array[rows][cols]=sc.nextInt();
					if(array[rows][cols]<min){
						min=array[rows][cols];
					}else{
						if(array[rows][cols]>max){
							max=array[rows][cols];
						}
					}
			}
		}
		for(int rows=0;rows<array.length;rows++){
			for(int cols=0;cols<array[rows].length;cols++){
				System.out.print(array[rows][cols]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Nai-malkoto:"+min);
		System.out.println("Nai-golqmoto:"+max);
		
		
		
		sc.close();
	}
}
