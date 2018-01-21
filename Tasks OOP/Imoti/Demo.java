import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

import Imoti.Agency;
import Imoti.Agent;
import Imoti.Client.Buyer;
import Imoti.Client.Client;
import Imoti.Client.Seller;
import Property.Apartment;
import Property.House;
import Property.Plot;

public class Demo {

//	Реализирайте структура от класове, която да представлява работата на агенция за недвижими
//	имоти в София.
//	Агенцията съдържа следните характеристики:
//	• наименование;
//	• адрес;
//	• телефон за контакти;
//	В агенцията работят агенти, които отговарят за продажбата на имоти.
//	Всеки агент съдържа:
//	• име;
//	• телефонен номер;
//	• списък с неповтарящи се клиенти, които продават имот (продавачи);
//	• списък с неповтарящи се клиенти, които търсят имот (купувачи);
//	• списък с огледи, които купувачи са направили към имоти.
//	Всеки оглед има следните характеристики:
//	• имот;
//	• агент;
//	• купувач;
//	• дата на провеждане на огледа.
//	Всеки клиент има следните характеристики:
//	• име;
//	• телефонен номер;
//	Клиентите биват продавачи и купувачи.
//	Продавачите имат имот, който искат да продадат.
//	Купувачите имат бюджет, с който разполагат за покупка на имот, както и списък с огледи,
//	които са направили.
//	Агенцията разполага с каталог с обяви, който съдържа всички имоти, регистрирани в нея.
//	Всеки имот съдържа следните характеристики:
//	• описание;
//	• адрес;
//	• цена на имота;
//	• тип на имота (описани по-долу);
//	• площ (кв.м.);
//	• агент, който отговаря и разпространява имота.
//	Имотите биват:
//	1. апартаменти (студио, гарсониера, двустаен, тристаен, мезонет);
//	2. къщи (етаж от къща, цяла къща);
//	3. парцели (нива, поляна, гора).
//	Апартаментите и къщите разполагат с информация за вид строителство: ЕПК, Тухла, Панел
//	или Кирпич.
//	Къщите разполагат допълнително с брой паркоместа и площ на двора.
//	За парцелите има информация дали са в регулация или не.
//	Имотите са категоризирани по вид (апартаменти, къщи, парцели), като за всяка категория
//	подредбата е по цена в низходящ ред.
//	Всеки клиент може да изпълнява следните действия:
//	• Ако е продавач – да регистрира имота си за продажба в агенцията. В такъв случай от
//	агенцията му се причислява агент на произволен принцип. Имотът влиза в каталога на
//	агенцията, а клиента – в списъка с продавачи на агента.
//	• Ако е купувач – да регистрира запитване за търсене на имот към агенцията. В такъв
//	случай от агенцията му се причислява агент на произволен принцип. Клиентът се
//	регистрира в списъка с купувачи на агента.
//	• Ако е купувач – да заяви оглед на определен имот от каталога с имоти. Огледът може
//	да се осъществи само ако цената на имота е под бюджета на купувача. При
//	осъществяване на оглед, той влиза в списъка с огледи на купувача, както и на агента.
//	• Ако е купувач – да заяви покупка на имот. Покупката може да бъде само на имот, на
//	който купувачът е ходил на оглед. При покупка купувачът дължи 3% от цената ха
//	имота на агенцията. Агенцията дава половината от комисионната на агента, а
//	останалата половина влиза в нейния бюджет. Продавачът на имота също дължи 3%
//	комисионна на агенцията, като и от тази комисионна половината остава за агента под
//	формата на хонорар.
//	Да се реализира демо, в което:
//	1. Да се създаде агенция „Таланти Естейтс“ с пет агента с произволни имена.
//	2. Да се създадат 30 продавача на имоти. За всеки продавач да се създаде имот на
//	произволен принцип – 33% шанс да е апартамент, 33% шанс да е къща и 33% шанс за
//	парцел. Останалите характеристики също да са на произволен принцип. Цените на
//	имотите да варират – за къщите между 50 000 и 80 000 евро, за апартаментите – между
//	70 000 и 150 000 евро; за парцелите – между 30 000 и 85 000 евро.
//	3. Всички продавачи да регистрират имотите си за продажба в агенцията;
//	4. Да се създадат 10 купувача на произволен принцип с бюджети между 30 000 и 150 000
//	евро;
//	5. Всички купувачи да регистрират заявки за търсене на имот към агенцията;
//	6. Всеки купувач да заяви 3 огледа на произволни имоти от агенцията;
//	7. Всеки купувач да заявки покупка на някой от огледаните от него имоти на произволен
//	принцип;
//	8. Да се изпише на екрана паричния баланс на агенцията след продажбата на имотите;
//	9. Да се изпише на екрана паричния баланс на всеки агент от агенцията след продажбата
//	на имотите, като агентите са сортирани от най-богатия към този с най-малко печалби.
	
