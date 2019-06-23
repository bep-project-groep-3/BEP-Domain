package org.nl.hu.sie.bep.domain;

import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.domain.domain.Klant;
import org.nl.hu.sie.bep.domain.processor.Data;
import org.nl.hu.sie.bep.domain.processor.processor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TestProcessor {
	
	private processor processor;
	
	@Test
	public void testproccesorBedrijf(){
		processor= new processor();
		
		List<Data> dataList=new ArrayList<Data>();
		List<Document> lines= new ArrayList<>();
		
		Data d = new Data("straat","type", "huisnummer", "postcode",
			"plaats", "BIC", 1, 2, "bedrijfsnaam", "rechtsvorm", "VAT", "bankrek", "giro", "BIK", "voornaam", "tussenvoegsel", "achternaam", "telefoon","fax", "geslacht", "note",lines);
		dataList.add(d);
		
		Bedrijf b=processor.process(dataList);
		assertEquals(1,b.getKlanten().get(0).getID());
		assertEquals(2,b.getKlanten().get(0).getContactPersonen().get(0).getID());
	}
}