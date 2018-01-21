package legalEntity;

import java.util.Random;

import citizen.Citizen;
import enums.LegalEntityType;

public class Judge extends LegalEntity {

	public Judge(String name, int internship, int numberOfCases) throws IllegalArgumentException {
		super(name);
		if(internship>=5 && numberOfCases >= 0){
			super.internship = internship;
			super.numberOfCases = numberOfCases;
			super.type = LegalEntityType.JUDGE;
		}else{
			throw new IllegalArgumentException();
		}
	}

	public int pickYears(){
		Random r = new Random();
		return r.nextInt(37)+3;
	}

}
