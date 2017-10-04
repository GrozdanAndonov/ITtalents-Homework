package RakidjiinicaF.Threads;

import java.util.Random;

import RakidjiinicaF.RakidjiinicaF.Threads.StuklarskiCeh;

public class Stuklar extends Thread{

	private StuklarskiCeh ceh;
	
	public Stuklar(StuklarskiCeh ceh) {
		this.ceh=ceh;
	}	
	@Override
	public void run() {	
		Random r = new Random();
		int rand=0;
		while(true){
		
			 rand =1+r.nextInt(99);
			if(rand<=50){
				try {
					ceh.addBottles(5);
					sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Error:"+e.getMessage());
				}
			}else{
				try {
					ceh.addJars(7);
					sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Error:"+e.getMessage());
				}
			}
		}	
	}
}
