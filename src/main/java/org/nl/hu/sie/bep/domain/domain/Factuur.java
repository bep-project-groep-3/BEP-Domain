package org.nl.hu.sie.bep.domain.domain;

import java.util.Date;
import java.util.List;

public class Factuur {

	//private int ID;
	private Date datumtijd;//TODO onbtreekt in loader
	private int nummer; //TODO onbtreekt in loader
	private String opmerking;

	private int klantID;
	private int PersoonID;
	private List<FactuurRegel> regels;

	public Factuur(Date datumtijd, int nummer, String opmerking, int klantID, int persoonID) {
		super();
		this.datumtijd = datumtijd;
		this.nummer = nummer;
		this.opmerking = opmerking;
		this.klantID = klantID;
		PersoonID = persoonID;
	}

	public List<FactuurRegel> getRegels() {
		return regels;
	}

	public void setRegels(List<FactuurRegel> regels) {
		this.regels = regels;
	}
	
}
