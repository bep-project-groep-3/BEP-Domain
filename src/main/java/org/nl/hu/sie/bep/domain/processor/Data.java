package org.nl.hu.sie.bep.domain.processor;

import java.util.List;

import org.bson.Document;

public class Data {
    public String Straat;
    public String Type;
    public String Huisnummer;
    public String postcode;
    public String plaats;
    public String BIC;

    public int KlantID;
    public int PersoonID;

    public String Bedrijfsnaam;
    public String Rechtsvorm;
    public String VAT;
    public String BankRek;
    public String Giro;
    public String Bik;
    public String Voornaam;
    public String Tussenvoegsel;
    public String Achternaam;
    public String Telefoon;
    public String Fax;
    public String Geslacht;
    public String note;
    public List<Document> invoiceLines;
}