package org.nl.hu.sie.bep.domain.adapter;

import java.util.List;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.domain.processor.processor;

public class CommandAdapterImpl implements CommandAdapter{
   //domainAdapter.createIEFFilesFromMonthNumber(12);
	//TODO create adapter impls
	private LoadAdapterImpl loadAdapter= new LoadAdapterImpl();
	private IEFGeneratorAdapterImpl IEFGenerator= new IEFGeneratorAdapterImpl();
	
	private processor proccesor;
	@Override
    public void createIEFFilesFromMonthNumber(int month) {
    	List<Data> data=loadAdapter.returnDataFromMonth(month);
    	Bedrijf bedrijfObject=proccesor.process(data);
    	IEFGenerator.generate(month,bedrijfObject);
    }
    
}