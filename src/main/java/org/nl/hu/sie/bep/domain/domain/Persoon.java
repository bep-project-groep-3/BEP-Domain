package org.nl.hu.sie.bep.domain.domain;

public class Persoon {
	
	private int ID;
	private String voornaam;
	private String tussenvoegsel;
	private String achternaam;
	private String telefoon;
	private String fax;
	private String geslacht;
	
	private int klantID;

	public Persoon(int iD, String voornaam, String tussenvoegsel, String achternaam, String telefoon, String fax,
			String geslacht, int klantID) {
		super();
		ID = iD;
		this.voornaam = voornaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.telefoon = telefoon;
		this.fax = fax;
		this.geslacht = geslacht;
		this.klantID = klantID;
	}

	public int getID() {
		return ID;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public String getTelefoon() {
		return telefoon;
	}

	public String getFax() {
		return fax;
	}

	public String getGeslacht() {
		return geslacht;
	}

	public int getKlantID() {
		return klantID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoon other = (Persoon) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
}
