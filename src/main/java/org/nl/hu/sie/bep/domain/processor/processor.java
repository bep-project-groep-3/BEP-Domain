package org.nl.hu.sie.bep.domain.processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.nl.hu.sie.bep.domain.domain.*;

public class processor {
	private Bedrijf Bifi=new Bedrijf("Bifi b.v","Pietweg","1","1234AB","Amsterdam","12345","Rabo1234","135");
	
	public Bedrijf proces(List<Data> data) {
		ArrayList<Klant> klanten= new ArrayList<Klant>();
		for (Data dataLine : data) {

			Klant klant =createKlant(dataLine);
			Adres adres = createAdres(dataLine);
			Persoon persoon=createPersoon(dataLine);
			Factuur factuur= createFactuur(dataLine);
			List<FactuurRegel>factuurRegels=createFactuurRegels(dataLine);
			factuur.setRegels(factuurRegels);
			//add klant if not already in list
			if (!klanten.contains(klant)) {
				klanten.add(klant);
			}
			//Add adres,persoon,factuur to klant if not already
			for(Klant k : klanten) { 
			   if(k.getID()== dataLine.getKlantID()) { 
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
			   }
			}
		}
		Bifi.setKlanten(klanten);

		return Bifi;
	}



	private Klant createKlant(Data dataLine) {
		int klantID=dataLine.getKlantID();
		String bedrijfsnaam= dataLine.getBedrijfsnaam();
		String rechtsvorm= dataLine.getRechtsvorm();
		String btwnummer= dataLine.getVAT();
		String bankRek= dataLine.getBankRek();
		String giro= dataLine.getGiro();
		String BIK= dataLine.getBik();
		Klant klant= new Klant(klantID,bedrijfsnaam,rechtsvorm,btwnummer,bankRek,giro,BIK);
		return klant;
	}
	private Adres createAdres(Data dataLine) {
		String Straat= dataLine.getStraat(); 
		String type= dataLine.getType(); 
		String huisnummer= dataLine.getHuisnummer(); 
		String postcode= dataLine.getPostcode(); 
		String plaats= dataLine.getPlaats(); 
		String BIC= dataLine.getBIC(); 
		int klantID=dataLine.getKlantID();
		Adres adres= new Adres(Straat, type, huisnummer, postcode, plaats, BIC, klantID);
		return adres;
	}
	private Persoon createPersoon(Data dataLine) {

		int PersoonID = dataLine.getPersoonID();
		String voornaam= dataLine.getVoornaam();
		String tussenvoegsel= dataLine.getTussenvoegsel();
		String achternaam= dataLine.getAchternaam();
		String telefoon= dataLine.getTelefoon();
		String fax= dataLine.getFax();
		String geslacht= dataLine.getGeslacht();
		int klantID=dataLine.getKlantID();
		Persoon persoon=new Persoon(PersoonID, voornaam, tussenvoegsel, achternaam, telefoon, fax, geslacht, klantID);
		return persoon;
	}
	private Factuur createFactuur(Data dataLine) {
		Date datum= new Date();	//TODO LOADER
		int nummer = 12345; 	//TODO LOADER 
		String opmerking= dataLine.getNote();
		int klantID=dataLine.getKlantID();
		int PersoonID = dataLine.getPersoonID();
		Factuur factuur= new Factuur(datum,nummer,opmerking,klantID,PersoonID);
		return factuur;
	}
	private List<FactuurRegel> createFactuurRegels(Data dataLine) {
		List<Document> regels=dataLine.getInvoiceLines();
		ArrayList<FactuurRegel> factuurRegels= new ArrayList<FactuurRegel>();
		for (Document regel :dataLine.getInvoiceLines()) {
			int productID=regel.getInteger("productId");
			String productnaam=regel.getString("productName");
			double hoeveelheid=regel.getDouble("quantity");
			double totaalprijs=regel.getDouble("totalPrice");
			String BTWCode=regel.getString("btwCode");
			String eenheid=regel.getString("unit");
			FactuurRegel factuurRegel= new FactuurRegel(productID,productnaam,hoeveelheid,totaalprijs,BTWCode,eenheid);
			factuurRegels.add(factuurRegel);
		}
		return factuurRegels;
	}
}

