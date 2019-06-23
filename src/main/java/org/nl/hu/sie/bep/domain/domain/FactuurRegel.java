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

	public int getProductID() {
		return productID;
	}

	public String getProductnaam() {
		return productnaam;
	}

	public double getHoeveelheid() {
		return hoeveelheid;
	}

	public double getTotaalprijs() {
		return totaalprijs;
	}


	public String getBTWCode() {
		return BTWCode;
	}

	public String getEenheid() {
		return eenheid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FactuurRegel other = (FactuurRegel) obj;
		if (BTWCode == null) {
			if (other.BTWCode != null)
				return false;
		} else if (!BTWCode.equals(other.BTWCode))
			return false;
		if (eenheid == null) {
			if (other.eenheid != null)
				return false;
		} else if (!eenheid.equals(other.eenheid))
			return false;
		if (Double.doubleToLongBits(hoeveelheid) != Double.doubleToLongBits(other.hoeveelheid))
			return false;
		if (productID != other.productID)
			return false;
		if (productnaam == null) {
			if (other.productnaam != null)
				return false;
		} else if (!productnaam.equals(other.productnaam))
			return false;
		if (Double.doubleToLongBits(totaalprijs) != Double.doubleToLongBits(other.totaalprijs))
			return false;
		return true;
	}
	
	

}
