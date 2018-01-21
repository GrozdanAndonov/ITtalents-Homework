package shop;

import java.util.HashMap;
import java.util.LinkedList;

import shop.product.Product;

public class Customer {

	private Shop shop;
	private double money;
	private HashMap<String, Product> shoppingCart;
	private double totalAmountForPayment;

	public Customer(Shop shop, double money) throws IllegalArgumentException {
		if (shop != null && money > 0) {
			this.shop = shop;
			this.money = money;
		} else {
			throw new IllegalArgumentException();
		}
		this.shoppingCart = new HashMap<String, Product>();
		this.totalAmountForPayment = 0;
	}

	public void addProductInTheShoppingCart(Product product) {
		if (this.shop.giveProductToACustomer(product)) {
			if(this.checkTheCostOfAProduct(product)){
			if(this.shoppingCart.containsKey(product.getName())){
				this.shoppingCart.get(product.getName()).addQuantity(product.getQuantity());
			}else{
				this.shoppingCart.put(product.getName(), product);
				System.out.println(product.getName()+":"+product.getQuantity()+" has been added to the shopping cart!");
			}
			}else{
				System.out.println("Not enough money for "+product.getName()+":"+product.getPrice()+"lv!");
			}
		}

	}
	
	private boolean checkTheCostOfAProduct(Product product) throws IllegalArgumentException{
		if(product!=null){
			if(product.getPrice()+this.totalAmountForPayment<=this.money){
				this.totalAmountForPayment+=product.getPrice();
				return true;
			}
			return false;
		}else{
			throw new IllegalArgumentException();
		}
	}

	public void removeProductFromTheShoppingCart(Product product) {
		if (product != null) {
			if (this.shoppingCart.containsKey(product.getName())) {
				int result = this.shoppingCart.get(product.getName()).compareProductsQuantity(product);
				if (result < 0) {
					System.out.println("Too much to remove from the shopping cart:IN THE CART-"
							+ this.shoppingCart.get(product.getName()).getQuantity() + "-REMOVING"
							+ product.getQuantity());
				} else if (result == 0) {
					this.shoppingCart.remove(product.getName());
					System.out.println(product.getName() + ":" + product.getQuantity() + " removed from the shopping cart!");
					this.shop.getReturnedProductFromACustomer(product);
					this.totalAmountForPayment-=product.getPrice();
				} else if (result > 0) {
					this.shoppingCart.get(product.getName()).removeQuantity(product.getQuantity());
					this.shop.getReturnedProductFromACustomer(product);
					this.totalAmountForPayment-=product.getPrice();
				}
			} else {
				System.out.println("No such product to remove:" + product.getName());
			}
		}
	}

	public void buyTheProducts(){
		double result = shop.sellProductsToCustomer(this.shoppingCart, this.totalAmountForPayment);
		if(result == 0){
			this.money-=this.totalAmountForPayment;
			this.totalAmountForPayment = 0;
			this.shoppingCart.clear();
		}else{
		System.out.println("You must decrease your products with:"+(result - this.totalAmountForPayment));
		}
	}
	
	public void showTheShoppingCart(){
		if(!this.shoppingCart.isEmpty()){
		for (String product : this.shoppingCart.keySet()) {
			System.out.println(this.shoppingCart.get(product));
		}
		}else{
			System.out.println("Shopping cart is empty!");
		}
		System.out.println("TOTAL:"+this.totalAmountForPayment+"lv.");
		System.out.println("MONEY:"+this.money+"lv.");
	}
	
}
