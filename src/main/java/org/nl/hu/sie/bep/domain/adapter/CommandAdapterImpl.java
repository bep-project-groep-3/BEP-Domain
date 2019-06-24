package org.nl.hu.sie.bep.domain.adapter;

import java.util.List;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.domain.processor.Processor;

public class CommandAdapterImpl implements CommandAdapter{
	private LoadAdapterImpl loadAdapter= new LoadAdapterImpl();
	private IEFGeneratorAdapterImpl IefGenerator= new IEFGeneratorAdapterImpl();
	
	private Processor proccesor;
	@Override
    public void createIEFFilesFromMonthNumber(int month) {
    	List<Data> data=loadAdapter.returnDataFromMonth(month);
    	Bedrijf bedrijfObject=proccesor.process(data);
    	IefGenerator.generate(month,bedrijfObject);
    }
    
}
