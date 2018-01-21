package shop;


import java.util.HashMap;
import java.util.Map;
import enumProducts.TypeProduct;
import shop.product.CountableProduct;
import shop.product.KilogramProduct;
import shop.product.Product;

//Реализирайте структура от класове, която да представлява работата на магазин за стоки.
//Магазинът има следните характеристики:
// Наименование;
// Адрес;
// Пари в касата;
// Списък с продукти.
//Всеки продукт има следните характеристики:
// Наименование;
// Цена;
// Наличност –килограм или брой в зависимост от вида на продукта.
//Продуктите могат да се продават на килограм или на бройка. Няма продукти, които да се
//продават както на килограм, така и на брой.
//В магазина могат да пазаруват купувачи. Всеки купувач има следните характеристики:
// Магазин, в който е влязал да пазарува;
// Сума пари, която носи със себе си;
// Максимален брой артикули, които може да купи.
//Всеки купувач може да извършва следните действия:
// Да добавя продукт на килограм към количката си;
// Да добавя продукт на бройки в количката си;
// Да премахва продукт на килограм от количката си;
// Да премахва продукт на бройки от количката си.
//Ако продукта се продава на килограм или на бройки, се упоменава колко килограма или
//колко броя от продукта се добавят или премахват. Добавянето или премахването на
//продукта ше актуализира наличността на съответния продукт както в количката на
//купувача, така и в магазина, в който се намира.
// Да плаща всички продукти на касата. Плащането увеличава парите на магазина и
//намалява тези на купувача.
//Да се реализира демо програма, която има следните възможности:
//1. Създаване на магазин с предварително подадена вместимост от продукти;
//2. Създаване на различни видове стоки на килограм –Месо, Сирене, Риба. Всяка стока се
//създава с наименование, цена и количество;
//3. Създаване на различни видове стоки на бройка –Бира, Книга, Стол. Всяка стока се
//създава с наименование, цена и количество;
//4. Добавяне на стоките в магазина;
//5. Създаване на купувачи с предварително подадени магазин, брой продукти за
//пазаруване и пари в наличност.
//6. Добавяне на стоки към количката на купувачите;
//7. Премахване на стоки от количката на купувачите;
//8. Плащане от страна на купувачите на касата на магазина;
//9. Визуализиране на наличностите в магазина преди и след като е пазарувал купувача.
//10. Демото трябва да е така направено, че в никакъв случай да не се хвърля изключение, т.е.
//всички изключения, които възникнат, да бъдат обработени.


public class Shop {

	private String name;
	private String address;
	private double money;
	private Map<TypeProduct,HashMap<String,Product>> products;
	
	public Shop(String name, String address){
		if(name != null && !name.isEmpty() && address!=null && !address.isEmpty()){
			this.name = name;
			this.address = address;
		}
		this.money = 0;
		this.products = new HashMap<TypeProduct, HashMap<String,Product>>();
		this.products.put(TypeProduct.COUNTABLE_PRODUCT, new HashMap<String, Product>());
		this.products.put(TypeProduct.KILOGRAM_PRODUCT, new HashMap<String, Product>());
		
		this.products.get(TypeProduct.COUNTABLE_PRODUCT).put("Cola", new CountableProduct("Cola",2.58,40));
		this.products.get(TypeProduct.COUNTABLE_PRODUCT).put("Soap", new CountableProduct("Soap",4.00,150));
		this.products.get(TypeProduct.COUNTABLE_PRODUCT).put("Sugar", new CountableProduct("Sugar",1.80,40));
		this.products.get(TypeProduct.COUNTABLE_PRODUCT).put("Jogurt", new CountableProduct("Jogurt",0.90,40));
		this.products.get(TypeProduct.COUNTABLE_PRODUCT).put("Chocolate", new CountableProduct("Chocolate",2.00,100));
		this.products.get(TypeProduct.COUNTABLE_PRODUCT).put("Wafer", new CountableProduct("Wafer",0.70,200));
		
		this.products.get(TypeProduct.KILOGRAM_PRODUCT).put("Banana", new KilogramProduct("Banana",3.80,60.0));
		this.products.get(TypeProduct.KILOGRAM_PRODUCT).put("Apple", new KilogramProduct("Apple",2.40,60.0));
		this.products.get(TypeProduct.KILOGRAM_PRODUCT).put("Cheese", new KilogramProduct("Cheese",7.20,100.0));
		this.products.get(TypeProduct.KILOGRAM_PRODUCT).put("Meat", new KilogramProduct("Meat",9.80,100.0));
		this.products.get(TypeProduct.KILOGRAM_PRODUCT).put("Ham", new KilogramProduct("Ham",3.80,60.0));
		this.products.get(TypeProduct.KILOGRAM_PRODUCT).put("Orange", new KilogramProduct("Orange",4.80,60.0));
		
	}
	
	public boolean giveProductToACustomer(Product product){
		return products.get(product.getType()).get(product.getName()).removeQuantity(product.getQuantity());
	}
	public boolean getReturnedProductFromACustomer(Product product){
		return this.products.get(product.getType()).get(product.getName()).addQuantity(product.getQuantity());
	}
	
	public double sellProductsToCustomer(HashMap<String,Product> shoppingCart, double total){
		double totalForPayment = 0;
		for (String type : shoppingCart.keySet()) {
			totalForPayment+=shoppingCart.get(type).getPrice();
		}
		if(totalForPayment == total){
			this.money+=totalForPayment;
			return 0;
		}
		return totalForPayment;
	}
	
	
	public void showAvailableProducts(){
		for (TypeProduct type : TypeProduct.values()) {
			System.out.println(type);
			for (String productName : this.products.get(type).keySet() ) {
				System.out.println(this.products.get(type).get(productName));	
			}	
		}
		System.out.println("MONEY-SHOP:"+this.money+"lv.");
		
		
	}
	
}
