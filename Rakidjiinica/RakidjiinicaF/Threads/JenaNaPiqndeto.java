package RakidjiinicaF.Threads;

import RakidjiinicaF.RakidjiinicaF.Threads.Bidon;
import RakidjiinicaF.RakidjiinicaF.Threads.KooperativenMagazin;
import RakidjiinicaF.RakidjiinicaF.Threads.StuklarskiCeh;
import RakidjiinicaF.RakidjiinicaF.Threads.ZavodZahar;

public class JenaNaPiqndeto extends Thread{

	private ZavodZahar zavod;
	private StuklarskiCeh ceh;
	private Bidon bidon;
	private KooperativenMagazin magazin;
	
	public JenaNaPiqndeto(ZavodZahar zavod,StuklarskiCeh ceh, Bidon bidon, KooperativenMagazin magazin, Thread piqnde) {
		this.zavod=zavod;
		this.ceh = ceh;
		this.bidon = bidon;	
		this.magazin=magazin;
	}
		
	@Override
	public void run() {
		Thread t = new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println("Sprii da piesh be!!---");
					try {
						sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
			t.start();
		while(true){
			this.bidon.getGrozde(50);
			this.ceh.getJars(70);
			this.zavod.getShugar(10);
			try {
				sleep(15_000);
			} catch (InterruptedException e) {
				System.out.println("Error:"+e.getMessage());
			}
			this.magazin.addJarsKompot(70);	
			System.out.println("KOMPOTITE SA GOTOVII-----------------------------------------------");
		}	
	}
}
