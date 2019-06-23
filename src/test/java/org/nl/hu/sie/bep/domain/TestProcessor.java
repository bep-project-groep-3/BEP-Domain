package org.nl.hu.sie.bep.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.*;
import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.domain.processor.processor;

public class TestProcessor {
	
	private static processor processor;
	private static Bedrijf bedrijf;
	
	@BeforeAll
	public static void setUp() {
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
			"achternaam", "telefoon","fax", "geslacht", "note");
		
		Date date=new Date();
		double invoiceID=3.0;
		
		d.setInvoiceLines(lines);
		d.setDate(date);
		d.setInvoiceID(invoiceID);

		dataList.add(d);
		
		bedrijf=processor.process(dataList);
	}
	
	@Test
	public void testproccesorBedrijfKlantID(){
		assertEquals(1,bedrijf.getKlanten().get(0).getID());
	}
	@Test
	public void testproccesorBedrijfKlantPersoonID(){
		assertEquals(2,bedrijf.getKlanten().get(0).getContactPersonen().get(0).getID());
	}
	@Test
	public void testproccesorBedrijfKlantFactuurRegelBtwCode(){
		assertEquals("HIGH",bedrijf.getKlanten().get(0).getFacturen().get(0).getRegels().get(0).getBTWCode());
	}
	@Test
	public void testproccesorBedrijfKlantFactuurNummer(){
		assertEquals(3,bedrijf.getKlanten().get(0).getFacturen().get(0).getNummer());
	}
}