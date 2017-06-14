import java.util.Scanner;
public class zadacha7 {
	public static void main(String[] args){
//		Имате предварително въведени стойности от естествени числа,
//		въведени в квадратна таблица с размери 6 реда и 6 колони.
//		Да се състави програма , чрез която се намира сумата на всички
//		елементи, чиято сума на индекси за ред и колона е четно число.
//		Програмата да извежда формираните суми за всеки отделен ред на
//		квадратната таблица, както и общата сума от тези елементи.
//		Да се използва само един цикъл.
//		Пример:
//			11,12,13,14,15,16,
//			21,22,23,24,25,26,
//			31,32,33,34,35,36,
//			41,42,43,44,45,46,
//			51,52,53,54,55,56,
//			61,62,63,64,65,66
//			Изход:
//			11, ,13, ,15, , сума от елементите за реда: 39
//			22, ,24, ,26, сума от елементите за реда: 72
//			31, ,33, ,35, , сума от елементите за реда: 99
//			42, ,44, ,46, сума от елементите за реда: 132
//			51, ,53, ,55, , сума от елементите за реда: 159
//			62, ,64, ,66 сума от елементите за реда: 192
//			Сума на елементите: 693
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for(int rows=0;rows<arr.length;rows++){
			for(int cols=0;cols<arr[rows].length;cols++){
				System.out.println("Vuvedi stoinost na red:"+(rows+1)+" i kolona:"+(cols+1));
				arr[rows][cols]=sc.nextInt();
			}
		}
			int sum=0;
		for(int rows=0;rows<arr.length;rows++){
			if((rows+1)%2!=0){
			System.out.println(arr[rows][0]+", ,"+arr[rows][2]+", ,"+arr[rows][4]+", , syma ot elementite za reda:"+(arr[rows][0]+arr[rows][2]+arr[rows][4]));
			sum+=arr[rows][0]+arr[rows][2]+arr[rows][4];
			}else{
				System.out.println(arr[rows][1]+", ,"+arr[rows][3]+", ,"+arr[rows][5]+", , syma ot elementite za reda:"+(arr[rows][1]+arr[rows][3]+arr[rows][5]));
			sum+=arr[rows][1]+arr[rows][3]+arr[rows][5];
			}
			}
		
		System.out.println("Syma na elementite: "+sum);
		
		
		sc.close();
	}
}
