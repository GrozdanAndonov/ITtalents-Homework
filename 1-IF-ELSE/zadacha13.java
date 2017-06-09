import java.util.Scanner;

public class zadacha13 {

	public static void main(String[] args) {
		
		
//		Да се състави програма, която да отгатне колко е студено/топло по
//		въведената температура t в градус Целзий.
//		Температурните интервали са:
//		под -20 ледено студено;
//		между 0 и -20 - студено;
//		между 15 и 0 - хладно;
//		между 25 и 15 - топло;
//		над 25 – горещо.
//		Входни данни: цяло число от интервала [-100..100].
//		Пример: 12
//		Изход: хладно

		
		Scanner sc=new Scanner(System.in);
		
		int temperature=sc.nextInt();
		if(temperature<100 && temperature>-100){
		if(temperature<=-20){
			System.out.println("ledeno studeno");
		}else{
			if(temperature<=0 && temperature>-20){
				System.out.println("studeno");
			}else{
				if(temperature<=15 && temperature>0){
					System.out.println("hladno");
				}else{
					if(temperature<=25 && temperature>15){
						System.out.println("toplo");
					}else{
						if(temperature>25){
							System.out.println("goreshto");
						}
					}
				}
			}
		}
		}else{
			System.out.println("Ne e v intervala");
		}
		sc.close();
	}

}
