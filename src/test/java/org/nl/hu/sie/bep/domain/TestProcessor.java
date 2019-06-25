package org.nl.hu.sie.bep.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.*;
import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.domain.processor.Processor;

public class TestProcessor {

	private static Processor processor;
	private static Bedrijf bedrijf;

	@BeforeAll
	public static void setUp() {
		processor = new Processor();

		List<Data> dataList = new ArrayList<Data>();
		Data d1=getNewDataObject();
		Data d2=getNewDataObject();
		d2.setKlantID(101);
		d2.setPersoonID(102);
		d2.setInvoiceID(103);
		dataList.add(d1);
		dataList.add(d1);
		dataList.add(d2);
		bedrijf = processor.process(dataList);
	}

	public static Data getNewDataObject() {
		List<Document> lines = new ArrayList<>();

		int klantId = 1;
		int persoonId = 2;
		Document line = new Document();
		line.append("productId", 3.0);
		line.append("productName", "apple");
		line.append("quantity", 10.0);
		line.append("totalPrice", 20.0);
		line.append("btwCode", "HIGH");
		line.append("unit", "kg");
		lines.add(line);

		Data d = new Data("straat", "type", "huisnummer", "postcode", "plaats", "BIC", klantId, persoonId,
				"bedrijfsnaam", "rechtsvorm", "VAT", "bankrek", "giro", "BIK", "voornaam", "tussenvoegsel",
				"achternaam", "telefoon", "fax", "geslacht", "note");

		Date date = new Date();
		double invoiceID = 3.0;

		d.setInvoiceLines(lines);
		d.setDate(date);
		d.setInvoiceID(invoiceID);
		return d;
	}

	@Test
	public void testproccesorBedrijfKlantId() {
		assertEquals(1, bedrijf.getKlanten().get(0).getId());
	}

	@Test
	public void testproccesorBedrijfKlantPersoonId() {
		assertEquals(2, bedrijf.getKlanten().get(0).getContactPersonen().get(0).getId());
	}

	@Test
	public void testproccesorBedrijfKlantFactuurRegelBtwCode() {
		assertEquals("HIGH", bedrijf.getKlanten().get(0).getFacturen().get(0).getRegels().get(0).getBtwCode());
	}

	@Test
	public void testproccesorBedrijfKlantFactuurNummer() {
		assertEquals(3, bedrijf.getKlanten().get(0).getFacturen().get(0).getNummer());
	}

}