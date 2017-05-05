package com.sabel.interfaces;

public class Wurm extends Einkaufsgegenstand {

	public Wurm( double preis) {
		super( preis);
	}

	public void angeln() {
		System.out.println("Wurm wird als Köder verwendet");
	}
	
}
