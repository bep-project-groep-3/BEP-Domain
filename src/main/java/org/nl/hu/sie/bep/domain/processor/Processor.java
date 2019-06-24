package org.nl.hu.sie.bep.domain.processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.nl.hu.sie.bep.domain.domain.*;
import org.nl.hu.sie.bep.loader.models.Data;

public class Processor {
	private Bedrijf bifi=new Bedrijf("Bifi b.v","Pietweg","1","1234AB","Amsterdam","12345","Rabo1234","135");
	
	public Bedrijf process(List<Data> data) {
		ArrayList<Klant> klanten= new ArrayList<Klant>();
		for (Data dataLine : data) {

			Klant klant =createKlant(dataLine);
			//add klant if not already in list
			if (!klanten.contains(klant)) {
				klanten.add(klant);
			}
			Klant[] klantArray = (Klant[]) klanten.toArray();
			Klant k=Arrays.stream(klantArray)
            .filter(lambdaKlant -> lambdaKlant.getId()==dataLine.getKlantID() )
            .findFirst()
            .orElse(null);
			
			if (k != null) {
				k=addListstoKlant(k,dataLine);
			   }
			}
		bifi.setKlanten(klanten);

		return bifi;
	}

	private Klant addListstoKlant(Klant k,Data dataLine) {
		Adres adres = createAdres(dataLine);
		Persoon persoon=createPersoon(dataLine);
		Factuur factuur= createFactuur(dataLine);
		List<FactuurRegel>factuurRegels=createFactuurRegels(dataLine);
		factuur.setRegels(factuurRegels);
		   List<Adres>adressen=k.getAdressen();
		   if (!adressen.contains(adres)){
			   ArrayList<Adres> newAdressen= (ArrayList<Adres>) adressen;
			   newAdressen.add(adres);
			   k.setAdressen(newAdressen);
		   }
		   List<Persoon>personen=k.getContactPersonen();
		   if (!personen.contains(persoon)){
			   ArrayList<Persoon> newPersonen= (ArrayList<Persoon>) personen;
			   newPersonen.add(persoon);
			   k.setContactPersonen(newPersonen);
		   }
		   List<Factuur>facturen=k.getFacturen();
		   if (!facturen.contains(factuur)){
			   ArrayList<Factuur> newFacturen= (ArrayList<Factuur>) facturen;
			   newFacturen.add(factuur);
			   k.setFacturen(newFacturen);
		   }
		   return k;
		
	}

	private Klant createKlant(Data dataLine) {
		int klantId=dataLine.getKlantID();
		String bedrijfsnaam= dataLine.getBedrijfsnaam();
		String rechtsvorm= dataLine.getRechtsvorm();
		String btwnummer= dataLine.getVAT();
		String bankRek= dataLine.getBankRek();
		String giro= dataLine.getGiro();
		String bik= dataLine.getBik();
		return new Klant(klantId,bedrijfsnaam,rechtsvorm,btwnummer,bankRek,giro,bik);
	}
	private Adres createAdres(Data dataLine) {
		String straat= dataLine.getStraat(); 
		String type= dataLine.getType(); 
		String huisnummer= dataLine.getHuisnummer(); 
		String postcode= dataLine.getPostcode(); 
		String plaats= dataLine.getPlaats(); 
		String bic= dataLine.getBIC(); 
		int klantId=dataLine.getKlantID();
		return new Adres(straat, type, huisnummer, postcode, plaats, bic, klantId);
	}
	private Persoon createPersoon(Data dataLine) {

		int persoonId = dataLine.getPersoonID();
		String voornaam= dataLine.getVoornaam();
		String tussenvoegsel= dataLine.getTussenvoegsel();
		String achternaam= dataLine.getAchternaam();
		String telefoon= dataLine.getTelefoon();
		String fax= dataLine.getFax();
		String geslacht= dataLine.getGeslacht();
		int klantId=dataLine.getKlantID();
		return new Persoon(persoonId, voornaam, tussenvoegsel, achternaam, telefoon, fax, geslacht, klantId);
	}
	private Factuur createFactuur(Data dataLine) {
		Date datum= dataLine.getDate();	
		int nummer =  (int) dataLine.getInvoiceID();
		String opmerking= dataLine.getNote();
		int klantId=dataLine.getKlantID();
		int persoonId = dataLine.getPersoonID();
		return new Factuur(datum,nummer,opmerking,klantId,persoonId);
	}
	private List<FactuurRegel> createFactuurRegels(Data dataLine) {
		ArrayList<FactuurRegel> factuurRegels= new ArrayList<FactuurRegel>();
		for (Document regel :dataLine.getInvoiceLines()) {
			int productId=regel.getInteger("productId");
			String productnaam=regel.getString("productName");
			double hoeveelheid=regel.getDouble("quantity");
			double totaalprijs=regel.getDouble("totalPrice");
			String btwCode=regel.getString("btwCode");
			String eenheid=regel.getString("unit");
			FactuurRegel factuurRegel= new FactuurRegel(productId,productnaam,hoeveelheid,totaalprijs,btwCode,eenheid);
			factuurRegels.add(factuurRegel);
		}
		return factuurRegels;
	}
}

