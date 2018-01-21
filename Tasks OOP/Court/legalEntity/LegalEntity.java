package legalEntity;

import citizen.Citizen;
import enums.LegalEntityType;

public abstract class LegalEntity {

	protected String name;
	protected LegalEntityType type;
	protected int internship;
	protected int numberOfCases;
	
	protected LegalEntity(String name) throws IllegalArgumentException{
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}else{
			throw new IllegalArgumentException();
		}
	}
	public String getName() {
		return name;
	}
	
	public int getInternship() {
		return internship;
	}
	public int getNumberOfCases() {
		return numberOfCases;
	}
	public LegalEntityType getType() {
		return type;
	}
	
	public void askQuestionToACitizen(Citizen citizen){
		System.out.println(this.type+" "+this.name+" asks question to "+citizen.getName());
	}
	public void makeNotesWithTheCitizensAnswers(Citizen citizen){
		System.out.println(this.type+" "+this.name+" makes notes on "+citizen.getName()+" answers.");
	}
	
	public void increaseNumberOfCases(){
		this.numberOfCases++;
	}
	
	
	@Override
	public int hashCode() {
		return name.hashCode()+this.internship+this.numberOfCases;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((LegalEntity)(obj)).getName())){
			if(this.internship == ((LegalEntity)(obj)).getInternship()){
				if(this.numberOfCases == ((LegalEntity)(obj)).numberOfCases){
					return true;
				}
			}
		}
			return false;	
	}
	@Override
	public String toString() {
		return this.type+":name:"+this.name+":intership"+this.internship+":cases:"+this.numberOfCases;
	}
}
