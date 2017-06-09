import java.util.Scanner;

public class zadacha12 {

	public static void main(String[] args) {
		
//		Високосни години са всички години кратни на 4 с изключения
//		столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
//		но 1600 и 2000 са високосни.
//		Съставете програма, която по дадени ден, месец, година отпечатва
//		следващата дата.
//		Входни данни: три числа за ден, месец, година.
//		Пример: 28, 2, 2000
//		Изход: 1,3,2000

		
		Scanner sc=new Scanner(System.in);
		
		int day=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		boolean leapYear=false;
			
		if(year%4==0) leapYear=true;
		if(year%100==0) leapYear=false;
		if(year%400==0) leapYear=true;
		
			day++;
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
				if(day>31){
					day=1;
					month++;
					if(month>12){
						month=1;
						year++;
					}
				}
				System.out.println(day+", "+month+", "+year);
			}else{
				if(month==4 || month==6 || month==9 || month==11){
					if(day>30){
						day=1;
						month++;
					}
					System.out.println(day+", "+month+", "+year);
				}else{
					if(month==2 && leapYear){
						if(day>29){
							day=1;
							month++;
						}
						System.out.println(day+", "+month+", "+year);
					}else{
						if(day>28){
							day=1;
							month++;
						}
						System.out.println(day+", "+month+", "+year);
					}
				}
			}
		sc.close();
	}
}
