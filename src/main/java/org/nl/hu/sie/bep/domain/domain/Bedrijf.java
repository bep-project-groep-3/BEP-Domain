package org.nl.hu.sie.bep.domain.domain;

import java.util.ArrayList;
import java.util.List;

//Er is nu nog maar 1 bedrijf, Bifi waarvan de data niet in de db staat.
public class Bedrijf {

	private String bedrijfsnaam;
	private String straat;
	private String huisnummer;
	private String postcode;
	private String plaats;
	private String btwNummer;
	private String iban;
	private String bic;
	private List<Klant> klanten = new ArrayList<>();

	public Bedrijf(String bedrijfsnaam, String straat, String huisnummer, String postcode, String plaats,
			String btwNummer, String iban, String bic) {
		this.bedrijfsnaam = bedrijfsnaam;
		this.straat = straat;
		this.huisnummer = huisnummer;
		this.postcode = postcode;
		this.plaats = plaats;
		this.btwNummer = btwNummer;
		this.iban = iban;
		this.bic = bic;
	}

	public String getBedrijfsnaam() {
		return bedrijfsnaam;
	}

	public void setBedrijfsnaam(String bedrijfsnaam) {
		this.bedrijfsnaam = bedrijfsnaam;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String getBtwNummer() {
		return btwNummer;
	}

	public void setBtwNummer(String bTWNummer) {
		this.btwNummer = bTWNummer;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public List<Klant> getKlanten() {
		return klanten;
	}

	public void setKlanten(List<Klant> klanten) {
		this.klanten = klanten;
	}

}
