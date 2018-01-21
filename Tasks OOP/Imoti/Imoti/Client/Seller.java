package Imoti.Client;

import Imoti.Agency;
import Property.Property;
import enums.TypeClient;

public class Seller extends Client{

	private Property property;
	
	public Seller(String name, String telNum, Property property, Agency agency, double money) throws IllegalArgumentException {
		super(name, telNum, agency, money);
		if(property!=null){
		this.property = property;
		this.property.setSeller(this);
		this.type = TypeClient.SELLER;
		}
	}

	
	public void registerProperty(){
			this.setAgent(this.agency.registerProperty(this.property, this));
	}
	
	
	
	
	
}
