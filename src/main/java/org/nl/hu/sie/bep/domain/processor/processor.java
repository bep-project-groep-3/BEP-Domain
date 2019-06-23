package org.nl.hu.sie.bep.domain.processor;

import java.util.ArrayList;
import java.util.List;

import org.nl.hu.sie.bep.domain.domain.*;

public class processor {
	private Bedrijf Bifi=new Bedrijf("Bifi b.v","Pietweg","1","1234AB","Amsterdam","12345","Rabo1234","135");
	
	public Bedrijf proces(List<Data> data) {
		ArrayList<Klant> klanten= new ArrayList<Klant>();
		for (Data dataLine : data) {

			Klant klant =createKlant(dataLine);
			Adres adres = createAdres(dataLine);
			Persoon persoon=createPersoon(dataLine);
			//TODO
			//note+Invoicelines
			
			//add klant if not already in list
			if (!klanten.contains(klant)) {
				klanten.add(klant);
			}
			//Add Adres and persoon to klant if not already in list
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
			   }
			}
		}
		Bifi.setKlanten(klanten);

		return Bifi;
	}

	public Klant createKlant(Data dataLine) {
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
	public Adres createAdres(Data dataLine) {
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
	public Persoon createPersoon(Data dataLine) {
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
}

