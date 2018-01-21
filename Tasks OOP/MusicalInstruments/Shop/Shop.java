package Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import MusicalInstrument.MusicalInstrument;
import MusicalInstrument.Blown.Clarinet;
import MusicalInstrument.Blown.Flute;
import MusicalInstrument.Blown.Trombon;
import MusicalInstrument.Blown.Trompet;
import MusicalInstrument.Blown.Tube;
import MusicalInstrument.Percussion.BigDrum;
import MusicalInstrument.Percussion.Dayereh;
import MusicalInstrument.Percussion.Drum;
import MusicalInstrument.Percussion.GobletDrum;
import MusicalInstrument.electric.BassGuitar;
import MusicalInstrument.electric.ElectricViolin;
import MusicalInstrument.electric.Synthesizer;
import MusicalInstrument.stringed.Contrabass;
import MusicalInstrument.stringed.Gadulka;
import MusicalInstrument.stringed.Guitar;
import MusicalInstrument.stringed.Harp;
import MusicalInstrument.stringed.Viola;
import MusicalInstrument.stringed.Violin;
import enums.TypeInstrument;

//Реализирайте структура от класове, която да представлява работата на агенция за недвижими
//имоти в София.
//Агенцията съдържа следните характеристики:
//• наименование;
//• адрес;
//• телефон за контакти;
//В агенцията работят агенти, които отговарят за продажбата на имоти.
//Всеки агент съдържа:
//• име;
//• телефонен номер;
//• списък с неповтарящи се клиенти, които продават имот (продавачи);
//• списък с неповтарящи се клиенти, които търсят имот (купувачи);
//• списък с огледи, които купувачи са направили към имоти.
//Всеки оглед има следните характеристики:
//• имот;
//• агент;
//• купувач;
//• дата на провеждане на огледа.
//Всеки клиент има следните характеристики:
//• име;
//• телефонен номер;
//Клиентите биват продавачи и купувачи.
//Продавачите имат имот, който искат да продадат.
//Купувачите имат бюджет, с който разполагат за покупка на имот, както и списък с огледи,
//които са направили.
//Агенцията разполага с каталог с обяви, който съдържа всички имоти, регистрирани в нея.
//Всеки имот съдържа следните характеристики:
//• описание;
//• адрес;
//• цена на имота;
//• тип на имота (описани по-долу);
//• площ (кв.м.);
//• агент, който отговаря и разпространява имота.
//Имотите биват:
//1. апартаменти (студио, гарсониера, двустаен, тристаен, мезонет);
//2. къщи (етаж от къща, цяла къща);
//3. парцели (нива, поляна, гора).
//Апартаментите и къщите разполагат с информация за вид строителство: ЕПК, Тухла, Панел
//или Кирпич.
//Къщите разполагат допълнително с брой паркоместа и площ на двора.
//За парцелите има информация дали са в регулация или не.
//Имотите са категоризирани по вид (апартаменти, къщи, парцели), като за всяка категория
//подредбата е по цена в низходящ ред.
//Всеки клиент може да изпълнява следните действия:
//• Ако е продавач – да регистрира имота си за продажба в агенцията. В такъв случай от
//агенцията му се причислява агент на произволен принцип. Имотът влиза в каталога на
//агенцията, а клиента – в списъка с продавачи на агента.
//• Ако е купувач – да регистрира запитване за търсене на имот към агенцията. В такъв
//случай от агенцията му се причислява агент на произволен принцип. Клиентът се
//регистрира в списъка с купувачи на агента.
//• Ако е купувач – да заяви оглед на определен имот от каталога с имоти. Огледът може
//да се осъществи само ако цената на имота е под бюджета на купувача. При
//осъществяване на оглед, той влиза в списъка с огледи на купувача, както и на агента.
//• Ако е купувач – да заяви покупка на имот. Покупката може да бъде само на имот, на
//който купувачът е ходил на оглед. При покупка купувачът дължи 3% от цената ха
//имота на агенцията. Агенцията дава половината от комисионната на агента, а
//останалата половина влиза в нейния бюджет. Продавачът на имота също дължи 3%
//комисионна на агенцията, като и от тази комисионна половината остава за агента под
//формата на хонорар.
//Да се реализира демо, в което:
//1. Да се създаде агенция „Таланти Естейтс“ с пет агента с произволни имена.
//2. Да се създадат 30 продавача на имоти. За всеки продавач да се създаде имот на
//произволен принцип – 33% шанс да е апартамент, 33% шанс да е къща и 33% шанс за
//парцел. Останалите характеристики също да са на произволен принцип. Цените на
//имотите да варират – за къщите между 50 000 и 80 000 евро, за апартаментите – между
//70 000 и 150 000 евро; за парцелите – между 30 000 и 85 000 евро.
//3. Всички продавачи да регистрират имотите си за продажба в агенцията;
//4. Да се създадат 10 купувача на произволен принцип с бюджети между 30 000 и 150 000
//евро;
//5. Всички купувачи да регистрират заявки за търсене на имот към агенцията;
//6. Всеки купувач да заяви 3 огледа на произволни имоти от агенцията;
//7. Всеки купувач да заявки покупка на някой от огледаните от него имоти на произволен
//принцип;
//8. Да се изпише на екрана паричния баланс на агенцията след продажбата на имотите;
//9. Да се изпише на екрана паричния баланс на всеки агент от агенцията след продажбата
//на имотите, като агентите са сортирани от най-богатия към този с най-малко печалби.

