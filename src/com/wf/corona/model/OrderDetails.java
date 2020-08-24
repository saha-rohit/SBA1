package com.wf.corona.model;

import java.util.List;

public class OrderDetails {
	private CoronaKits coronaKit;
	private List<KitDetails> kitDetails;
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderDetails(CoronaKits coronaKit, List<KitDetails> kitDetails) {
		
		this.coronaKit = coronaKit;
		this.kitDetails = kitDetails;
	}
	public CoronaKits getCoronaKit() {
		return coronaKit;
	}
	public void setCoronaKit(CoronaKits coronaKit) {
		this.coronaKit = coronaKit;
	}
	public List<KitDetails> getKitDetails() {
		return kitDetails;
	}
	public void setKitDetails(List<KitDetails> kitDetails) {
		this.kitDetails = kitDetails;
	}
	
	
}
