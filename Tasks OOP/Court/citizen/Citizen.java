package citizen;

import enums.CitizenType;

public class Citizen {

	
	private String name;
	private String address;
	private int age;
	protected CitizenType type;
	
	public Citizen(String name, String address, int age){
		if(name!=null && !name.isEmpty() && address!=null && !address.isEmpty() && age > 18){
			this.name = name;
			this.address = address;
			this.age = age;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public String getName() {
		return name;
	}

	public CitizenType getType() {
		return type;
	}
	@Override
	public String toString() {
		return this.type+":"+this.name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Citizen other = (Citizen) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}
