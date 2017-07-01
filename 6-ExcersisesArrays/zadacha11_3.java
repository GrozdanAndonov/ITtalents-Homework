import java.util.Scanner;

public class zadacha11_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows for the matrix:");
		int rows=sc.nextInt();
		System.out.println("Enter cols for the matrix:");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
		int count=1;
		int k=0;
		for(int col=0;col<arr[k].length;col++){
			if((col+1)%2!=0){
			for(int row=0;row<arr.length;row++){
				
				arr[row][col]=count;
				count++;
			}
			}else{
				for(int row=rows-1;row>=0;row--){
					
					arr[row][col]=count;
					count++;
				}
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
