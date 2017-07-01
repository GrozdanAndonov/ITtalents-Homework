import java.util.Scanner;
public class zad1top {

	public static void main(String[] args) {
//		 Да се създаде програма, която въвежда от клавиатурата
//		 имената на 10 работника в масив и извежда съдържанието
//		 на mасива:
//		 ● във реда в който са въведени;
//		 ● в ред обратен на въвеждането им

		
		String[] arr= new String[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Vuvedete imenata na rabotnicite:");
		for(int i=0;i < arr.length;i++){
			arr[i]=sc.nextLine();
		}
		for(int i= 0; i< arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		for(int i = arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
