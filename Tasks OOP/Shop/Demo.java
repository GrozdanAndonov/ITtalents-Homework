import shop.Customer;
import shop.Shop;
import shop.product.CountableProduct;
import shop.product.KilogramProduct;

public class Demo {

	
	public static void main(String[] args) {
		
		Shop shop = new Shop("Makedoneca","Sandanski");
		
		Customer cust1 = new Customer(shop,100);		
		
//		shop.showAvailableProducts();
		shop.showAvailableProducts();
		cust1.addProductInTheShoppingCart(new CountableProduct("Cola", 2.58, 5));
//		cust1.showTheShoppingCart();
//		shop.showAvailableProducts();
//		cust1.buyTheProducts();
//		shop.showAvailableProducts();
		cust1.showTheShoppingCart();
		cust1.addProductInTheShoppingCart(new KilogramProduct("Meat", 9.8, 1));
		cust1.addProductInTheShoppingCart(new CountableProduct("Cola",2.58,6));
		cust1.removeProductFromTheShoppingCart(new CountableProduct("Cola", 2.58, 11));
		cust1.showTheShoppingCart();
//		shop.showAvailableProducts();
//		cust1.buyTheProducts();
//		cust1.showTheShoppingCart();
//		shop.showAvailableProducts();
	}
	
}
