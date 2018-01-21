package MusicalInstrument;

import enums.TypeInstrument;

public abstract class MusicalInstrument {

	protected String name;
	protected double price;
	protected int quantity;
	protected TypeInstrument type;
	
	protected MusicalInstrument(String name, double price, int quantity){
		if(name!=null && !name.isEmpty() && price > 0 && quantity>=0){
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean removeQuantity(int quantity){
		if(quantity<=this.quantity){
			this.quantity -= quantity;
			return true;
		}else{
			System.out.println("Not enough quantity for removing!");
			return false;
		}
	}
	
	public void addQuantity(int quantity){
		if(quantity>0){
			this.quantity+=quantity;
		}else{
			System.out.println("Not valid argument!");
		}
	}
	public TypeInstrument getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return this.name+"---"+this.price+"---"+this.quantity;
	}
	
}
