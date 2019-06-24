package org.nl.hu.sie.bep.domain.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Factuur {

	private Date datumtijd;
	private int nummer;
	private String opmerking;

	private int klantId;
	private int persoonId;
	private List<FactuurRegel> regels = new ArrayList<>();

	public Factuur(Date datumtijd, int nummer, String opmerking, int klantId, int persoonId) {
		super();
		this.datumtijd = datumtijd;
		this.nummer = nummer;
		this.opmerking = opmerking;
		this.klantId = klantId;
		this.persoonId = persoonId;
	}

	public Date getDatumtijd() {
		return datumtijd;
	}

	public void setDatumtijd(Date datumtijd) {
		this.datumtijd = datumtijd;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}

	public int getKlantId() {
		return klantId;
	}

	public void setKlantId(int klantId) {
		this.klantId = klantId;
	}

	public int getPersoonId() {
		return persoonId;
	}

	public void setPersoonId(int persoonId) {
		this.persoonId = persoonId;
	}

	public List<FactuurRegel> getRegels() {
		return regels;
	}

	public void setRegels(List<FactuurRegel> regels) {
		this.regels = regels;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Factuur)) {
			return false;
		}
		Factuur other = (Factuur) obj;
		return nummer == other.nummer;
	}
}
