package court;

import java.util.HashSet;

import citizen.Accused;
import enums.CaseType;
import legalEntity.Judge;
import legalEntity.Juror;
import legalEntity.Prosecutor;

public class CriminalCase extends Case {

	public CriminalCase(Judge judge, Accused accused, Prosecutor accuser) {// sudebnite zasedateli sa 13
		super(judge, accused);
		super.type = CaseType.CRIMINAL_CASE;
		super.accuser = accuser;
	}

	@Override
	public void addJurorsInTheCase(HashSet<Juror> jurors) {
		if(jurors !=null && jurors.size() == 13){
		super.addJurorsInTheCase(jurors);
		}
	}
	
	@Override
	public void conductTheCase() {
		super.conductTheCase();
		((Prosecutor)(this.accuser)).increaseNumberOfCases();
		this.accuserAsksQuestionsToTheAccuserAndToTheWitnesses();
		if(super.allJurorsVote()){
			System.out.println("The juror vote: GUILTY and the accused one is sentenced to "+super.judge.pickYears());	
		}else{
			System.out.println(super.accused + " is inocent!");
		}

	}

	@Override
	protected void accuserAsksQuestionsToTheAccuserAndToTheWitnesses() {
		this.accuser.askingQuestionsToTheAccusedAndToTheWitnesses(accused, witnesses);
		
	}

	
	
}
