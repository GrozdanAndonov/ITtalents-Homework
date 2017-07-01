
public class zadacha9 {
		public static void main(String[] args){
		int[][]arr ={
				{1,21,3,4,5},
				{1,2,3,1,5},
				{1,2,3,4,5}
		};
		int maxSum=0;
		int sum=0;
		int[][] arr2=new int[2][2];
		for(int rows=0;rows<arr.length-1;rows++){
			for(int cols=0;cols<arr[rows].length-1;cols++){
				sum+=arr[rows][cols]+arr[rows+1][cols]+arr[rows][cols+1]+arr[rows+1][cols+1];
				if(sum>maxSum){
					maxSum=sum;
					arr2[0][0]=arr[rows][cols];
					arr2[0][1]=arr[rows][cols+1];
					arr2[1][0]=arr[rows+1][cols];
					arr2[1][1]=arr[rows+1][cols+1];
					sum=0;
				}
				sum=0;
				
			}
		}
			for(int rows=0;rows<arr2.length;rows++){
				for(int cols=0;cols<arr2.length;cols++){
					System.out.print(arr2[rows][cols]+" ");
				}
				System.out.println();
			}
			System.out.println(maxSum);
			
		}
}
