
public class zadacha20 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се извежда квадрат от
//		цифри. Сумите от елементите на произволен ред или стълб са
//		равни на 45.
		int start=0;
		for(int rows=1;rows<=10;rows++){	
			for(int cols=1;cols<=10;cols++){
				start++;
				if(start==10){
					start=0;
				}	
				System.out.print(start);			
				}
			System.out.println();
			start++;
			}	
		}
	}