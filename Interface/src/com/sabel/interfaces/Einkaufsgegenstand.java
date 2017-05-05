package com.sabel.interfaces;

// POJO: Plain old Java Project

public class Einkaufsgegenstand {
	
	private String name;
	private double preis;
	
	public Einkaufsgegenstand() {
		this.name = getClass().getSimpleName();
	}
	
	public Einkaufsgegenstand(double preis) {
		super();		
		this.preis = preis;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	
	

}



