package com.sabel.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Parkplatz {

	private List<Auto> autos;
	
	public Parkplatz() {
		super();
		this.autos = new Vector<>();		
	}
	
	public void einparken(Auto auto) {
		autos.add(auto);
	}
	
	public Auto ausparken(int index) {
		if (!pruefeIndex(index)) {
			return null;
		}
		return autos.remove(index);
	}
	
	public Auto ausparken(String kennzeichen) {
		Iterator<Auto> iterator = autos.iterator();
		
		while (iterator.hasNext()) {
			Auto auto = iterator.next();
			if (auto.getKennzeichen().equals(kennzeichen)) {
				iterator.remove();
				return auto;
			}
		}	
		return null;
	}
	
	public List<Auto> ausparkenAllerAutosMitMehrAls(int ps) {
		
		List<Auto> liste = new ArrayList<>();
		Iterator<Auto> iterator = autos.iterator();
		
		while (iterator.hasNext()) {
			Auto auto = iterator.next();
			if (auto.getPs()== ps) {
				liste.add(auto);
				iterator.remove();
			}
		}
		return liste;
	}
	
	private boolean pruefeIndex(int index) {
		return index >= 0 && index < autos.size() ;
	}
	
	/**
	 * Parkt die Autos nach ihrer PS aufsteigend
	 */
	public void umparken(Comparator<Auto> c) {
		
		Collections.sort(autos, c);
	}

	@Override
	public String toString() {
		String ausgabe = "Autos auf dem Parkplatz:\n";
		for (Auto auto : autos) {
			ausgabe = ausgabe + auto.getKennzeichen() + "\t" + auto.getPs() + " ps \n";
		}
		return ausgabe;

	}
	
	
	
}
