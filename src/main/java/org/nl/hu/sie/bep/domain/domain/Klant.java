package org.nl.hu.sie.bep.domain.domain;

import java.util.List;

public class Klant {

	private int ID;
	private String naam;
	private String rechtsvorm;
	private String btwnummer;
	private String bankRek;
	private String giro;
	private String BIC;
	
	private List<Adres> adressen;
	private List<Persoon> contactPersonen;
	private List<Factuur> facturen;

	public Klant(int iD, String naam, String rechtsvorm, String btwnummer, String bankRek, String giro, String bIC) {
		super();
		ID = iD;
		this.naam = naam;
		this.rechtsvorm = rechtsvorm;
		this.btwnummer = btwnummer;
		this.bankRek = bankRek;
		this.giro = giro;
		BIC = bIC;
	}

	public int getID() {
		return ID;
	}
	

	public String getNaam() {
		return naam;
	}

	public String getRechtsvorm() {
		return rechtsvorm;
	}

	public String getBtwnummer() {
		return btwnummer;
	}

	public String getBankRek() {
		return bankRek;
	}

	public String getGiro() {
		return giro;
	}

	public String getBIC() {
		return BIC;
	}

	public List<Adres> getAdressen() {
		return adressen;
	}
	public void setAdressen(List<Adres> adressen) {
		this.adressen = adressen;
	}
	public List<Persoon> getContactPersonen() {
		return contactPersonen;
	}
	public void setContactPersonen(List<Persoon> contactPersonen) {
		this.contactPersonen = contactPersonen;
	}
	public List<Factuur> getFacturen() {
		return facturen;
	}
	public void setFacturen(List<Factuur> facturen) {
		this.facturen = facturen;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Klant other = (Klant) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
}
