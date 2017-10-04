package RakidjiinicaF.Threads;

import java.util.Random;

import RakidjiinicaF.RakidjiinicaF.Threads.Bidon;
import RakidjiinicaF.RakidjiinicaF.Threads.KooperativenMagazin;
import RakidjiinicaF.RakidjiinicaF.Threads.StuklarskiCeh;
import RakidjiinicaF.RakidjiinicaF.Threads.ZavodZahar;

public class Rakidjiiq extends Thread{

	private Bidon bidon;
	private ZavodZahar zavod;
	private StuklarskiCeh ceh;
	private KooperativenMagazin magazin;
	
	public Rakidjiiq(Bidon b, ZavodZahar zavod, StuklarskiCeh ceh, KooperativenMagazin magazin){
		 this.bidon=b;
		 this.zavod = zavod;
		 this.ceh=ceh;
		 this.magazin=magazin;
	 }
	
	
	@Override
	public void run() {
	while(true){
		try {
			this.bidon.getGrozde(25);
			Random r = new Random();
			int rand =15+r.nextInt(24-15);
			int res = 0;
			if((24-rand)%4==0){
				res=(24-rand)/4;
			}else{
				res = (24-rand)/4+1;
			}
			this.zavod.getShugar(res);
			this.ceh.getBottles(30);
			this.magazin.addBootlesRakiq(30);
			sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Error:"+e.getMessage());
		}
		
	}
		
		
	}
	
}