	public static void main(String[] args) {
		
		
		
		Agency agency = new Agency("TalantiEsteits","GoceDelche4","129348141",20_000);
		
		agency.addAgent(new Agent("Gosho","21341"));
		agency.addAgent(new Agent("Pesho","12431"));
		agency.addAgent(new Agent("Tosho","21341"));
		agency.addAgent(new Agent("Konsho","12431"));
		agency.addAgent(new Agent("Grisho","21341"));

		//creating sellers with their properties
		
		LinkedList<Seller> sellers = new LinkedList<>();
		
		sellers.add(new Seller("Bancho", "1241513", new Apartment("Apartament1", "Sandaski1", 70000, 65, enums.Apartment.TWO_BEDROOM, enums.TypeOfConstruction.BRICK), agency, 1500)); 
		sellers.add(new Seller("Kircho", "1241513", new Apartment("Apartament2", "Sandaski2", 75000, 65, enums.Apartment.TWO_BEDROOM, enums.TypeOfConstruction.BRICK), agency, 2500)); 
		sellers.add(new Seller("Jivko", "124112341513", new Apartment("Apartament3", "Sandaski3", 100000, 65, enums.Apartment.TWO_BEDROOM, enums.TypeOfConstruction.BRICK), agency, 3500)); 
		sellers.add(new Seller("Iliqncho", "1241513113", new Apartment("Apartament4", "Sandaski4", 120000, 65, enums.Apartment.TWO_BEDROOM, enums.TypeOfConstruction.BRICK), agency, 4500)); 
		sellers.add(new Seller("Spascho", "12415131", new House("House1", "Sandaski5", 50000, 65, enums.House.FLOOR_OF_HOUSE,124, enums.TypeOfConstruction.EPK), agency, 5500)); 
		sellers.add(new Seller("Gancho", "12411415513", new House("House2", "Sandaski6", 55000, 65, enums.House.FLOOR_OF_HOUSE,12, enums.TypeOfConstruction.BRICK), agency, 6500)); 
		sellers.add(new Seller("Bakurcho", "1241563513", new House("House3", "Sandaski7", 80000, 65, enums.House.WHOLE_HOUSE, 83,enums.TypeOfConstruction.BRICK), agency, 7500)); 
		sellers.add(new Seller("Trancho", "1241515733", new Plot("Plot1", "Sandaski8", 34000, 65, enums.Plot.FIELD,true), agency, 8500)); 
		sellers.add(new Seller("Peshinko", "1241514623", new Plot("Plot1", "Sandaski9", 50000, 65, enums.Plot.FOREST,true), agency, 9500)); 
		sellers.add(new Seller("Trahuncho", "124151473", new Plot("Plot1", "Sandaski10", 76000, 65, enums.Plot.MEADOW,true), agency, 10500)); 
		
		//sellers are registering their properties in the agency
		
		for (Seller seller : sellers) {
			seller.registerProperty();
			
		}
		
		LinkedList<Buyer> buyers = new LinkedList<>();
		
		buyers.add(new Buyer("Buyer1","124151",agency,80000));
		buyers.add(new Buyer("Buyer2","124`235",agency,30000));
		buyers.add(new Buyer("Buyer3","123214122",agency,35000));
		buyers.add(new Buyer("Buyer4","23523432",agency,50000));
		buyers.add(new Buyer("Buyer5","124256",agency,60000));
		buyers.add(new Buyer("Buyer6","34131354",agency,70000));
		buyers.add(new Buyer("Buyer7","134516",agency,80000));
		buyers.add(new Buyer("Buyer8","1345316",agency,90000));
		buyers.add(new Buyer("Buyer9","1346136",agency,100000));
		buyers.add(new Buyer("Buyer10","134613",agency,110000));
		//agency.showInfoForAgency();
		for (Buyer buyer : buyers) {
			buyer.searchInAgency();
		}
		
		for (Buyer buyer : buyers) {
			buyer.requestView();
			buyer.requestView();
			buyer.requestView();
		}
		
		for (Buyer buyer : buyers) {
			buyer.buyAProperty();
		}
		System.out.println("---------------------------------");
		
		agency.showInfoForAgency();
		
	
		

		
	}
	
	
	
}
