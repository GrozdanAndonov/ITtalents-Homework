package RakidjiinicaF.Threads;

import RakidjiinicaF.RakidjiinicaF.Threads.KooperativenMagazin;

public class Piqnde extends Thread{

	private KooperativenMagazin magazin;
	
	public Piqnde(KooperativenMagazin magazin){
		this.magazin = magazin;
	}
	
	
	@Override
	public void run() {
		
		while(true){
			this.magazin.getBottlesRakiq(5);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error:"+e.getMessage());
			}
		}
	}
	
}
