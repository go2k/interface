package com.sabel.interfaces;

import javax.crypto.spec.GCMParameterSpec;

public class Ei extends Einkaufsgegenstand implements Essbar {

	private boolean gekocht;
	

	public Ei(double preis) {		
		this.gekocht = false;
		
	}
	
	public void kochen(int dauerInSekunden) {
		System.out.println("Das Ei  wird gekocht");
		try {
			Thread.sleep(dauerInSekunden * 1000);
			this.gekocht = true;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fertig!");
	}
	
	@Override
	public void essen() {
		if (!gekocht) {
			kochen(5);
		}
		System.out.println("Das Ei wird gegessen");

	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Das Ei wurde gegessen und ist nun weg");
		
	}

	public static void main(String[] args) {
		new Ei(20).essen();
		System.gc();
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
}
