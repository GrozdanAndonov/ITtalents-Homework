import java.util.Scanner;

public class zadacha22 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	
		int num=sc.nextInt();
		int counter=0;
		int delitel=num;
		while(!(counter==10)){
			
			if(delitel%2==0 || delitel%3==0 || delitel%5==0){
				counter++;
				System.out.println(counter+":"+delitel);
			}
			delitel++;
		}
		sc.close();
	}
}