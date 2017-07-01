
public class zadacha5Rekursiq {

	public static void main(String[] args) {
	
		
		int[][] arr= create2DimensionalArray(5,3);

		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				System.out.print(arr[rows][cols]+" ");
			}
			System.out.println();
		}
		
	}
	public static int[][] create2DimensionalArray(int x,int y){
		
		int[][] arr=new int[x][y];
		return arr;
		
	}

}
