package com.sabel.interfaces;

/**
 * 
 * @author Meier
 *
 */

public final class Auto {

	private String kennzeichen;
	private int ps;
	
	
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Auto(String kennzeichen, int ps) {
		super();
		this.kennzeichen = kennzeichen;
		this.ps = ps;
	}
	public String getKennzeichen() {
		return kennzeichen;
	}
	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kennzeichen == null) ? 0 : kennzeichen.hashCode());
		result = prime * result + ps;
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
		Auto other = (Auto) obj;
		if (kennzeichen == null) {
			if (other.kennzeichen != null)
				return false;
		} else if (!kennzeichen.equals(other.kennzeichen))
			return false;
		if (ps != other.ps)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Auto [kennzeichen=" + kennzeichen + ", ps=" + ps + "]";
	}	
	
}
