package org.nl.hu.sie.bep.domain.domain;

import java.util.ArrayList;
import java.util.List;

//Er is nu nog maar 1 bedrijf, Bifi waarvan de data niet in de db staat.
public class Bedrijf {
   
	public static class Builder {
		private String bedrijfsnaam;
		private String straat;
		private String huisnummer;
		private String postcode;
		private String plaats;
		private String btwNummer;
		private String iban;
		private String bic;
		private List<Klant> klanten = new ArrayList<>();
		
		public Builder() {}
		
		public Builder setBedrijfsnaam(String bedrijfsnaam) {
            this.bedrijfsnaam = bedrijfsnaam;
            return this;
		}
		
	   public Builder setStraat(String straat) {
			this.straat = straat;
			 return this;
		}

		public Builder setHuisnummer(String huisnummer) {
			this.huisnummer = huisnummer;
			 return this;
		}

		public Builder setPostcode(String postcode) {
			this.postcode = postcode;
			 return this;
		}

		public Builder setPlaats(String plaats) {
			this.plaats = plaats;
			 return this;
		}

		public Builder setBtwNummer(String btwNummer) {
			this.btwNummer = btwNummer;
			 return this;
		}

		public Builder setIban(String iban) {
			this.iban = iban;
			 return this;
		}

		public Builder setBic(String bic) {
			this.bic = bic;
			 return this;
		}

		public Builder setKlanten(List<Klant> klanten) {
			this.klanten = klanten;
			 return this;
		}

	public Bedrijf build() {
			Bedrijf b = new Bedrijf();
			b.bedrijfsnaam = bedrijfsnaam;
			b.straat = straat;
			b.huisnummer = huisnummer;
			b.postcode = postcode;
			b.plaats = plaats;
			b.btwNummer = btwNummer;
			b.iban = iban;
			b.bic = bic;
			b.klanten = klanten;
			return b;
		}
   }
   
	private String bedrijfsnaam;
	private String straat;
	private String huisnummer;
	private String postcode;
	private String plaats;
	private String btwNummer;
	private String iban;
	private String bic;
	private List<Klant> klanten = new ArrayList<>();
	
	private Bedrijf() {}
	
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
