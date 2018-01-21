package Imoti;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

import Imoti.Client.Buyer;
import Imoti.Client.Client;
import Imoti.Client.Seller;
import Property.Property;
import enums.TypeOfProperty;

public class Agency {

	private String name;
	private String address;
	private String telNum;
	private double money;
	private Set<Agent> agents;
	private Map<TypeOfProperty,TreeSet<Property>> properties;
	
	public Agency(String name, String address, String telNum, double money) throws IllegalArgumentException{
		if(name!=null && !name.isEmpty() && address!=null && !address.isEmpty() && telNum!=null && money>0){
			this.name = name;
			this.address = address;
			this.telNum = telNum;
			this.money = money;
		}else{
			throw new IllegalArgumentException();
		}
		this.agents = new HashSet<Agent>();
		this.properties = new HashMap<>();
		this.properties.put(TypeOfProperty.APARTMENT, new TreeSet<Property>());
		this.properties.put(TypeOfProperty.HOUSE, new TreeSet<Property>());
		this.properties.put(TypeOfProperty.PLOT, new TreeSet<Property>());
	}
	
	
	public Agent registerProperty(Property property, Client client){
		if(property!=null && client != null){
			Agent agent = getRandomAgent();
			property.setAgent(agent);
			this.properties.get(property.getTypeProperty()).add(property);		
			agent.addClient(client);
			return agent;
		}
		return null;	
	}
	
	public void addAgent(Agent a){
		if(a!=null){
			this.agents.add(a);
		}
	}
	
	public void showPropertiesForSell(){
		for (TypeOfProperty type: this.properties.keySet() ) {
			for (Property prop : this.properties.get(type)) {
				System.out.println(prop.toString());
			}
			
		}
	}
	
	
	public  void showAgents(){
		TreeSet<Agent> agents = new TreeSet<Agent>();
		agents.addAll(this.agents);
		
		for (Agent agent : agents) {
			System.out.println(agent.toString());
		}
	}
	
	public void showInfoForAgency(){
		System.out.println(this.name);
		System.out.println(this.money);
		this.showAgents();
		this.showPropertiesForSell();
	}
	
	public Agent registerBuyerForSearchingProperty(Client client){
		Agent agent = this.getRandomAgent();
		agent.addClient(client);
		return agent;
	}

	
	private Property getRandomProperty(){
		Random r = new Random();
		int counter = 0;
		int counter2 = 0;
		int index = r.nextInt(this.properties.size());
		for (TypeOfProperty prop : this.properties.keySet()) {
			if(counter++==index){
				int index2 = r.nextInt(this.properties.get(prop).size());
				for (Property property:this.properties.get(prop)) {
					if(counter2++==index2){
						return property;
					}
				}
			}
		}
		return null;
	}

	private Agent getRandomAgent(){
		Random r = new Random();
		int counter = 0;
		int index = r.nextInt(this.agents.size());
		for (Agent agent : agents) {
			if(counter++==index){
				return agent;
			}
		}
		
		return null;
	}

	public void requestAView(Buyer buyer){
		Property p = this.getRandomProperty();	
		if(buyer.getMoney()>=p.getPrice()){
			Agent a = buyer.getAgent();
			View view = new View(p,a,buyer,new Date(), p.getSeller());
			buyer.getAgent().addView(view);
			buyer.addView(view);
		}
		
	}
	
	public void buyProperty(Buyer buyer, View view){
		Property p = view.getProperty();
		Agent a = view.getAgent();
		double price = p.getPrice();
		double moneyForAgency = price*0.03;
		a.getMoneyFromAProperty(moneyForAgency);
		this.money += moneyForAgency;
		buyer.setMoney(buyer.getMoney()-price-(0.03*price));
		Seller s = p.getSeller();
		s.setMoney(s.getMoney()+price-(0.03*price));
		this.properties.get(view.getProperty().getTypeProperty()).remove(view.getProperty());
		
	}
}
