package org.nl.hu.sie.bep.domain.adapter;

import java.util.List;

import org.nl.hu.sie.bep.domain.processor.Data;

public interface LoadAdapter {
	
	public List<Data> getDataFromMonthNumber(int monthnumber);

}
