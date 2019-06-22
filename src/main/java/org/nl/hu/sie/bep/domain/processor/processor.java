package org.nl.hu.sie.bep.domain.processor;

import java.util.ArrayList;
import java.util.List;

import org.nl.hu.sie.bep.domain.domain.*;

public class processor {
	private Bedrijf Bifi=new Bedrijf("Bifi b.v","Pietweg","1","1234AB","Amsterdam","12345","Rabo1234","135");
	
	public Bedrijf proces(List<Data> data) {
		ArrayList<Klant> testKlanten= new ArrayList<Klant>();
		Klant test=new Klant();
		testKlanten.add(test);
		for (Data dataLine : data) {
			//TODO create domain object out of data 
		}
		Bifi.setKlanten(testKlanten);
		return Bifi;
	}

	

}

