package org.nl.hu.sie.bep.domain.domain;

import java.util.ArrayList;
import java.util.List;

public class Klant {

	private int id;
	private String naam;
	private String rechtsvorm;
	private String btwnummer;
	private String bankRek;
	private String giro;
	private String bic;

	private List<Adres> adressen = new ArrayList<>();
	private List<Persoon> contactPersonen = new ArrayList<>();
	private List<Factuur> facturen = new ArrayList<>();

	public Klant(int id, String naam, String rechtsvorm, String btwnummer, String bankRek, String giro, String bic) {
		super();
		this.id = id;
		this.naam = naam;
		this.rechtsvorm = rechtsvorm;
		this.btwnummer = btwnummer;
		this.bankRek = bankRek;
		this.giro = giro;
		this.bic = bic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getRechtsvorm() {
		return rechtsvorm;
	}

	public void setRechtsvorm(String rechtsvorm) {
		this.rechtsvorm = rechtsvorm;
	}

	public String getBtwnummer() {
		return btwnummer;
	}

	public void setBtwnummer(String btwnummer) {
		this.btwnummer = btwnummer;
	}

	public String getBankRek() {
		return bankRek;
	}

	public void setBankRek(String bankRek) {
		this.bankRek = bankRek;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public String getBic() {
		return bic;
	}

	public void setBIC(String bic) {
		this.bic = bic;
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
		if (id != other.id)
			return false;
		return true;
	}
}
