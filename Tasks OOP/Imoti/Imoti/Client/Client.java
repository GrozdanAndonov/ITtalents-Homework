package Imoti.Client;

import Imoti.Agency;
import Imoti.Agent;
import enums.TypeClient;

public abstract class Client {

	protected String name;
	protected String telNumber;
	protected Agency agency;
	protected TypeClient type;
	protected Agent agent;
	protected double money;
	Client(String name, String telNum, Agency agency, double money) throws IllegalArgumentException{
		if(name!=null && !name.isEmpty() && telNum!=null && !telNum.isEmpty() && agency != null && money>0){
			this.name = name;
			this.telNumber = telNum;
			this.agency = agency;
			this.money = money;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	protected void setAgent(Agent agent){
		if(agent!=null){
			this.agent = agent;
		}
	}
	
	public TypeClient getType() {
		return type;
	}
	public Agent getAgent() {
		return agent;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "CLIENT-"+ this.name;
	}
	
}
