package court;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import citizen.Accused;
import citizen.Accuser;
import citizen.Citizen;
import citizen.Witness;
import enums.CitizenType;
import enums.LegalEntityType;
import legalEntity.Judge;
import legalEntity.Juror;
import legalEntity.Lawyer;
import legalEntity.LegalEntity;
import legalEntity.Prosecutor;

public class Court {

	private String name;
	private String address;
	private HashSet<LegalEntity> jurists;
	private HashSet<Case> cases;
	private HashSet<Citizen> citizens;
	
	public Court(String name, String address)throws IllegalArgumentException{
		if(name!=null && !name.isEmpty() && address!=null && !address.isEmpty()){
			this.name = name;
			this.address = address;
		}else{
			throw new IllegalArgumentException();
		}
		this.jurists = new HashSet<>();
		this.cases = new HashSet<>();
		this.citizens = new HashSet<>();
	}
	
	public void createCase(boolean civilCase){
		Case case1 = null;
		if(civilCase){
			case1 = this.getRandomCivilCase();	
		case1.addWitnesses(this.getRandomWitnesses());
		case1.addJurorsInTheCase(this.getRandomJurors(true));
		}else{
			case1 = this.getRandomCriminalCase();	
			case1.addWitnesses(this.getRandomWitnesses());
			case1.addJurorsInTheCase(this.getRandomJurors(false));
		}
		this.cases.add(case1);
	}
	private HashSet<Juror> getRandomJurors(boolean civilCase){
		int numJurors = 0;
		if(civilCase){
			numJurors = 3;
		}else{
			numJurors = 13;
		}
		int count = 1;
		int rand =  1 + (int)(Math.random()* 13);
		HashSet<Juror> jurors = new HashSet<>();
		for (int i = 0; i < numJurors; i++) {
			rand = 1 + (int)(Math.random()* 13);
		for (LegalEntity entity : this.jurists) {
			if(entity.getType() == LegalEntityType.JUROR){			
				if(count++ == rand){
					jurors.add((Juror) entity);
					count=1;
					break;
				}
				}	
			}
		if(i==numJurors-1 && jurors.size()!=numJurors){
			i=0;
		}else{
			if(jurors.size()==numJurors){
				break;
			}
		}
		}
		return jurors;
	}
	
	
	private CriminalCase getRandomCriminalCase(){
		Judge judge = null;
		Accused accused = null;
		Prosecutor accuser = null; 
		Random r = new Random();
		int rand = 1 + (int)(Math.random()* 3);
		int rand2 =1 + (int)(Math.random()* 2);
		int count = 1;
		int count2 = 1;
		for (LegalEntity entity : this.jurists) {
			if(entity.getType() == LegalEntityType.JUDGE){
				if(count++ == rand){
					judge = (Judge) entity;
				}
			}else{
				if(entity.getType() == LegalEntityType.PROSECUTOR){
					if(count2++ == rand2){
						accuser =(Prosecutor) entity;
					}
				}
			}
		}
		rand = 1 + (int)(Math.random()* 5);;
		count = 1;
		for (Citizen citizen : this.citizens) {
			if(citizen.getType() == CitizenType.ACCUSED){
				if(count++ == rand){
					accused = (Accused) citizen;
				}
			}
		}
		accused.setLawyers(this.addRandomLawyers());
		return new CriminalCase(judge,accused,accuser);
	}
	
	private HashSet<Lawyer> addRandomLawyers(){
		int numLawyers = 1 + (int)(Math.random()* 5);
		int count = 1;
		int rand ;
		HashSet<Lawyer> lawyers = new HashSet<>();
		for (int i = 0; i < numLawyers; i++) {
			rand = 1 + (int)(Math.random() * 5);
		for (LegalEntity jurist : this.jurists) {
			if(jurist.getType() == LegalEntityType.LAWYER){			
				if(count++ == rand){
					lawyers.add((Lawyer) jurist);
					count=1;
					break;
				}
				}	
			}
		}
		return lawyers;		
	}
	
	private HashSet<Witness> getRandomWitnesses(){
		int numWitnesses = 1 + (int)(Math.random()* 10);
		int count = 1;
		int rand =  1 + (int)(Math.random()* 10);
		HashSet<Witness> witnesses = new HashSet<>();
		for (int i = 0; i < numWitnesses; i++) {
			rand = 1 + (int)(Math.random()* 10);
		for (Citizen citizen : this.citizens) {
			if(citizen.getType() == CitizenType.WITNESS){			
				if(count++ == rand){
					witnesses.add((Witness) citizen);
					count=1;
					break;
				}
				}	
			}
		}
		return witnesses;	
	}
	
	
	public void showCases(){	
		for (Case case1 : this.cases) {
			System.out.println(case1);
		}		
	}
	
	private CivilCase getRandomCivilCase(){
		Judge judge = null;
		Accused accused = null;
		Accuser accuser = null; 
		int rand = 1 + (int)(Math.random()* 3);
		int count = 1;
		for (LegalEntity entity : this.jurists) {
			if(entity.getType() == LegalEntityType.JUDGE){
				if(count++ == rand){
					judge = (Judge) entity;
					break;
				}
			}	
		}
		rand = 1 + (int)(Math.random() * 5);
		count = 1;
		int rand2 = 1 + (int)(Math.random() * 5);
		int count2 = 1;
		for (Citizen citizen : this.citizens) {
			if(citizen.getType() == CitizenType.ACCUSED){
				if(count++ == rand){
					accused = (Accused) citizen;
				}
			}else{
			if(citizen.getType() == CitizenType.ACCUSER){
				if(count2++ == rand2){
					accuser = (Accuser) citizen;
					}
				}
			}
		}
		accused.setLawyers(this.addRandomLawyers());
		accuser.setLawyers(this.addRandomLawyers());
		return new CivilCase(judge,accused,accuser);
	}
	
	public void addLegalEntity(LegalEntity legEn) throws IllegalArgumentException{
		if(legEn!=null){
			this.jurists.add(legEn);
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public void addCitizen(Citizen citizen){
		if(citizen!=null){
			this.citizens.add(citizen);
		}
	}
	
	public void runCases(){
		for (Case case1 : cases) {
			case1.conductTheCase();
		}
	}
	
	public void showAllLegalEntities(){
		for (LegalEntity entity : this.jurists) {
			System.out.println(entity);
		}	
	}
	
	public void showInfoForJurists(){
		TreeSet<LegalEntity> jurists = new TreeSet<>(new Comparator<LegalEntity>(){
			@Override
			public int compare(LegalEntity o1, LegalEntity o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		jurists.addAll(this.jurists);
		
		for (LegalEntity legalEntity : jurists) {
			System.out.println(legalEntity);
		}
		
	}
}
