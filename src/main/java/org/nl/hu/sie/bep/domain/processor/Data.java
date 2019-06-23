//package org.nl.hu.sie.bep.domain.processor;
//
//import java.util.List;
//
//import org.bson.Document;
//
//public class Data {
//    public String Straat;
//    public String Type;
//    public String Huisnummer;
//    public String postcode;
//    public String plaats;
//    public String BIC;
//
//    public int KlantID;
//    public int PersoonID;
//
//    public String Bedrijfsnaam;
//    public String Rechtsvorm;
//    public String VAT;
//    public String BankRek;
//    public String Giro;
//    public String Bik;
//    public String Voornaam;
//    public String Tussenvoegsel;
//    public String Achternaam;
//    public String Telefoon;
//    public String Fax;
//    public String Geslacht;
//    public String note;
//    public List<Document> invoiceLines;
//    public java.util.Date Date;
//    public double InvoiceID;
//    
//    
//    
//	
//	public Data(String straat, String type, String huisnummer, String postcode, String plaats, String bIC, int klantID,
//			int persoonID, String bedrijfsnaam, String rechtsvorm, String vAT, String bankRek, String giro, String bik,
//			String voornaam, String tussenvoegsel, String achternaam, String telefoon, String fax, String geslacht,
//			String note, List<Document> invoiceLines, java.util.Date date, double invoiceID) {
//		super();
//		Straat = straat;
//		Type = type;
//		Huisnummer = huisnummer;
//		this.postcode = postcode;
//		this.plaats = plaats;
//		BIC = bIC;
//		KlantID = klantID;
//		PersoonID = persoonID;
//		Bedrijfsnaam = bedrijfsnaam;
//		Rechtsvorm = rechtsvorm;
//		VAT = vAT;
//		BankRek = bankRek;
//		Giro = giro;
//		Bik = bik;
//		Voornaam = voornaam;
//		Tussenvoegsel = tussenvoegsel;
//		Achternaam = achternaam;
//		Telefoon = telefoon;
//		Fax = fax;
//		Geslacht = geslacht;
//		this.note = note;
//		this.invoiceLines = invoiceLines;
//		Date = date;
//		InvoiceID = invoiceID;
//	}
//	
//	public String getStraat() {
//		return Straat;
//	}
//	public String getType() {
//		return Type;
//	}
//	public String getHuisnummer() {
//		return Huisnummer;
//	}
//	public String getPostcode() {
//		return postcode;
//	}
//	public String getPlaats() {
//		return plaats;
//	}
//	public String getBIC() {
//		return BIC;
//	}
//	public int getKlantID() {
//		return KlantID;
//	}
//	public int getPersoonID() {
//		return PersoonID;
//	}
//	public String getBedrijfsnaam() {
//		return Bedrijfsnaam;
//	}
//	public String getRechtsvorm() {
//		return Rechtsvorm;
//	}
//	public String getVAT() {
//		return VAT;
//	}
//	public String getBankRek() {
//		return BankRek;
//	}
//	public String getGiro() {
//		return Giro;
//	}
//	public String getBik() {
//		return Bik;
//	}
//	public String getVoornaam() {
//		return Voornaam;
//	}
//	public String getTussenvoegsel() {
//		return Tussenvoegsel;
//	}
//	public String getAchternaam() {
//		return Achternaam;
//	}
//	public String getTelefoon() {
//		return Telefoon;
//	}
//	public String getFax() {
//		return Fax;
//	}
//	public String getGeslacht() {
//		return Geslacht;
//	}
//	public String getNote() {
//		return note;
//	}
//	public List<Document> getInvoiceLines() {
//		return invoiceLines;
//	}
//	public java.util.Date getDate() {
//		return Date;
//	}
//	public double getInvoiceID() {
//		return InvoiceID;
//	}  
//    
//}