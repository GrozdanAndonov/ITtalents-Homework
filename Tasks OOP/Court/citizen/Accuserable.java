package citizen;

import java.util.HashSet;

public interface Accuserable {

	
	void askingQuestionsToTheAccusedAndToTheWitnesses(Accused accused, HashSet<Witness> witnesses);

	String getName();

	void increaseTheNumberOfCasesToTheLawyers();
	
}
