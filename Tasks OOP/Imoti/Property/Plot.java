package Property;

import Imoti.Agent;
import Imoti.Client.Seller;
import enums.TypeOfProperty;

public class Plot extends Property{

	private enums.Plot type;
	private boolean regulation;
	
	public Plot(String description, String address, double price, double area, enums.Plot type, boolean regulation) throws IllegalArgumentException{
		super(description, address, price, area);
		this.type = type;
		this.typeProperty = TypeOfProperty.PLOT;
		this.regulation = regulation;
	}

}
