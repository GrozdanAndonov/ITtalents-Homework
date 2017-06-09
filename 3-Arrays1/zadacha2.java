import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vuvedete duljina na masiva:");
		int[] arr1 = new int[sc.nextInt()];
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Vuvedi chislo nomer " + (i + 1));
			arr1[i] = sc.nextInt();
		}
		if (arr1.length % 2 == 0) {
			for (int i = 0; i < arr1.length / 2; i++) {
				arr2[i] = arr1[i];
			}
			int count = 1;
			for (int i = arr1.length / 2; i < arr1.length; i++) {
				arr2[i] = arr1[(arr1.length) - count];
				count++;
			}
		} else {
			for (int i = 0; i <= arr1.length / 2; i++) {
				arr2[i] = arr1[i];
			}
			int count = 1;
			for (int i = arr1.length / 2 + 1; i < arr1.length; i++) {
				arr2[i] = arr1[(arr1.length) - count];
				count++;
			}
		}
		System.out.print("[");
		for (int i = 0; i < arr2.length; i++) {
			if (i == arr2.length - 1) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}
		System.out.println("]");

		sc.close();
	}
}