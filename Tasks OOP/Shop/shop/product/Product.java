package shop.product;

import enumProducts.TypeProduct;

public abstract class Product <T>{

	protected String name;
	protected double price;
	protected TypeProduct type;
	protected Product(String name, double price) throws IllegalArgumentException{
		if(name!=null && !name.isEmpty() && price > 0){
			this.name = name;
			this.price = price;
		}else{
			throw new IllegalArgumentException();
		}
	}
	public String getName() {
		return name;
	}
	
	public TypeProduct getType() {
		return type;
	}
	
	public abstract T getQuantity();
	
	public abstract boolean removeQuantity(T quantity);
	
	public abstract boolean addQuantity(T quantity);
	
	public abstract double getPrice();
	
	public abstract int compareProductsQuantity(Product product);
	
	
	
}
