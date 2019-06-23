package org.nl.hu.sie.bep.domain.domain;

public class Adres {
	
	//private int ID;
	private String straat;
	private String type;
	private String huisnummer;
	private String postcode;
	private String plaats;
	private String BIC;
	
	private int klantID;

	public Adres(String straat, String type, String huisnummer, String postcode, String plaats, String bIC, int klantID) {
		super();
		this.straat = straat;
		this.type = type;
		this.huisnummer = huisnummer;
		this.postcode = postcode;
		this.plaats = plaats;
		BIC = bIC;
		this.klantID = klantID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adres other = (Adres) obj;
		if (BIC == null) {
			if (other.BIC != null)
				return false;
		} else if (!BIC.equals(other.BIC))
			return false;
		if (huisnummer == null) {
			if (other.huisnummer != null)
				return false;
		} else if (!huisnummer.equals(other.huisnummer))
			return false;
		if (klantID != other.klantID)
			return false;
		if (plaats == null) {
			if (other.plaats != null)
				return false;
		} else if (!plaats.equals(other.plaats))
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (straat == null) {
			if (other.straat != null)
				return false;
		} else if (!straat.equals(other.straat))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


}
