
public class zadacha7 {

		public static void main(String[] args){
			
			int[][] arr={
					{1,2,4},
					{2,2,34},
					{5,2,4},
					
			};
			int proizvedenie=1;		
			for(int rows=0;rows<arr.length;rows++){
				for(int cols=0;cols<arr[rows].length;cols++){
						if(cols<rows){
						proizvedenie*=arr[rows][cols];
						}				
				}
			}
			System.out.println(proizvedenie);		
		}
}
