package org.nl.hu.sie.bep.domain.domain;

import java.util.List;

public class Klant {

	private int ID;
	private String naam;
	private String rechtsvorm;
	private String btwnummer;
	private String bankRek;
	private String giro;
	private String BIC;
	
	private List<Adres> adressen;
	private List<Persoon> contactPersonen;
	private List<Factuur> facturen;
}
