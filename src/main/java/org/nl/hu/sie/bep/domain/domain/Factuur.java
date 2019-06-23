package org.nl.hu.sie.bep.domain.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factuur {

	//private int ID;
	private Date datumtijd;
	private int nummer; 
	private String opmerking;

	private int klantID;
	private int PersoonID;
	private List<FactuurRegel> regels= new ArrayList<>();

	public Factuur(Date datumtijd, int nummer, String opmerking, int klantID, int persoonID) {
		super();
		this.datumtijd = datumtijd;
		this.nummer = nummer;
		this.opmerking = opmerking;
		this.klantID = klantID;
		PersoonID = persoonID;
	}
	
	public Date getDatumtijd() {
		return datumtijd;
	}
	
	public int getNummer() {
		return nummer;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public int getKlantID() {
		return klantID;
	}

	public int getPersoonID() {
		return PersoonID;
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
		if (PersoonID != other.PersoonID)
			return false;
		if (datumtijd == null) {
			if (other.datumtijd != null)
				return false;
		} else if (!datumtijd.equals(other.datumtijd))
			return false;
		if (klantID != other.klantID)
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
