package Property;

import Imoti.Agent;
import Imoti.Client.Seller;
import enums.TypeOfConstruction;
import enums.TypeOfProperty;

public class Apartment extends Property{
	
	private TypeOfConstruction typeOfConstruction;
	private enums.Apartment type;
	
	public Apartment(String description, String address, double price, double area, enums.Apartment type,TypeOfConstruction typeConst)throws IllegalArgumentException{
		super(description, address, price, area);
		this.type = type;
		this.typeProperty = TypeOfProperty.APARTMENT;
		this.typeOfConstruction = typeConst;
	}

	
	
}
