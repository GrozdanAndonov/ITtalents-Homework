package mainPackage;

import java.util.Calendar;
import java.util.Date;

import enums.TypeVehicleAndVignette;
import enums.TypeVignetteAccordingToValidityTerm;


public class Vignette {
	
	private static int idVignette=0;
	private int id;
	private Date dateOfIssue;
	private String color;
	private TypeVehicleAndVignette typeOfTheCar;
	private TypeVignetteAccordingToValidityTerm typeValidityTerm;
	//private Vehicle vehicle;
	private Date expirationDate;
	private double price;
	private int timeForStickOnGlass;
	
	Vignette(Date date, TypeVignetteAccordingToValidityTerm typeValidityTerm, TypeVehicleAndVignette typeOfTheCar) throws IllegalArgumentException{
		if(date!=null){
			this.id = ++Vignette.idVignette;
			this.dateOfIssue = date;
			this.typeValidityTerm = typeValidityTerm;
			if(typeOfTheCar == TypeVehicleAndVignette.CAR){
				this.typeOfTheCar = typeOfTheCar;
				this.timeForStickOnGlass = 5;
				this.color = "COLOR:BLUE";
				if(typeValidityTerm == TypeVignetteAccordingToValidityTerm.DAY){
					this.price = 5;
				}else if(typeValidityTerm == TypeVignetteAccordingToValidityTerm.MONTHLY){
					this.price = 50;
				}else{
					this.price = 300;
				}
			}else if(typeOfTheCar == TypeVehicleAndVignette.BUS){
				this.timeForStickOnGlass = 20;
				this.typeOfTheCar = typeOfTheCar;
				this.color = "COLOR:YELLOW";
				if(typeValidityTerm == TypeVignetteAccordingToValidityTerm.DAY){
					this.price = 9;
				}else if(typeValidityTerm == TypeVignetteAccordingToValidityTerm.MONTHLY){
					this.price = 90;
				}else{
					this.price = 540;
				}
			}else{
				this.color = "COLOR:RED";
				this.typeOfTheCar = typeOfTheCar;
				this.timeForStickOnGlass = 10;
				if(typeValidityTerm == TypeVignetteAccordingToValidityTerm.DAY){
					this.price = 7;
				}else if(typeValidityTerm == TypeVignetteAccordingToValidityTerm.MONTHLY){
					this.price = 70;
				}else{
					this.price = 420;
				}
			}	
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public int getId(){
		return this.id;
	}
	
	public TypeVehicleAndVignette getTypeOfTheCar() {
		return typeOfTheCar;
	}
	
	public TypeVignetteAccordingToValidityTerm getTypeValidityTerm() {
		return typeValidityTerm;
	}
	
	public double getPrice() {
		return price;
	}
	

	public Date getExpirationDate() {
		return expirationDate;
	}
	
	void setExpirationDate(Date dateOfBuying){
		if(dateOfBuying != null){
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateOfBuying);
			if(this.typeValidityTerm == TypeVignetteAccordingToValidityTerm.DAY){
				cal.add(Calendar.DATE, 1);
				this.expirationDate = cal.getTime();
			}else if(this.typeValidityTerm == TypeVignetteAccordingToValidityTerm.MONTHLY){
				cal.add(Calendar.MONTH, 1);
				this.expirationDate = cal.getTime();
			}else if(this.typeValidityTerm == TypeVignetteAccordingToValidityTerm.ANNUAL){
				cal.set(Calendar.DATE, 1);
				cal.set(Calendar.MONTH, 0);
				cal.add(Calendar.YEAR, 1);
				this.expirationDate = cal.getTime();
			}	
		}
	}
	
	@Override
	public String toString() {
		return this.typeOfTheCar+":"+this.typeValidityTerm+":"+this.color+":Price:"+this.price+"lv.";
	}
	
	
//	public void setVehicle(Vehicle vehicle) throws IllegalArgumentException{
//		if(vehicle != null && vehicle.getTypeVehicle()==this.typeOfTheCar){
//		this.vehicle = vehicle;
//		}else{
//			throw new IllegalArgumentException();
//		}
//	}
	
//	int stickVignetteOnTheVehicle(Vehicle vehicle){
//		if(vehicle!=null && vehicle.getTypeVehicle() == this.typeOfTheCar){
//			this.vehicle.stickAVignette(this);
//			return this.timeForStickOnGlass;
//		}else{
//			
//			return 0;
//		}
//	}
	
	
}
