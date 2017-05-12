package com.sabel.interfaces;

import java.util.Comparator;

public class PsSortierer implements Comparator<Auto>{

	@Override
	public int compare(Auto o1, Auto o2) {
		return o1.getPs() - o2.getPs()	;
	}

	
}
