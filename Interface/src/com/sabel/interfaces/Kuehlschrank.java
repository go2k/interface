package com.sabel.interfaces;

import java.util.ArrayList;

public class Kuehlschrank {

	private ArrayList<Essbar> essbares ;
	private ArrayList<Einkaufsgegenstand> restlicheGegenstaende;
	
	public Kuehlschrank() {
		super();
		this.essbares = new ArrayList<>();
		this.restlicheGegenstaende = new ArrayList<>();
	}

	public void hinzufuegen(Essbar essbar) {
		essbares.add(essbar);
	}
	
	public void hinzufuegen(Einkaufsgegenstand einkaufsgegenstand) {
		restlicheGegenstaende.add(einkaufsgegenstand);
	}
	
	public Object entfernen(String name) {
		for (Essbar essbar : essbares) {
			if (essbar.getClass().getSimpleName().equals(name)) {
				essbares.remove(essbar);
				return essbar;
			}
		}
		for (Einkaufsgegenstand einkaufsgegenstand : restlicheGegenstaende) {
			if (einkaufsgegenstand.getClass().getSimpleName().equals(name)) {
				restlicheGegenstaende.remove(einkaufsgegenstand);
				return einkaufsgegenstand;
			}
		}
		return null;
	}
}
