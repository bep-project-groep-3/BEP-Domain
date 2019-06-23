package org.nl.hu.sie.bep.domain.adapter;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.dto.Row;
import org.nl.hu.sie.bep.adapter.IEFGenerator;
import org.nl.hu.sie.bep.adapter.IEFGeneratorAdapter;

public class IEFGeneratorImpl implements IEFGeneratorAdapter {

	@Override
	public Row generate(int month, Bedrijf bedrijfObject) {
		IEFGenerator ief= new IEFGenerator();
		ief.generate(month,bedrijfObject);
		return null;
	}
	

}
