package court;

import java.util.HashSet;
import java.util.Random;

import citizen.Accused;
import citizen.Accuser;
import enums.CaseType;
import legalEntity.Judge;
import legalEntity.Juror;

public class CivilCase extends Case {

	
	
	public CivilCase(Judge judge, Accused accused, Accuser accuser) {//sudebnite zasedateli sa 3ma
		super(judge, accused);
		super.type = CaseType.CIVIL_CASE;
		this.accuser = accuser;		
	}

	@Override
	public void addJurorsInTheCase(HashSet<Juror> jurors) {
		if(jurors != null && jurors.size() == 3){
		super.addJurorsInTheCase(jurors);
		}
	}
	
	@Override
	public void conductTheCase() {
		super.conductTheCase();
		this.accuserAsksQuestionsToTheAccuserAndToTheWitnesses();
		if(super.allJurorsVote()){
			System.out.println("The juror vote: GUILTY and the accused one is sentenced to "+super.judge.pickYears());	
		}else{
			System.out.println(super.accused + " is inocent!");
		}
	}

	protected void accuserAsksQuestionsToTheAccuserAndToTheWitnesses(){
		super.accuser.askingQuestionsToTheAccusedAndToTheWitnesses(super.accused, super.witnesses);
	}
	
	
	
	
}
