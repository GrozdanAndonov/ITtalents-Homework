package RakidjiinicaF.Threads;

import RakidjiinicaF.RakidjiinicaF.Threads.ZavodZahar;

public class BerachTrustika extends Thread{

	private ZavodZahar zavod;
	
	public BerachTrustika(ZavodZahar zavod) {
		this.zavod = zavod;
	}
	
	@Override
	public void run() {
		
		while(true){
			try {
				zavod.addShugar(45);
				sleep(4500);
			} catch (InterruptedException e) {
					System.out.println("Error:"+ e.getMessage());
			}
		}
		
	}
	
	
	
}
