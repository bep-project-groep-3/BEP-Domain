package org.nl.hu.sie.bep.domain.domain;

public class FactuurRegel {
	
	//private int ID;
	private int productID;
	private String productnaam;
	private double hoeveelheid;
	private double totaalprijs;
	private String BTWCode;
	private String eenheid;
	//private int FactuurID;
	
	public FactuurRegel(int productID, String productnaam, double hoeveelheid, double totaalprijs, String bTWCode,
			String eenheid) {
		super();
		this.productID = productID;
		this.productnaam = productnaam;
		this.hoeveelheid = hoeveelheid;
		this.totaalprijs = totaalprijs;
		BTWCode = bTWCode;
		this.eenheid = eenheid;
	}
	
	

}
