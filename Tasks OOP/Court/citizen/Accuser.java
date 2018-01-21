package citizen;

import java.util.HashSet;

import enums.CitizenType;
import legalEntity.Lawyer;

public class Accuser extends CitizensWithLawyers implements Accuserable {

	
	public Accuser(String name, String address, int age) {
		super(name, address, age);
		super.type = CitizenType.ACCUSER;
	}

	
	public void askingQuestionsToTheAccusedAndToTheWitnesses(Accused accused, HashSet<Witness> witnesses){
			for (Lawyer lawyer : super.lawyers) {
				lawyer.askQuestionToACitizen(accused);
				lawyer.askQuestionToACitizen(accused);
				lawyer.askQuestionToACitizen(accused);
				for (Witness witness : witnesses) {
					lawyer.askQuestionToACitizen(witness);
					lawyer.askQuestionToACitizen(witness);
				}
			}
	}

	
}
