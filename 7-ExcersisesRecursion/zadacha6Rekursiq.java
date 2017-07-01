
public class zadacha6Rekursiq {

	public static void main(String[] args) {
		System.out.println(findFibonachiNum(40));
	}

	public static long findFibonachiNum(int num){
		if(num==0 || num==1){
			return(long)num;
		}else{
			return findFibonachiNum(num-1)+findFibonachiNum(num-2);
		}	
	}
}
