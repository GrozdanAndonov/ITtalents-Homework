
public class zadacha8 {

	public static void main(String[] args) {
		
		boolean[][] arr={
				{false,false,false},
				{false,false,false},
				{false,false,false},
				
		};
boolean bol=false;
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
					if(cols<arr.length-(rows+1)){
					if(arr[rows][cols]==true){
					bol=true;
						break;
					}
					}				
			}
		}
		System.out.println(bol);

	}

}
