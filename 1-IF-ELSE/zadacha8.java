import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
		
//		Да се състави програма, която чете от конзолата 4-цифренo
//		естествено число от интервала [1000.. 9999]. От това число се
//		формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
//		и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
//		3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
//		ново число e по-малко <, равно = или по-голямо от 2-то число.
//		Пример: 3332 Изход: по-малко (32<33)
//		Пример: 1144 Изход: равни (14=14)
//		Пример: 9875 Изход: по-голямо (95>87)


		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(num<=9999 && num>=1000){
			
			int part1=num/1000*10;
			int part2=num%10;
			int num1 =part1+part2;
			part1=(num/100)%10*10;
			part2=(num/10)%10;
			int num2=part1+part2;
			if(num1<num2){
				System.out.println("по-малко ("+num1+"<"+num2+")");
			}else{
				if(num1==num2){
					System.out.println("равни ("+num1+"="+num2+")");
				}else{
					if(num1>num2){
						System.out.println("по-голямо ("+num1+">"+num2+")");
					}
				}
			}	
		}else{
			System.out.println("NOT IN THE RANGE [1000-9999]");
		}
		sc.close();
	}
}
