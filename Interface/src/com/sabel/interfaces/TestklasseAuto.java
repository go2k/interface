package com.sabel.interfaces;

import java.util.Comparator;

public class TestklasseAuto {

	public static void main(String[] args) {

		Parkplatz pp = new Parkplatz();

		Auto a1 = new Auto("HIP MK 123", 178);
		Auto a2 = new Auto("M   BA 14", 112);
		Auto a3 = new Auto("RO  PS 78", 53);
		Auto a4 = new Auto("RH  KW 156", 156);

		pp.einparken(a1);
		pp.einparken(a2);
		pp.einparken(a3);
		pp.einparken(a4);
		pp.einparken(new Auto("BA  TT 121", 133));
		pp.einparken(new Auto("P  RE 99", 68));
		pp.einparken(new Auto("BA  TT 88", 87));
		pp.einparken(new Auto("BA  TT 87", 98));
		pp.einparken(new Auto("BA  TT 89", 99));

		System.out.println(pp.toString());

		PsSortierer pss = new PsSortierer();
		
		System.out.println(pp.toString());
		
		pp.umparken(pss);
		
		System.out.println(pp.toString());		
		
		//
		// Anonyme innere Klasse
		//
		
		pp.umparken(new Comparator<Auto>() {
			
			@Override
			public int compare(Auto o1, Auto o2) {
				return o1.getKennzeichen().compareTo(o2.getKennzeichen());
			}
		});
		
		System.out.println(pp.toString());		
		
		pp.umparken(new Comparator<Auto>() {

			@Override
			public int compare(Auto o1, Auto o2) {
				return o1.getPs() - o2.getPs();
			}
			
		});
		
		
		System.out.println(pp.toString());
	}

}
