package RakidjiinicaF.RakidjiinicaF.Threads;

public class Bidon {

	private int quantityGrozde;
	private final static int  MAX_CAPACITY=100;
	private int income;
	private int outcome;
	
	
	public Bidon(){
		this.quantityGrozde = 0;
		this.income=0;
		this.outcome=0;
	}
	
	public int getIncome() {
		return income;
	}
	
	public int getOutcome() {
		return outcome;
	}
	
	public void setNewDay(){
		this.outcome=0;
		this.income=0;
	}
	
	synchronized public void addGrozde(int kgGrozde) throws InterruptedException{
		
		while(this.quantityGrozde+kgGrozde>Bidon.MAX_CAPACITY){
			wait();
		}
		this.quantityGrozde+=kgGrozde;
		this.income+=kgGrozde;
		System.out.println(Thread.currentThread().getName()+" added:"+kgGrozde+"kgGrozde!");	
		System.out.println("Current capacity:"+this.quantityGrozde+"--------GROZDE");
		notifyAll();
	}
		
	synchronized public int getGrozde(int kgGrozde){
		while(this.quantityGrozde<kgGrozde){
			try {
				wait();
			} catch (InterruptedException e) {
					System.out.println("Error:"+e.getMessage());
			}
		}
		this.quantityGrozde-= kgGrozde;
		this.outcome+=kgGrozde;
		System.out.println(Thread.currentThread().getName()+" get "+kgGrozde+"kg grozde!");
		System.out.println("Current capacity:"+this.quantityGrozde+"--------GROZDE");
		notifyAll();
		return kgGrozde;	
	}
}
