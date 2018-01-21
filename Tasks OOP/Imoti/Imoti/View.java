package Imoti;

import java.util.Date;

import Imoti.Client.Buyer;
import Imoti.Client.Seller;
import Property.Property;

public class View {

	private Property property;
	private Agent agent;
	private Buyer buyer;
	private Date date;
	private Seller seller;
	public View(Property property, Agent agent, Buyer buyer, Date date, Seller seller) throws IllegalArgumentException{
		if(property!=null && agent!=null && buyer != null && date != null){
		this.property = property;
		this.agent = agent;
		this.buyer = buyer;
		this.date = date;
		}else{
			throw new IllegalArgumentException();
		}
	}
	public Property getProperty() {
		return property;
	}
	
	public Agent getAgent() {
		return agent;
	}
	
	public Buyer getBuyer() {
		return buyer;
	}
	
	@Override
	public String toString() {
		return this.buyer.toString()+" VIEW-"+this.date;
	}
	
	
	
}
