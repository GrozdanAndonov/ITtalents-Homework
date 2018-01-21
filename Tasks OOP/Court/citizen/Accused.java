package citizen;

import java.util.HashSet;

import enums.CitizenType;
import legalEntity.Lawyer;

public class Accused extends CitizensWithLawyers {
	
	public Accused(String name, String address, int age) {
		super(name, address, age);
		super.type = CitizenType.ACCUSED;
	}

	public void lawyersAskQuestionsToTheWitnesses(HashSet<Witness> witnesses){
		for (Lawyer lawyer : super.lawyers) {
			for (Witness witness : witnesses) {
				lawyer.askQuestionToACitizen(witness);
				lawyer.askQuestionToACitizen(witness);
				lawyer.askQuestionToACitizen(witness);
				lawyer.askQuestionToACitizen(witness);
				lawyer.askQuestionToACitizen(witness);
			}
		}
	}
	
}
