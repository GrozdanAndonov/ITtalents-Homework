package Imoti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Imoti.Client.Client;
import enums.TypeClient;

public class Agent implements Comparable<Agent>{

	private String name;
	private String telNum;
	private double money;

	private Map<TypeClient, HashSet<Client>> clients;
	private Set<View> views;
	
	public Agent(String name, String telNum) throws IllegalArgumentException{
		if(name!=null && !name.isEmpty() && telNum!=null && !telNum.isEmpty()){
		this.name = name;
		this.telNum = telNum;
		}else{
			throw new IllegalArgumentException();
		}
		this.views = new HashSet<View>();
		this.clients = new HashMap<TypeClient,HashSet<Client>>();
		this.clients.put(TypeClient.BUYER, new HashSet<Client>());
		this.clients.put(TypeClient.SELLER, new HashSet<Client>());
		
	}
	
	boolean addView(View view){
		if(view!=null){
		this.views.add(view);
		return true;
		}
		return false;
	}
	
	void addClient(Client client){
		if(client!=null){
			if(!this.clients.get(client.getType()).add(client)){
				System.out.println("Client exist!");
			}
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((telNum == null) ? 0 : telNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (telNum == null) {
			if (other.telNum != null)
				return false;
		} else if (!telNum.equals(other.telNum))
			return false;
		return true;
	}

	public void getMoneyFromAProperty(double money){
		if(money>0){
		this.money += money;
		}
	}
	
	@Override
	public String toString() {
		return "AGENT-"+this.name+" - "+this.money;
	}
	public double getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Agent o) {
		if(this.getMoney() - o.getMoney()==0){
			return -1;
		}else{
			return (int) (this.getMoney()-o.getMoney());
		}
	}
	
	
}
