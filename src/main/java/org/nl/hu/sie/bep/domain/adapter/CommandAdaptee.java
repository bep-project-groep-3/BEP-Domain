package org.nl.hu.sie.bep.domain.adapter;

import java.util.List;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.domain.processor.Data;
import org.nl.hu.sie.bep.domain.processor.processor;

public class CommandAdaptee implements CommandAdapter{
   //domainAdapter.createIEFFilesFromMonthNumber(12);
	//TODO create adapter impls
	private LoadAdapterImpl loadAdapter;
	private IEFGeneratorImpl IEFGenerator= new IEFGeneratorImpl();
	
	private processor proccesor;
	@Override
    public void createIEFFilesFromMonthNumber(int month) {
    	List<Data> data=loadAdapter.getDataFromMonthNumber(month);
    	Bedrijf bedrijfObject=proccesor.process(data);
    	IEFGenerator.generate(month,bedrijfObject);
    }
    
}
