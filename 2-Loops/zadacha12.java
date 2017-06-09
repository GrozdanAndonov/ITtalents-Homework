
public class zadacha12 {

	public static void main(String[] args) {
//		Да се състави програма, която извежда всички
//		естествени трицифрени числа, които нямат еднакви цифри т.е.
//		100,101, 606 и т.н. не се извеждат
		int part1=0;
		int part2=0;
		int part3=0;
		for(int i=100;i<=999;i++){			
			 part1=i/100%10;
			 part2=i/10%10;
			 part3=i%10;
			if(part1!=part2 && part1!=part3 && part2!=part3){
				System.out.println(i);
			}
		}
	}
}