public class Shop {

	
	private String name;
	private double money;
	private Map<TypeInstrument,HashMap<String,MusicalInstrument>> instruments;
	private Map<TypeInstrument,HashMap<String,Integer>> numSoldInstruments;
	private Map<TypeInstrument,HashMap<String,Double>> totalPriceSoldInstruments;
	
 	public Shop(String name) throws IllegalArgumentException{
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}else{
			throw new IllegalArgumentException();
		}
		
		this.numSoldInstruments = new HashMap<>();
		this.numSoldInstruments.put(TypeInstrument.STRINGED, new HashMap<String, Integer>());
		this.numSoldInstruments.put(TypeInstrument.PERCUSSION, new HashMap<String, Integer>());
		this.numSoldInstruments.put(TypeInstrument.KEYBOARD, new HashMap<String, Integer>());
		this.numSoldInstruments.put(TypeInstrument.ELECTRIC, new HashMap<String, Integer>());
		this.numSoldInstruments.put(TypeInstrument.BLOWN, new HashMap<String, Integer>());
	
		this.totalPriceSoldInstruments = new HashMap<>();
		this.totalPriceSoldInstruments.put(TypeInstrument.STRINGED, new HashMap<String, Double>());
		this.totalPriceSoldInstruments.put(TypeInstrument.PERCUSSION, new HashMap<String, Double>());
		this.totalPriceSoldInstruments.put(TypeInstrument.KEYBOARD, new HashMap<String, Double>());
		this.totalPriceSoldInstruments.put(TypeInstrument.ELECTRIC, new HashMap<String, Double>());
		this.totalPriceSoldInstruments.put(TypeInstrument.BLOWN, new HashMap<String, Double>());
		
		
		this.money = 0;
		this.instruments = new HashMap<TypeInstrument,HashMap<String,MusicalInstrument>>();
		this.instruments.put(TypeInstrument.STRINGED, new HashMap<String,MusicalInstrument>());
		this.instruments.put(TypeInstrument.PERCUSSION, new HashMap<String,MusicalInstrument>());
		this.instruments.put(TypeInstrument.BLOWN, new HashMap<String,MusicalInstrument>());
		this.instruments.put(TypeInstrument.KEYBOARD, new HashMap<String,MusicalInstrument>());
		this.instruments.put(TypeInstrument.ELECTRIC,new HashMap<String,MusicalInstrument>());
		
