package RakidjiinicaF.RakidjiinicaF.Threads;

public class KooperativenMagazin {

	private static final int MAX_BOTTLES=150;
	private static final int MAX_JARS=200;
	private int quantityRakiq;
	private int quantityKompot;
	private int incomeRakia;
	private int outcomeRakia;
	private int incomeKompot;
	private int outcomeKompot;
	
	public KooperativenMagazin() {
		this.quantityKompot=0;
		this.quantityRakiq=0;
		this.incomeRakia=0;
		this.outcomeRakia=0;
		this.incomeKompot=0;
		this.outcomeKompot=0;
	}
	
	Object mutex = new Object();
	
	public int getIncomeRakia() {
		return incomeRakia;
	}
	public int getOutcomeRakia() {
		return outcomeRakia;
	}
	
	public int getIncomeKompot() {
		return incomeKompot;
	}
	public int getOutcomeKompot() {
		return outcomeKompot;
	}
	public void setNewDay(){
		this.outcomeRakia=0;
		this.incomeRakia=0;
		this.incomeKompot=0;
		this.outcomeKompot=0;
	}
			
	 public void getBottlesRakiq(int quantity){
		
		 synchronized(mutex){
		while(this.quantityRakiq<quantity){
			try {
				mutex.wait();
			} catch (InterruptedException e) {
				System.out.println("Error:"+e.getMessage());
			}
		}
		this.quantityRakiq-=quantity;
		this.outcomeRakia+=quantity;
		System.out.println(Thread.currentThread().getName()+" get "+quantity+" RAKIA!");
		System.out.println("RAKIA - "+this.quantityRakiq);
		mutex.notifyAll();
		 }
	}
	
	 public void addBootlesRakiq(int quantity){
		 synchronized(mutex){
		while(this.quantityRakiq+quantity>KooperativenMagazin.MAX_BOTTLES){
			try {
				mutex.wait();
			} catch (InterruptedException e) {
				System.out.println("Error:"+e.getMessage());
			}
		}
		this.quantityRakiq+=quantity;
		this.incomeRakia+=quantity;
		System.out.println(Thread.currentThread().getName()+" added "+quantity+" RAKIA!");
		System.out.println("RAKIA - "+this.quantityRakiq);
		mutex.notifyAll();
		}
	}
	
synchronized public void getJarsKompot(int quantity){
		
		while(this.quantityKompot<quantity){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Error:"+e.getMessage());
			}
		}
		this.quantityKompot-=quantity;
		this.outcomeKompot+=quantity;
		System.out.println(Thread.currentThread().getName()+" get "+quantity+" KOMPOT!");
		System.out.println("KOMPOT - "+this.quantityKompot);
		notifyAll();
	}
	
	synchronized public void addJarsKompot(int quantity){
		
		while(this.quantityKompot+quantity>KooperativenMagazin.MAX_JARS){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Error:"+e.getMessage());
			}
		}
		this.quantityKompot+=quantity;
		this.incomeKompot+=quantity;
		System.out.println(Thread.currentThread().getName()+" added "+quantity+" KOMPOT!");
		System.out.println("KOMPOT - "+this.quantityKompot);
		notifyAll();
	}
}
