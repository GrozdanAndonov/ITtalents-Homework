import java.util.Scanner;
public class zadacha5 {

public static void main(String[] args){
//	Да се състави програма, при която предварително са въведени
//	естествени числа в двумерен масив 4*4 елемента.
//	Програмата да извежда резултат от проверката какво е съотношението
//	на най-голямата сума по редове спрямо най-голямата сума по колони.

		int[][]arr=new int[4][4];
		int maxSumRows=0;
		int sumRows=0;
		int maxSumCols=0;
		int sumCols=0;
		Scanner sc=new Scanner(System.in);
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				System.out.println("Vuvedete stoinost za red:"+(rows+1)+"i za kolona:"+(cols+1));
				arr[rows][cols]=sc.nextInt();
				sumRows+=arr[rows][cols];
			}
			if(maxSumRows<sumRows){
				maxSumRows=sumRows;
			}
			sumRows=0;
		}
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				sumCols+=arr[cols][rows];
			}
			if(sumCols>maxSumCols){
				maxSumCols=sumCols;
			}
			sumCols=0;
		}
		System.out.println("Nai-golqma suma po redove " + maxSumRows);
		System.out.println("Nai-golqma suma po koloni " + maxSumCols);
		if(maxSumCols > maxSumRows){
			System.out.println("Maksimalnata suma po koloni e > ot maksimalnata suma po redove!");
		}else{
			if(maxSumCols < maxSumRows){
				System.out.println("Maksimalnata suma po redove e > ot maksimalnata suma po koloni!");
			}else{
				System.out.println("Ravni sa!");
			}
		}
		sc.close();
	}
}
