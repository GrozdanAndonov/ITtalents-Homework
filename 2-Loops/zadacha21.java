import java.util.Scanner;
public class zadacha21 {

	public static void main(String[] args) {

		// Дадено е наредено тесте карти.
		// Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
		// Поп, Асо.
		// Наредбата по цвят на картите е: спатия, каро, купа, пика.
		// Да се създаде програма, чрез която се въвежда N - число от
		// интервала [1..51] и се извеждат въведения номер карта и
		// останалите по-големи карти от тестето.
		// Пример: 47.
		// Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
		// пика

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean bol=false;
		int counter = 1;
		for (int i = 2; i <= 14; i++) {
			for (int a = 1; a <= 4; a++) {
				if (num == counter || bol) {
					bol=true;
					if (a == 1 && (i >= 2 && i <= 10)) {
						System.out.println(i + " " + "spatiq");
					} else {
						if (a == 2 && (i >= 2 && i <= 10)) {
							System.out.println(i + " " + "karo");

						} else {
							if (a == 3 && (i >= 2 && i <= 10)) {
								System.out.println(i + " " + "kupa");
							} else {
								if (a == 4 && (i >= 2 && i <= 10)) {
									System.out.println(i + " " + "pika");
								}
							}
						}
					}
					if (i == 11) {
						System.out.print("Vale ");
						if (a == 1)
							System.out.println("spatiq");
						if (a == 2)
							System.out.println("karo");
						if (a == 3)
							System.out.println("kupa");
						if (a == 4)
							System.out.println("pika");
					} else {
						if (i == 12) {
							System.out.print("Dama ");
							if (a == 1)
								System.out.println("spatiq");
							if (a == 2)
								System.out.println("karo");
							if (a == 3)
								System.out.println("kupa");
							if (a == 4)
								System.out.println("pika");
						} else {
							if (i == 13) {
								System.out.print("Pop ");
								if (a == 1)
									System.out.println("spatiq");
								if (a == 2)
									System.out.println("karo");
								if (a == 3)
									System.out.println("kupa");
								if (a == 4)
									System.out.println("pika");
							}
							else {
								if (i == 14) {
									System.out.print("Aso ");
									if (a == 1)
										System.out.println("spatiq");
									if (a == 2)
										System.out.println("karo");
									if (a == 3)
										System.out.println("kupa");
									if (a == 4)
										System.out.println("pika");
								}
							}
						}
					}
				}
				counter++;
			}
		}
		sc.close();
	}
}