package Property;

import Imoti.Agent;
import Imoti.Client.Seller;
import enums.TypeOfConstruction;
import enums.TypeOfProperty;

public class House extends Property{

	private Enum<enums.House> type;
	private TypeOfConstruction typeConst;
	private int numParkPlaces;
	private double yardArea;
	
	public House(String description, String address, double price, double area,  enums.House type, double yardArea,TypeOfConstruction typeConst) throws IllegalArgumentException{
		super(description, address, price, area);
		this.type = type;
		this.typeConst = typeConst;
		this.typeProperty = TypeOfProperty.HOUSE;
		if(area>=0){
			this.yardArea = yardArea;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	
	
}
