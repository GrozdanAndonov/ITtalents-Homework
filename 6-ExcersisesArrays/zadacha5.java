
public class zadacha5 {

	public static void main(String[] args) {
		
		int[][] arr={
				{1,2,3,4},
				{1,2,5,9},
				{6,2,8,95,4}
		};
		int sum=0;
		int maxSum=0;
		int row=-1;
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				sum+=arr[rows][cols];
				
			}
			if(sum>maxSum){
				maxSum=sum;
				row=rows;
			}
			sum=0;
		}
		
		for(int i=0;i<arr[row].length;i++){
			System.out.print(arr[row][i]+" ");
		}
		System.out.println(" sum:"+maxSum);
		

	}

}
