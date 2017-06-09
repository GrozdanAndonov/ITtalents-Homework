import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		
//		Въведете число от клавиатурата и определете дали е
//		просто. Просто число е това което се дели САМО на 1 и на себе
//		си.
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		boolean prime=true;
		int divider=2;
		int maxDivider=(int)Math.sqrt(num);
		while(prime &&(divider<=maxDivider)){
			if(num%divider==0){
				prime=false;
			}
			divider++;
		}
		if(prime){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
		sc.close();
	}
}