		String var = "FleitaModel";
		this.instruments.get(TypeInstrument.BLOWN).put(var, new Flute(var, 45,10));
		this.numSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0d);
		var = "KlarinetModel";
		this.instruments.get(TypeInstrument.BLOWN).put(var, new Clarinet(var, 230, 10));
		this.numSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0d);
		var = "TrombonModel";
		this.instruments.get(TypeInstrument.BLOWN).put(var, new Trombon(var, 420, 10));
		this.numSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0d);
		var = "TrompetModel";
		this.instruments.get(TypeInstrument.BLOWN).put(var, new Trompet(var, 200, 10));
		this.numSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0d);
		var = "TubaModel";
		this.instruments.get(TypeInstrument.BLOWN).put(var, new Tube(var, 150, 10));
		this.numSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.BLOWN).put(var, 0d);
		var = "BasKitaraModel";
		this.instruments.get(TypeInstrument.ELECTRIC).put(var, new BassGuitar(var, 70, 10));
		this.numSoldInstruments.get(TypeInstrument.ELECTRIC).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.ELECTRIC).put(var, 0d);
		var = "ElektricheskaCigulkaModel";
		this.instruments.get(TypeInstrument.ELECTRIC).put(var, new ElectricViolin(var, 170, 10));
		this.numSoldInstruments.get(TypeInstrument.ELECTRIC).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.ELECTRIC).put(var, 0d);
		var = "SintezatorModel";
		this.instruments.get(TypeInstrument.ELECTRIC).put(var, new Synthesizer(var, 300, 10));
		this.numSoldInstruments.get(TypeInstrument.ELECTRIC).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.ELECTRIC).put(var, 0d);
		var = "ArfaModel";
		this.instruments.get(TypeInstrument.STRINGED).put(var, new Harp(var, 459, 10));
		this.numSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0d);
		var = "CigulkaModel";
		this.instruments.get(TypeInstrument.STRINGED).put(var, new Violin(var, 263, 10));
		this.numSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0d);
		var = "GadulkaModel";
		this.instruments.get(TypeInstrument.STRINGED).put(var, new Gadulka(var, 352, 10));
		this.numSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0d);
		var = "KitaraModel";
		this.instruments.get(TypeInstrument.STRINGED).put(var, new Guitar(var, 872, 10));
		this.numSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0d);
		var = "KontrabasModel";
		this.instruments.get(TypeInstrument.STRINGED).put(var, new Contrabass(var, 124, 10));
		this.numSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0d);
		var = "ViolaModel";
		this.instruments.get(TypeInstrument.STRINGED).put(var, new Viola(var, 521, 10));
		this.numSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.STRINGED).put(var, 0d);
		
		
		var = "BarabanModel";
		this.instruments.get(TypeInstrument.PERCUSSION).put(var, new Drum(var, 30, 10));
		this.numSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0d);
		var = "TarambukaModel";
		this.instruments.get(TypeInstrument.PERCUSSION).put(var, new GobletDrum(var, 30, 10));
		this.numSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0d);
		var = "TupanModel";
		this.instruments.get(TypeInstrument.PERCUSSION).put(var, new BigDrum(var, 30, 10));
		this.numSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0d);
		var = "DaireModel";
		this.instruments.get(TypeInstrument.PERCUSSION).put(var, new Dayereh(var, 30, 10));
		this.numSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0);
		this.totalPriceSoldInstruments.get(TypeInstrument.PERCUSSION).put(var, 0d);
		
		
	}
		
	public void sellMusicalInstrument(String name, int quantity){
		if(name!=null && !name.isEmpty() && quantity > 0){
			for (TypeInstrument type : TypeInstrument.values()) {
				if(this.instruments.get(type).containsKey(name)){
					if(this.instruments.get(type).get(name).getQuantity()>=quantity){
						MusicalInstrument instrument = this.instruments.get(type).get(name);
						double totalPrice= instrument.getPrice()*quantity;
						this.money += totalPrice;
						instrument.removeQuantity(quantity);
						addInSoldInstruments(name, quantity,type);
						addInTotalPriceSoldInstruments(name, money, type);
						return;
					}else{
						System.out.println("Not enough quantity for sale!");
					}
				}
			}
			System.out.println("MUSICAL INSTRUMENT NOT FOUND FOR SALE!");
		}else{
			System.out.println("Invalid arguments!");
		}
	}
	
	private void addInSoldInstruments(String name, int quantity, TypeInstrument type){
		if(name!=null && !name.isEmpty() && quantity>0){
				if(this.numSoldInstruments.get(type).containsKey(name)){
					Integer num = this.numSoldInstruments.get(type).get(name); 
					this.numSoldInstruments.get(type).put(name, num+=quantity);
				}else{
					this.numSoldInstruments.get(type).put(name, quantity);
				}
		}else{
			System.out.println("Invalid arguments!");
		}
	}
	
	private void addInTotalPriceSoldInstruments(String name, double totalPrice, TypeInstrument type){
		if(name != null && !name.isEmpty() && totalPrice > 0){
			if(this.totalPriceSoldInstruments.get(type).containsKey(name)){
				Double price = this.totalPriceSoldInstruments.get(type).get(name);
				this.totalPriceSoldInstruments.get(type).put(name, price+totalPrice);
			}else{
				this.totalPriceSoldInstruments.get(type).put(name, totalPrice);
			}
		}
	}
	
	public void getNewInstruments(String name, int quantity){
		if(name!=null && !name.isEmpty() && quantity>0){
				for (TypeInstrument type : TypeInstrument.values()) {
					if(this.instruments.get(type).containsKey(name)){
						this.instruments.get(type).get(name).addQuantity(quantity);
						System.out.println(name+" added "+quantity+" to the store!");
						return;
					}
				}
				System.out.println("No such instrument in the store!");
		}else{
			System.out.println("Illegal arguments!");
		}	
	}
	
	public void listSortedAlphabeticaly(){
		TreeSet<MusicalInstrument> instruments = new TreeSet<>(new Comparator<MusicalInstrument>(){
			@Override
			public int compare(MusicalInstrument obj1, MusicalInstrument obj2) {		
				return obj1.getName().compareTo(obj2.getName());
			}
		});
		
		for (TypeInstrument type : TypeInstrument.values()) {
			instruments.addAll(this.instruments.get(type).values());
		}
		
		for (MusicalInstrument musicalInstrument : instruments) {
			System.out.println(musicalInstrument);
		}
		
		
	}
	
	public void listByKind(){
		
		for (TypeInstrument type : TypeInstrument.values()) {
			System.out.println("-------"+type+"--------");
			for (MusicalInstrument instrument : this.instruments.get(type).values()) {
				System.out.println(instrument);
			}
		}
	}
	
	public void listInAscendingDescendingOrder(boolean isAscending){
		TreeSet<MusicalInstrument> instruments ;
		if(isAscending){
			instruments = new TreeSet<>(new Comparator<MusicalInstrument>(){

				@Override
				public int compare(MusicalInstrument obj1, MusicalInstrument obj2) {
					if(obj1.getPrice()-obj2.getPrice()==0){
						return 1;
					}else{
						return(int) (obj1.getPrice() - obj2.getPrice());
					}
				}
			});
		for (TypeInstrument type : TypeInstrument.values()) {	
				instruments.addAll(this.instruments.get(type).values());
			}
		}else{
			instruments = new TreeSet<>(new Comparator<MusicalInstrument>(){

				@Override
				public int compare(MusicalInstrument obj1, MusicalInstrument obj2) {
					if(obj2.getPrice()-obj1.getPrice()==0){
						return 1;
					}else{
						return(int) (obj2.getPrice()-obj1.getPrice());
					}
				}
			});
		for (TypeInstrument type : TypeInstrument.values()) {	
				instruments.addAll(this.instruments.get(type).values());
			}
		}	
		System.out.println(instruments);
	}
	
	
	public HashSet<MusicalInstrument> listAllAvailableMusicalInstruments(){
		
		HashSet<MusicalInstrument> availableInstruments = new HashSet<>();
		
		for (TypeInstrument type : TypeInstrument.values()) {
			for (MusicalInstrument instrument : this.instruments.get(type).values()) {
				if(instrument.getQuantity()>0){
					availableInstruments.add(instrument);
				}
			}
		}
		
		for (MusicalInstrument instrument : availableInstruments) {
			System.out.println(instrument);
		}
		return availableInstruments;
	}
