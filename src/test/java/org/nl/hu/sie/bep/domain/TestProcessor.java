package org.nl.hu.sie.bep.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.domain.processor.Data;
import org.nl.hu.sie.bep.domain.processor.processor;

public class TestProcessor {
	
	private processor processor;
	
	@Test
	public void testproccesorBedrijf(){
		processor= new processor();
		
		List<Data> dataList=new ArrayList<Data>();
		List<Document> lines= new ArrayList<>();
		
		Document line = new Document();
		line.append("productId", 3);
		line.append("productName", "apple");
		line.append("quantity", 10.0);
		line.append("totalPrice", 20.0);
		line.append("btwCode", "HIGH");
		line.append("unit", "kg");
		lines.add(line);
		
		Data d = new Data("straat","type", "huisnummer", "postcode",
			"plaats", "BIC", 1, 2, "bedrijfsnaam", "rechtsvorm", "VAT", "bankrek", "giro", "BIK", "voornaam", "tussenvoegsel", 
			"achternaam", "telefoon","fax", "geslacht", "note",lines,new Date(),3.0);
		dataList.add(d);
		
		Bedrijf b=processor.process(dataList);
		assertEquals(1,b.getKlanten().get(0).getID());
		assertEquals(2,b.getKlanten().get(0).getContactPersonen().get(0).getID());
		assertEquals("HIGH",b.getKlanten().get(0).getFacturen().get(0).getRegels().get(0).getBTWCode());
		assertEquals(3,b.getKlanten().get(0).getFacturen().get(0).getNummer());
	}
}