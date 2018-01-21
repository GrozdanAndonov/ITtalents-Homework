package RakidjiinicaF.RakidjiinicaF.Threads;

public class StuklarskiCeh {

	private int quantityBottles;
	private int quantityJars;
	private static final int MAX_CAPACITY_BOTTLES=400;
	private static final int MAX_CAPACITY_JARS=250;
	private int incomeBottles;
	private int outcomeBottles;
	private int incomeJars;
	private int outcomeJars;
	
	
	Object mutex = new Object();
	
	public StuklarskiCeh(){
		this.quantityBottles = 0;
		this.quantityJars=0;
		this.incomeBottles=0;
		this.outcomeBottles=0;
		this.incomeJars=0;
		this.outcomeJars=0;
	}
	
	public int getIncomeBottles() {
		return incomeBottles;
	}
	public int getOutcomeBottles() {
		return outcomeBottles;
	}
	
	public int getIncomeJars() {
		return incomeJars;
	}
	public int getOutcomeJars() {
		return outcomeJars;
	}
	public void setNewDay(){
		this.outcomeBottles=0;
		this.incomeBottles=0;
		this.incomeJars=0;
		this.outcomeJars=0;
	}
	
	synchronized public void addBottles(int quantity) throws InterruptedException{
		
		while(this.quantityBottles+quantity>StuklarskiCeh.MAX_CAPACITY_BOTTLES){
			wait();
		}
		this.quantityBottles+=quantity;
		this.incomeBottles+=quantity;
		System.out.println(Thread.currentThread().getName()+" added "+quantity +" BOTTLES!");
		System.out.println("Current quantity bottles: "+this.quantityBottles + "------BOTTLES");
		notifyAll();
	}
	
	 public void addJars(int quantity) throws InterruptedException{
			synchronized(mutex){
			while(this.quantityJars+quantity>StuklarskiCeh.MAX_CAPACITY_JARS){
				mutex.wait();
			}
			this.quantityJars+=quantity;
			this.incomeJars+=quantity;
			System.out.println(Thread.currentThread().getName()+" added "+quantity +" JARS!");
			System.out.println("Current quantity bottles: "+this.quantityJars + "-------JARS");
			mutex.notifyAll();
			}
		}
		
	
	synchronized public void getBottles(int quantity) throws InterruptedException{
		
			while(this.quantityBottles-quantity<0){
				wait();
			}
			this.quantityBottles-=quantity;
			this.outcomeBottles+=quantity;
			System.out.println(Thread.currentThread().getName()+" get "+quantity +" BOTTLES!");
			System.out.println("Current quantity bottles: "+this.quantityBottles + "------BOTTLES");
			notifyAll();
		}
	
	 public void getJars(int quantity){
		 
		synchronized (mutex) {
			
			while(this.quantityJars-quantity<0){
				try {
					mutex.wait();
				} catch (InterruptedException e) {
						System.out.println("Error:"+e.getMessage());
				}
			}
				this.quantityJars-=quantity;
				this.outcomeJars+=quantity;
				System.out.println(Thread.currentThread().getName()+" get "+ quantity + " JARS!");
				System.out.println("Current quantity bottles: " + this.quantityJars);
				mutex.notifyAll();
		}
	}
}
