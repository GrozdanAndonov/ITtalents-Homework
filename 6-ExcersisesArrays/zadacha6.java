
public class zadacha6 {

	public static void main(String[] args) {
		int [][] arr={
				{1,2,3,2},
				{1,4,3,1},
				{1,2,6,2},
				{5,2,5,12}
		};
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				if(rows==cols){
					System.out.print(arr[rows][cols]+" ");
				}
			}
		}
	}

}
