import java.util.Scanner;

public class zadacha17 {

	public static void main(String[] args) {
		// Да се състави програма, която извежда квадрат, чийто страни са
		// оформени със знака *, а вътрешността е запълнена със въведен
		// знак.
		// Входни данни b - дължина на страната число от интервала
		// [3..20], c - желан знак.
		// Програмата да използва цикъл for.
		// Пример: 4 +
		// Изход:
		// ****
		// *++*
		// *++*
		// ****

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num in range[3-20]:");
		int num = sc.nextInt();
		if (num < 3 || num > 20) {
			System.out.println("Not in range!");
		} else {
			char ch = sc.next().charAt(0);

			for (int rows = 1; rows <= num; rows++) {
				if (rows == 1) {
					for (int row1 = 1; row1 <= num; row1++) {
						System.out.print("*");
					}
				} else {
					if (rows == num) {
						for (int row1 = 1; row1 <= num; row1++) {
							System.out.print("*");
						}
					} else {

						System.out.print("*");
						for (int chars = 1; chars <= num - 2; chars++) {
							System.out.print(ch);
						}
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
