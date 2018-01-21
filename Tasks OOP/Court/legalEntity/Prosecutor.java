package legalEntity;

import java.util.HashSet;

import citizen.Accused;
import citizen.Accuserable;
import citizen.Citizen;
import citizen.Witness;
import enums.LegalEntityType;

public class Prosecutor extends LegalEntity implements Accuserable{

	public Prosecutor(String name, int internship, int numberOfCases) throws IllegalArgumentException {
		super(name);
		if(internship>=10 && numberOfCases >= 0){
			super.internship = internship;
			super.numberOfCases = numberOfCases;
			super.type = LegalEntityType.PROSECUTOR;
		}else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void askingQuestionsToTheAccusedAndToTheWitnesses(Accused accused, HashSet<Witness> witnesses) {
		this.askQuestionToACitizen(accused);
		this.askQuestionToACitizen(accused);
		this.askQuestionToACitizen(accused);
		this.askQuestionToACitizen(accused);
		this.askQuestionToACitizen(accused);
		for (Witness witness : witnesses) {
			super.askQuestionToACitizen(witness);
			super.askQuestionToACitizen(witness);
			super.askQuestionToACitizen(witness);
			super.askQuestionToACitizen(witness);
			super.askQuestionToACitizen(witness);
		}
		
	}

	@Override
	public void increaseTheNumberOfCasesToTheLawyers() {
		// TODO Auto-generated method stub
		
	}


}
