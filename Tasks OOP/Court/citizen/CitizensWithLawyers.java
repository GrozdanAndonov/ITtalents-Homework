package citizen;

import java.util.HashSet;

import legalEntity.Lawyer;

public abstract class CitizensWithLawyers extends Citizen{

	protected  HashSet<Lawyer> lawyers;
	
	public CitizensWithLawyers(String name, String address, int age) {
		super(name, address, age);
		this.lawyers = new HashSet<>();
	}
	
	public void increaseTheNumberOfCasesToTheLawyers(){
		for (Lawyer lawyer : lawyers) {
			lawyer.increaseNumberOfCases();
		}
	}

	public void setLawyers(HashSet<Lawyer> lawyers) {
		if(lawyers!=null){
		this.lawyers = lawyers;
		}
	}
	
}
