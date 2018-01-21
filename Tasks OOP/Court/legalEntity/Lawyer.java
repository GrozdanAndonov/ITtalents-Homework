package legalEntity;

import citizen.Citizen;
import enums.LegalEntityType;

public class Lawyer extends LegalEntity {

	public Lawyer(String name, int internship, int numberOfCases) throws IllegalArgumentException {
		super(name);
		if(internship>=0 && numberOfCases >= 10){
			super.internship = internship;
			super.numberOfCases = numberOfCases;
			super.type = LegalEntityType.LAWYER;
		}else{
			throw new IllegalArgumentException();
		}
	}



}
