package RakidjiinicaF.Threads;

import RakidjiinicaF.RakidjiinicaF.Threads.Bidon;

public class Berachka extends Thread{

	private Bidon bidon;
	 
	 
	 public Berachka( Bidon b){
		 this.bidon=b;
	 }
	 
	 
	 
	@Override
	public void run() {
		while(true){
			try {
				this.bidon.addGrozde(10);
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Opa:"+e.getMessage());
			}
		}	
	}
	
	
}
