
public class zad2top {
	public static void main(String[] args){
		
//		 Да се създаде програма , която въвежда от
//		 клавиатурата имената на 10 работника в масив и заплатите
//		 им в отделен масив. Да извежда:
//		 ● името и заплатата на работника с най-виока заплата
//		 ● името и заплатата на работника с най-ниска заплата
//		 ● Сумата на всички заплати
//		 ● Средно аритметичното на всички заплати
		
		String[] names={"Dan","Ivan","Bogdan","Opara","Gosi","Pavlov","Stankov","Andonov","Lazarov","Petrov"};
		double[] payments={20.23,51.64,12.23,564.32,324.23,4636.43,123.52,41,4256,123.41};
		
		double maxPayment=0;
		double minPayment=99999999;
		double midAritmeticPayment=0;
		int workerIndexMax=-1;
		int workerIndexMin=-1;
		double sum=0;
		for(int i=0;i<payments.length;i++){
			sum+=payments[i];
			double payment=payments[i];
			if(payment>maxPayment){
				maxPayment=payment;
				workerIndexMax=i;
			}
			if(payment<minPayment){
				minPayment=payment;
				workerIndexMin=i;
			}
		}
		
		midAritmeticPayment=sum/payments.length;
		System.out.println(names[workerIndexMax]+":"+maxPayment);
		System.out.println(names[workerIndexMin]+":"+minPayment);
		System.out.println(sum);
		System.out.println(midAritmeticPayment);
		
	}
}
