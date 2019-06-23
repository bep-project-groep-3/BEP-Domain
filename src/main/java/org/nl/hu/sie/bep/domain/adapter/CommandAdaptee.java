package org.nl.hu.sie.bep.domain.adapter;

import java.util.List;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.domain.processor.Data;
import org.nl.hu.sie.bep.domain.processor.processor;

public class CommandAdaptee {
   //domainAdapter.createIEFFilesFromMonthNumber(12);
	//TODO create adapter impls
	private LoadAdapterImpl loadAdapter;
	private IEFGeneratorImpl IEFGenerator;
	
	private processor proccesor;
	
    public void createIEFFilesFromMonthNumber(int month) {
    	List<Data> data=loadAdapter.getDataFromMonthNumber(month);
    	Bedrijf bedrijfObject=proccesor.process(data);
    	IEFGenerator.createIEFFilesFromObject(bedrijfObject);
    }
    
}
