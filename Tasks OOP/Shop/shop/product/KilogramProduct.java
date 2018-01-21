package shop.product;

import enumProducts.TypeProduct;

public class KilogramProduct extends Product<Double>{

	protected double quantity;
	
	public KilogramProduct(String name, double price, double quantity) throws IllegalArgumentException {
		super(name, price);
		if(quantity>0){
			this.quantity = quantity;
		}else{
			throw new IllegalArgumentException();
		}
		this.type = TypeProduct.KILOGRAM_PRODUCT;
	}

	@Override
	public Double getQuantity() {
		return this.quantity;
	}

	@Override
	public int compareProductsQuantity(Product product) throws IllegalArgumentException{
		if(product!=null){
		return Double.compare(this.quantity, (double) product.getQuantity());
		}else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public boolean removeQuantity(Double quantity) {
		if(quantity!=null){
			if(Double.compare(this.quantity, quantity)<0){
				System.out.println("Not enough quantity.Quantity left in the shop:"+this.quantity);
				return false;
			}else{
				this.quantity-=quantity;
				return true;
			}
		}else{
			throw new IllegalArgumentException();
		}
	}
	@Override
	public boolean addQuantity(Double quantity) throws IllegalArgumentException{
		if(quantity!=null){
			this.quantity+=quantity;
			System.out.println(quantity+":"+this.name +" returned to the shop!");
			return true;
		}else{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public double getPrice() {
		return this.quantity*super.price;
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.quantity+"kg : "+this.price+"lv";
	}
	
}
