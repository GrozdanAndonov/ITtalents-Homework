package mainPackage;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import enums.TypeVignetteAccordingToValidityTerm;

public class Driver {
	
	private String name;
	private HashSet<Vehicle> vehicles;
	private double money;
	private GasStation gasStation;
	
	public Driver(String name, double money) throws IllegalArgumentException{
		if(name != null && !name.isEmpty() && money>0){
			this.name = name;
			this.money = money;
			this.vehicles = new HashSet<>();
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public void addVehicle(Vehicle vehicle) throws IllegalArgumentException{
		if(vehicle != null){
			this.vehicles.add(vehicle);
		}else{
			throw new IllegalArgumentException();
		}
	}

	
	public void setGasStation(GasStation gasStation)throws IllegalArgumentException{
		if(gasStation != null){
			this.gasStation = gasStation;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public void showMoney(){
		System.out.println(this.money);
	}
	
	public boolean payForVignette(Vignette v){
		if(v != null){
			if(this.money >= v.getPrice()){
				this.money -= v.getPrice();
				return true;
			}else{
				System.out.println("Not enough money to pay");
				return false;
			}
		}
		return false;
		
	}
	
	
	public void showVehicles(){
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle);
		}
	}
	
	public void buyVignette(int id, TypeVignetteAccordingToValidityTerm type){
		if(id>0){
			for (Vehicle vehicle : this.vehicles) {
				if(vehicle.getId() == id){
				Vignette v = this.gasStation.buyVignette(vehicle.getTypeVehicle(), type, this);
				if(v!=null){
					vehicle.stickAVignette(v);
				}else{
					System.out.println("No such vignette in stock:"+type);
				}
				}
			}
		}
		
	}
	private int checkQuantityOfVehiclesWithExpirationDate(Date date){
		int count=0;
		for (Vehicle vehicle : this.vehicles) {
			if(date.after(vehicle.getVignette().getExpirationDate())){
				count++;
			}
		}
		return count;
	}
	
	public void showInfo(Date date){
		System.out.println("Num of vehicles:"+this.vehicles.size());
		System.out.println("Expired vignettes:"+this.checkQuantityOfVehiclesWithExpirationDate(date));
		System.out.println(this.money);
	}
	
}
