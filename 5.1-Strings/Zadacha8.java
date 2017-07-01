import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {

		// На някои мобилни телефони английската азбука се получава от
		// натискане на клавишите по следния начин: ABC(2), DEF(3),
		// GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
		// Напишете програма, която приема последователност от
		// натискания на клавиши (цифри) и конвертира
		// последователността към символен низ от английски букви.
		Scanner sc = new Scanner(System.in);
		String digits = sc.nextLine();
		int count = 0;
		for (int i = 0; i < digits.length(); i++) {

			if (i + 1 == digits.length()) {
				System.out.println(getAlphabet(count, digits.charAt(i)));
				count = 0;
			} else {
				if (digits.charAt(i) == digits.charAt(i + 1) || i == digits.length() - 1) {
					count++;
				} else {
					System.out.print(getAlphabet(count, digits.charAt(i)));
					count = 0;
				}
			}
		}
		sc.close();
	}

	static char getAlphabet(int count, char ch) {

		String[] alphabet = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		int result = -1;
		int index = Character.getNumericValue(ch) - 2;
		if (count > 3 && ((index >= 0 && index <= 4) || index == 6)) {
			result = count % 3;
		} else {
			if (count > 4 && (index == 5 || index == 7)) {
				result = count % 4;
			} else {
				if (count <= 3 && ((index >= 0 && index <= 4) || index == 6)) {
					result = count;
				} else {
					if (count <= 4 && (index == 5 || index == 7)) {
						result = count;
					}
				}
			}
		}
		return alphabet[index].charAt(result);
	}
}