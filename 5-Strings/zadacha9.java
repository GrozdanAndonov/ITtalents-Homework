import java.util.Scanner;

public class zadacha9 {

//	Да се състави програма, чрез която по въведен низ съдържащ букви,
//	цифри, знак минус '-' се извежда сборът на въведените числа като се
//	отчита знакът '-' пред съответното число.
//	Вход: asd-12sdf45-56asdf100
//	Изход:
//	-12
//	45
//	-56
//	100
//	Сума = 77

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		while (str.length() < 1) {
			System.out.println("You have entered an empty string. Please try again!");
			str = sc.nextLine();
		}
		int sum = 0, num = 0, j = 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			while (Character.isDigit(str.charAt(i))) {
				num += j * (str.charAt(i) - '0');
				j *= 10;
				i -= 1;
				if (!Character.isDigit(str.charAt(i))) {
					if (str.charAt(i) == '-') {
						num *= -1;
					}
					System.out.println(num);
					sum += num;
					num = 0;
					j = 1;
					continue;
				}
			}
		}
		sc.close();
		System.out.println(sum);
	}
	// nqma validaciq
}