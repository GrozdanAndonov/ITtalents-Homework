package RakidjiinicaF;

import DB.DBManager;
import RakidjiinicaF.RakidjiinicaF.Threads.Bidon;
import RakidjiinicaF.RakidjiinicaF.Threads.KooperativenMagazin;
import RakidjiinicaF.RakidjiinicaF.Threads.StuklarskiCeh;
import RakidjiinicaF.RakidjiinicaF.Threads.ZavodZahar;
import RakidjiinicaF.Threads.BerachTrustika;
import RakidjiinicaF.Threads.Berachka;
import RakidjiinicaF.Threads.JenaNaPiqndeto;
import RakidjiinicaF.Threads.Piqnde;
import RakidjiinicaF.Threads.Rakidjiiq;
import RakidjiinicaF.Threads.Stuklar;

public class Demo {

	public static void main(String[] args) {
		
		Bidon bidon = new Bidon();
		ZavodZahar zavod = new ZavodZahar();
		StuklarskiCeh ceh = new StuklarskiCeh();
		KooperativenMagazin magazin = new KooperativenMagazin();
		Thread berachka1 = new Berachka(bidon);
		Thread berachka2 = new Berachka(bidon);
		Thread berach1 = new BerachTrustika(zavod);
		Thread berach2 = new BerachTrustika(zavod);
		Thread stuklar1 = new Stuklar(ceh);
		Thread stuklar2 = new Stuklar(ceh);
		Thread piqnde = new Piqnde(magazin);
		Thread rakidjiiq = new Rakidjiiq(bidon, zavod, ceh, magazin);
		Thread jenaRikidjiq = new JenaNaPiqndeto(zavod, ceh, bidon, magazin, piqnde);
		Thread db = new DBManager(bidon,magazin,ceh,zavod);
		db.setDaemon(true);
		berachka1.start();
		berachka2.start();
		berach1.start();
		berach2.start();
		stuklar1.start();
		stuklar2.start();
		piqnde.start();
		jenaRikidjiq.start();
		rakidjiiq.start();
		db.start();
		
	}
	
	
	
	
	
}
