import java.util.Scanner;
public class zadacha2 {

	public static void main(String[] args) {
		
//		Имате квадратен двумерен масив от естествени числа, чийто стойности
//		се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete duljina na kvadratnata matrica:");
		int leng=sc.nextInt();
		int[][] arr=new int[leng][leng];
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr.length;cols++){
				System.out.println("Vuvedete stoinost na red:"+(rows+1)+" i kolona:"+(cols+1));
				arr[rows][cols]=sc.nextInt();
			}
		}
		int[] glaven=new int[arr.length];
		int[] vtorichen=new int[arr.length];
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr.length;cols++){
				if(cols==rows){
					glaven[rows]=arr[rows][cols];
				}
				if(cols==arr.length-(rows+1)){
					vtorichen[rows]=arr[rows][cols];
				}
				
			}
		}
		System.out.print("glaven:");
		for(int i=0;i<glaven.length;i++){
			System.out.print(glaven[i]+" ");
		}
		System.out.println();
		System.out.print("Vtorichen:");
		for(int i=0;i<vtorichen.length;i++){
			System.out.print(vtorichen[i]+" ");
		}	
		sc.close();
	}
}
