package court;

import java.util.HashSet;
import java.util.Random;

import citizen.Accused;
import citizen.Accuserable;
import citizen.Witness;
import enums.CaseType;
import legalEntity.Judge;
import legalEntity.Juror;

public abstract class Case {

	protected CaseType type;
	protected Judge judge;
	protected HashSet<Juror> jurors;
	protected Accused accused;
	protected Accuserable accuser;
	protected HashSet<Witness> witnesses;
	
	public Case(Judge judge,Accused accused){
		if(judge!=null && accused!=null){
			this.judge = judge;
			this.accused = accused;
		}
		this.jurors = new HashSet<Juror>();
		this.witnesses = new HashSet<Witness>();
	}
	
	public void addJurorsInTheCase(HashSet<Juror> jurors){
		if(jurors!=null){
			this.jurors = jurors;
		}else{
			System.out.println("Invalid argument!");
		}
	}
	
	
	public void addWitnesses(HashSet<Witness> witnesses){
		if(witnesses!=null){
		this.witnesses = witnesses;
		}else{
			System.out.println("Invalid argument!");
		}
	}
	
	
		
	
	
	public  void conductTheCase(){
		this.increaseTheNumberOfCasesToAllLegalEntity();
		this.accused.lawyersAskQuestionsToTheWitnesses(witnesses);
	}
	
	protected boolean allJurorsVote(){
		Random r = new Random();
		int random;
		int guilty = 0;
		for(int i = 0; i < this.jurors.size(); i++){
			random = r.nextInt(2);
			if(random == 0){
				guilty++;
			}
		}
		if(guilty > this.jurors.size() / 2){
			return true;
		}
		return false;
	}
	
	
	private void increaseTheNumberOfCasesToAllLegalEntity(){
		this.judge.increaseNumberOfCases();
		for (Juror juror : jurors) {
			juror.increaseNumberOfCases();
		}
		this.accused.increaseTheNumberOfCasesToTheLawyers();
		this.accuser.increaseTheNumberOfCasesToTheLawyers();
	}
	protected abstract void accuserAsksQuestionsToTheAccuserAndToTheWitnesses();
	
	public void showWitnesses(){
		for (Witness witness : this.witnesses) {
			System.out.println(witness);
		}
	}
	
	@Override
	public String toString() {
		return this.type +":Judge:"+this.judge.getName()+":Accuser:"+this.accuser.getName()+":Accused:"+this.accused.getName()+":numOfWitnesses:"+this.witnesses.size();
	}
	
}
