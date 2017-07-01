import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която по въведени начална и крайна
//		цифра се извеждат на всеки нов ред следната последователност
//		(триъгълник от знаци):
//		Пример: 1, 9
//		Изход:
//		1
//		1 2
//		1 2 3
//		... до
//		1 2 3 4 5 6 7 8 9
		
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		int count=b-a;
		print(a,b,count+1,0);
		sc.close();
	}
	
	static int print(int a , int b,int count,int pos){
		int s=a;
		if(count<=0){
			return 0;
		}
		for(int c=0;c<=pos;c++){
				System.out.print(s);
				s++;
		}	
		System.out.println();
		return print(a,b,count-1,pos+1);	
	}
}
