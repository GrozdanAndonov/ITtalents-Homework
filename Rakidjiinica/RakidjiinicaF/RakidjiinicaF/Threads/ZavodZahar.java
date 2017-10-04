package RakidjiinicaF.RakidjiinicaF.Threads;

public class ZavodZahar {
		private static final int  MAX_CAPACITY = 300;
		private int quantity;
		
		private int incomeTrustika;
		private int outcomeSugar;
		
		public ZavodZahar(){
			this.quantity = 0;
			this.incomeTrustika=0;
			this.outcomeSugar=0;
		}
	
		
		public int getIncomeTrustika() {
			return incomeTrustika;
		}
		public int getOutcomeSugar() {
			return outcomeSugar;
		}
		
		public void setNewDay(){
			this.incomeTrustika=0;
			this.outcomeSugar=0;
		}
		
	public synchronized void getShugar(int quantity){
		while(this.quantity<quantity){
			try {
				wait();
			} catch (InterruptedException e) {
					System.out.println("Error:"+e.getMessage());
			}
		}
		notifyAll();
		this.quantity-=quantity;
		this.outcomeSugar+=quantity;
		System.out.println(Thread.currentThread().getName()+" get "+quantity+" SUGAR!");
		System.out.println("Current capacity:"+this.quantity+"------- SUGAR");
	}
		
	public synchronized void addShugar(int quantity) throws InterruptedException{
			
		while(this.quantity+quantity>ZavodZahar.MAX_CAPACITY){
			wait();
		}
		notifyAll();
		this.quantity+=quantity;
		this.incomeTrustika+=quantity;
		System.out.println(Thread.currentThread().getName()+" added "+quantity+"SUGAR!");	
	}
}
