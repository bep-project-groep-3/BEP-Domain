package org.nl.hu.sie.bep.domain.domain;

import java.util.Objects;

public class Persoon {

	public static class Builder {
		private int id;
		private String voornaam;
		private String tussenvoegsel;
		private String achternaam;
		private String telefoon;
		private String fax;
		private String geslacht;
		private int klantId;

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setVoornaam(String voornaam) {
			this.voornaam = voornaam;
			return this;
		}

		public Builder setTussenvoegsel(String tussenvoegsel) {
			this.tussenvoegsel = tussenvoegsel;
			return this;
		}

		public Builder setAchternaam(String achternaam) {
			this.achternaam = achternaam;
			return this;
		}

		public Builder setTelefoon(String telefoon) {
			this.telefoon = telefoon;
			return this;
		}

		public Builder setFax(String fax) {
			this.fax = fax;
			return this;
		}

		public Builder setGeslacht(String geslacht) {
			this.geslacht = geslacht;
			return this;
		}

		public Builder setKlantId(int klantId) {
			this.klantId = klantId;
			return this;
		}

		public Persoon build() {
			Persoon p = new Persoon();
			p.id = id;
			p.voornaam = voornaam;
			p.tussenvoegsel = tussenvoegsel;
			p.achternaam = achternaam;
			p.telefoon = telefoon;
			p.fax = fax;
			p.geslacht = geslacht;
			p.klantId = klantId;
			return p;
		}

	}

	private int id;
	private String voornaam;
	private String tussenvoegsel;
	private String achternaam;
	private String telefoon;
	private String fax;
	private String geslacht;

	private int klantId;

	private Persoon() {
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
	public int hashCode() {
		return Objects.hash(id);
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
