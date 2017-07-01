import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows for the matrix:");
		int rows=sc.nextInt();
		System.out.println("Enter cols for the matrix:");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
		int count=1;
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				arr[row][col]=count;
				count++;
			}
		}
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}
}
