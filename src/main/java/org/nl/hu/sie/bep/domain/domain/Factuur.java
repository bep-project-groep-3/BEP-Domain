package org.nl.hu.sie.bep.domain.domain;

import java.util.Date;
import java.util.List;

public class Factuur {

	//private int ID;
	private Date datumtijd;
	//private int nummer; //TODO onbtreekt in loader
	private String opmerking;
	
	private int klantID;
	private int PersoonID;
	private List<FactuurRegel> regels;
	
}
