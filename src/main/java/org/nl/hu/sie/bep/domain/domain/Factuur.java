package org.nl.hu.sie.bep.domain.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factuur other = (Factuur) obj;
		if (persoonId != other.persoonId)
			return false;
		if (datumtijd == null) {
			if (other.datumtijd != null)
				return false;
		} else if (!datumtijd.equals(other.datumtijd))
			return false;
		if (klantId != other.klantId)
			return false;
		if (nummer != other.nummer)
			return false;
		if (opmerking == null) {
			if (other.opmerking != null)
				return false;
		} else if (!opmerking.equals(other.opmerking))
			return false;
		if (regels == null) {
			if (other.regels != null)
				return false;
		} else if (!regels.equals(other.regels))
			return false;
		return true;
	}

}