///////////////////SPRAVKI///////////////////
	public void listSelledInstruments(){
		
		TreeSet<Map.Entry<String,Integer>> instruments = new TreeSet<>(new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
					if(arg0.getValue()-arg1.getValue()==0){
						return 1;
					}else{
						return arg0.getValue() - arg1.getValue();
					}
			}
			
		});
		for(TypeInstrument type : TypeInstrument.values()){		
		for (Map.Entry<String, Integer> instrument : this.numSoldInstruments.get(type).entrySet()) {
			instruments.add(instrument);
		}
		}
		
		
		for (Entry<String, Integer> musicalInstrument : instruments) {
			System.out.println(musicalInstrument.getKey()+":"+musicalInstrument.getValue());
		}
		
	}
	
	public void listTotalSumSelledInstruments(){
		double totalSum=0;
		for (TypeInstrument type : TypeInstrument.values()) {
		for (String name : this.totalPriceSoldInstruments.get(type).keySet()) {
				totalSum+=this.totalPriceSoldInstruments.get(type).get(name);
		}
		}
		System.out.println(totalSum);
	}
	
	public void mostSolledInstrument(){
		this.modifiable(false);
	}
	
	
	private void modifiable(boolean ascending){
		
	ArrayList<Map.Entry<String, Integer>> instruments = new ArrayList<>();
		
		TreeSet<Map.Entry<String, Integer>> sortedInstruments = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>(){
			
			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				if(ascending){
					if(arg0.getValue()-arg1.getValue()==0){
						return 1;
					}else{
						return arg0.getValue() - arg1.getValue();
					}
				}else{
					if(arg0.getValue()-arg1.getValue()==0){
						return 1;
					}else{
						return arg1.getValue() - arg0.getValue() ;
					}
				}
			}
			
		});
		
		for (TypeInstrument type  : TypeInstrument.values()) {
			for (Map.Entry<String, Integer> entry : this.numSoldInstruments.get(type).entrySet()) {
				sortedInstruments.add(entry);
			}
		}
		for (Iterator<Entry<String,Integer>> iterator = sortedInstruments.iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			if(!instruments.isEmpty()){
				if(instruments.get(0).getValue()==entry.getValue()){
					instruments.add(entry);
				}else{
					break;
				}
			}else{
				instruments.add(entry);
			}
		}
		
		System.out.println(instruments);
		
		
		
		
	}
	
	public void mostUnsoledInstrument(){
		this.modifiable(true);
	}
	
	
	public void mostSolledByKind(){
	
		ArrayList<TypeInstrument> kinds = new ArrayList<>();
		TypeInstrument typeInstr = null;
		int maxQuantity = 0;
		for (TypeInstrument typeInstrument : TypeInstrument.values()) {
			int quantity = 0;
			for (String type : this.numSoldInstruments.get(typeInstrument).keySet()) {
				quantity+=this.numSoldInstruments.get(typeInstrument).get(type);
			}
			if(quantity > maxQuantity){
				maxQuantity = quantity;
				typeInstr = typeInstrument;
			}
		}
		
		
		
		for (TypeInstrument typeInstrument : TypeInstrument.values()) {
			if(kinds.get(0)==typeInstrument){
				continue;
			}
			int quantity = 0;
			for (String type : this.numSoldInstruments.get(typeInstrument).keySet()) {
				quantity+=this.numSoldInstruments.get(typeInstrument).get(type);
			}
			if(quantity==maxQuantity){
				kinds.add(typeInstrument);
			}
		}
		System.out.println(kinds);
		
	}
	
	
	public void mostIncomeTypeInstrument(){
	ArrayList<TypeInstrument> types = new ArrayList<>();	
	double maxIncomeFromType = 0;	
	TypeInstrument type = null;
		double income = 0;
	for (TypeInstrument typeInstrument : TypeInstrument.values()) {
		income = 0;
		for (String name : this.totalPriceSoldInstruments.get(typeInstrument).keySet()) {
			income+=this.totalPriceSoldInstruments.get(typeInstrument).get(name);
		}
		if(income>maxIncomeFromType){
			maxIncomeFromType = income;
			type = typeInstrument;
		}
	}
	types.add(type);
		
	for (TypeInstrument typeInstrument : TypeInstrument.values()) {
		if(typeInstrument == type){
			continue;
		}
		income = 0;
		for (String name : this.totalPriceSoldInstruments.get(typeInstrument).keySet()) {
			income+=this.totalPriceSoldInstruments.get(typeInstrument).get(name);
		}
		if(income == maxIncomeFromType){
			types.add(typeInstrument);
		}
	}
	
		System.out.println(types);
	}

	
}
