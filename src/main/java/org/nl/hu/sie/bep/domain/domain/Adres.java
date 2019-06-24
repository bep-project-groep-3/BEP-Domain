package org.nl.hu.sie.bep.domain.domain;

import java.util.Objects;

public class Adres {

	private String straat;
	private String type;
	private String huisnummer;
	private String postcode;
	private String plaats;
	private String bic;

	private int klantID;

	public Adres(String straat, String type, String huisnummer, String postcode, String plaats, String bic,
			int klantID) {
		super();
		this.straat = straat;
		this.type = type;
		this.huisnummer = huisnummer;
		this.postcode = postcode;
		this.plaats = plaats;
		this.bic = bic;
		this.klantID = klantID;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public int getKlantID() {
		return klantID;
	}

	public void setKlantID(int klantID) {
		this.klantID = klantID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Adres)) {
			return false;
		}
		Adres other = (Adres) obj;
		return Objects.equals(bic, other.bic) && Objects.equals(huisnummer, other.huisnummer)
				&& klantID == other.klantID && Objects.equals(plaats, other.plaats)
				&& Objects.equals(postcode, other.postcode) && Objects.equals(straat, other.straat)
				&& Objects.equals(type, other.type);
	}
}
