import java.util.Scanner;
public class zadacha6 {
	
	public static void main(String[] args){
//		Имате предварително въведени стойности от естествени числа.
//		Числата са въведени в квадратна таблица с размери 6 реда и 6
//		колони.
//		Да се състави програма, чрез която се намира сумата на всички
//		елементи от редовете с четни номера: 2,4 и 6.
//		Програмата да извежда и сумата на всеки отделен ред.
		Scanner sc=new Scanner(System.in);
		int[][]arr=new int[6][6];
	
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				System.out.println("Vuvedi stoinost na red:"+(rows+1)+" i kolona:"+(cols+1));
				arr[rows][cols]=sc.nextInt();
			}
		}
		int sum=0;
		int maxSum=0;
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				if((rows+1)%2==0){
					System.out.print(arr[rows][cols]+" ");
						sum+=arr[rows][cols];
				}
			}
			if((rows+1)%2==0)
			System.out.println("syma "+sum);
			maxSum+=sum;
			sum=0;
		}
		System.out.println("Syma na elementite "+maxSum);
		
		
	sc.close();	
	}
}
