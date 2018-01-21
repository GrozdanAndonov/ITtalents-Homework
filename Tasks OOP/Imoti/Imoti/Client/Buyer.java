package Imoti.Client;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import Imoti.Agency;
import Imoti.View;
import enums.TypeClient;

public class Buyer extends Client{

	private Set<View> views;
	
	public Buyer(String name, String telNum, Agency agency, double money) throws IllegalArgumentException {
		super(name, telNum, agency, money);
			this.type = TypeClient.BUYER;
		this.views = new HashSet<View>();
	}

	
	public void searchInAgency(){
		this.setAgent(this.agency.registerBuyerForSearchingProperty(this));
	}
		
	
	public void buyAProperty(){
		if(this.views.size()>0){
		View view = this.getRandomView();
		this.agency.buyProperty(this, view);
		}else{
			System.out.println("No views!");
		}
	}
	
	private View getRandomView(){
		Random r = new Random();
		int count = 0;
		int index = r.nextInt(this.views.size());
		for (View view : views) {
			if(count++==index){
				return view;
			}
		}
		return null;
	}
	
	public void  requestView(){
		this.agency.requestAView(this);
	}
	
	public boolean addView(View view){
		if(view!=null){
		this.views.add(view);
		return true;
		}
		return false;
	}
	
	public void showAllViews(){
		for (View view : views) {
			System.out.println(view.toString());
		}
	}
	
}
