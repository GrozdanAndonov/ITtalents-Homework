package legalEntity;

import citizen.Citizen;
import enums.LegalEntityType;

public class Juror extends LegalEntity{

	public Juror(String name) throws IllegalArgumentException {
		super(name);
		super.type = LegalEntityType.JUROR;
	}

}
