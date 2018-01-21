package mainPackage;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;
import java.util.TreeSet;

import enums.TypeVehicleAndVignette;
import enums.TypeVignetteAccordingToValidityTerm;

public class GasStation {

	private double money;
	private TreeSet<Vignette> vignettes;
	
	public GasStation(double money) throws IllegalArgumentException{
		if(money>0){
			this.money = money;
		}else{
			throw new IllegalArgumentException();
		}
		
		this.vignettes = new TreeSet<>(new Comparator<Vignette>(){

			@Override
			public int compare(Vignette o1, Vignette o2) {
				if(o1.getPrice()-o2.getPrice()==0){
					return o1.getId()-o2.getId();
				}else{
					return (int)(o1.getPrice()-o2.getPrice());
				}
			}	
		});	
		Random r = new Random();
		
		for (int i = 0; i < 1000; i++) {
			int rand = r.nextInt(3);
			int rand2;
			if(rand == 0){
				rand2 = r.nextInt(3);
				if(rand2 == 0){
				this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.DAY, TypeVehicleAndVignette.CAR));
				}else if(rand2 == 1){
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.MONTHLY, TypeVehicleAndVignette.CAR));
				}else{
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.ANNUAL, TypeVehicleAndVignette.CAR));
				}
			}else if(rand == 1){
				 rand2 = r.nextInt(3);
				if(rand2 == 0){
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.DAY, TypeVehicleAndVignette.BUS));
				}else if(rand2 == 1){
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.MONTHLY, TypeVehicleAndVignette.BUS));
				}else{
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.ANNUAL, TypeVehicleAndVignette.BUS));
				}
			}else{
				 rand2 = r.nextInt(3);
				if(rand2 == 0){
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.DAY, TypeVehicleAndVignette.TRUCK));
				}else if(rand2 == 1){
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.MONTHLY, TypeVehicleAndVignette.TRUCK));
				}else{
					this.vignettes.add(new Vignette(new Date(), TypeVignetteAccordingToValidityTerm.ANNUAL, TypeVehicleAndVignette.TRUCK));
				}
			}
			
		}
	}
	
		public void showVignettes(){
			for (Vignette vignette : this.vignettes) {
				System.out.println(vignette);
			}
		}
	
		public void showMoney(){
			System.out.println(this.money);
		}
		
	Vignette buyVignette(TypeVehicleAndVignette typeV, TypeVignetteAccordingToValidityTerm type, Driver d){
		if(d != null){
			TypeVehicleAndVignette typeVignette = typeV;
			TypeVignetteAccordingToValidityTerm typeValidity = type;		
			for (Vignette vignette : this.vignettes) {
				if(vignette.getTypeOfTheCar() == typeVignette && typeValidity == vignette.getTypeValidityTerm()){
					if(d.payForVignette(vignette)){
					this.vignettes.remove(vignette);
					this.money += vignette.getPrice();
					vignette.setExpirationDate(new Date());
					return vignette;
					}
				}
			}
		}
		return null;
		
	}
	
	public int getQuantityOfVignettes(){
		return this.vignettes.size();
	}
	
	void addVignette(Vignette v)throws IllegalArgumentException{
		if(v != null){
			this.vignettes.add(v);
		}else{
			throw new IllegalArgumentException();
		}
	}
	
}
