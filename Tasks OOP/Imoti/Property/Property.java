package Property;

import Imoti.Agent;
import Imoti.Client.Seller;
import enums.TypeOfProperty;

public abstract class Property implements Comparable<Property>{

	protected String description;
	protected String address;
	protected double price;
	protected double area;
	protected Seller seller;
	protected Agent agent;
	protected TypeOfProperty typeProperty;
	Property(String description, String address,double price, double area){
		if(description!=null && !description.isEmpty() && address!=null && !address.isEmpty() && seller != null){
			this.description = description;
			this.address = address;
		}
		if(area>0 && price>0){
			this.area = area;
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public TypeOfProperty getTypeProperty() {
		return typeProperty;
	}
	
	@Override
	public int compareTo(Property o) {
		return (int) (this.price - o.getPrice());
	}
	
	public Seller getSeller() {
		return seller;
	}
	
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	@Override
	public String toString() {
		return this.typeProperty.toString()+":"+this.price+" : "+ this.agent.toString() +" : " +this.seller.toString(); 
		}
}
