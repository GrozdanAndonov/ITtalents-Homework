package shop.product;

import enumProducts.TypeProduct;

public class CountableProduct extends Product<Integer> {

	private int quantity;
	
	public CountableProduct(String name, double price, int quantity) throws IllegalArgumentException {
		super(name, price);
		if(quantity>0){
			this.quantity = quantity;
		}else{
			throw new IllegalArgumentException();
		}
		this.type = TypeProduct.COUNTABLE_PRODUCT;
	}

	@Override
	public Integer getQuantity() {
		return this.quantity;
		
	}

	@Override
	public int compareProductsQuantity(Product product) throws IllegalArgumentException{
		if(product!=null){
			return Integer.compare(this.quantity, (int) product.getQuantity());
		}else{
			throw new IllegalArgumentException();
		}
			
	}

	@Override
	public boolean removeQuantity(Integer quantity) throws IllegalArgumentException{
		if(quantity!=null){
			if(Integer.compare(this.quantity, quantity)<0){
				System.out.println("Not enough quantity.Quantity left in the shop:"+this.quantity);
				return false;
			}else{
				this.quantity-=quantity;
				System.out.println(quantity+" removed from "+this.name);
				return true;
			}
		}else{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public boolean addQuantity(Integer quantity) throws IllegalArgumentException{
		if(quantity!=null){
			this.quantity+=quantity;
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
		return this.name+" : "+this.quantity+" : "+this.price+"lv";
	}

}
