package org.nl.hu.sie.bep.domain.domain;

public class Persoon {

	private int id;
	private String voornaam;
	private String tussenvoegsel;
	private String achternaam;
	private String telefoon;
	private String fax;
	private String geslacht;

	private int klantId;

	public Persoon(int id, String voornaam, String tussenvoegsel, String achternaam, String telefoon, String fax,
			String geslacht, int klantId) {
		super();
		this.id = id;
		this.voornaam = voornaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.telefoon = telefoon;
		this.fax = fax;
		this.geslacht = geslacht;
		this.klantId = klantId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getTelefoon() {
		return telefoon;
	}

	public void setTelefoon(String telefoon) {
		this.telefoon = telefoon;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}

	public int getKlantId() {
		return klantId;
	}

	public void setKlantId(int klantId) {
		this.klantId = klantId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persoon)) {
			return false;
		}
		Persoon other = (Persoon) obj;
		return id == other.id;
	}
}
