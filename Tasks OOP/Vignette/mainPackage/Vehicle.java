package mainPackage;

import java.util.Date;

import enums.TypeVehicleAndVignette;

public class Vehicle {
	
	private static int idCar = 1;
	private int id;
	private String model;
	private TypeVehicleAndVignette typeVignetteAndVehicle;
	private Date dateOfManufacture;
	private Vignette vignette;
	
	public Vehicle(String model, TypeVehicleAndVignette typeVehicle, Date dateOfManufacture) throws IllegalArgumentException{
		if(model != null && !model.isEmpty() && dateOfManufacture != null){
			this.model = model;
			this.typeVignetteAndVehicle = typeVehicle;
			this.dateOfManufacture = dateOfManufacture;
			this.id = Vehicle.idCar++;
		}else{
			throw new IllegalArgumentException();
		}	
	}
	
	public int getId() {
		return id;
	}
	
	void stickAVignette(Vignette vignette){
		if(vignette != null && this.typeVignetteAndVehicle == vignette.getTypeOfTheCar()){
			this.vignette = vignette;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public TypeVehicleAndVignette getTypeVehicle() {
		return typeVignetteAndVehicle;
	}
	
	public Vignette getVignette() {
		return vignette;
	}
	
	@Override
	public String toString() {
		return this.id+":"+this.model+":"+this.typeVignetteAndVehicle+":"+this.vignette;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Vehicle other = (Vehicle) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
