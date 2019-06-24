package org.nl.hu.sie.bep.domain.domain;

import java.util.Objects;

public class FactuurRegel {

	private int productID;
	private String productnaam;
	private double hoeveelheid;
	private double totaalprijs;
	private String btwCode;
	private String eenheid;

	public FactuurRegel(int productID, String productnaam, double hoeveelheid, double totaalprijs, String btwCode,
			String eenheid) {
		super();
		this.productID = productID;
		this.productnaam = productnaam;
		this.hoeveelheid = hoeveelheid;
		this.totaalprijs = totaalprijs;
		this.btwCode = btwCode;
		this.eenheid = eenheid;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductnaam() {
		return productnaam;
	}

	public void setProductnaam(String productnaam) {
		this.productnaam = productnaam;
	}

	public double getHoeveelheid() {
		return hoeveelheid;
	}

	public void setHoeveelheid(double hoeveelheid) {
		this.hoeveelheid = hoeveelheid;
	}

	public double getTotaalprijs() {
		return totaalprijs;
	}

	public void setTotaalprijs(double totaalprijs) {
		this.totaalprijs = totaalprijs;
	}

	public String getBtwCode() {
		return btwCode;
	}

	public void setBtwCode(String btwCode) {
		this.btwCode = btwCode;
	}

	public String getEenheid() {
		return eenheid;
	}

	public void setEenheid(String eenheid) {
		this.eenheid = eenheid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FactuurRegel)) {
			return false;
		}
		FactuurRegel other = (FactuurRegel) obj;
		return Objects.equals(btwCode, other.btwCode) && Objects.equals(eenheid, other.eenheid)
				&& Double.doubleToLongBits(hoeveelheid) == Double.doubleToLongBits(other.hoeveelheid)
				&& productID == other.productID && Objects.equals(productnaam, other.productnaam)
				&& Double.doubleToLongBits(totaalprijs) == Double.doubleToLongBits(other.totaalprijs);
	}
}
