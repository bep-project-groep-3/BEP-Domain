package org.nl.hu.sie.bep.domain.adapter;

import java.sql.SQLException;
import java.util.List;

import org.nl.hu.sie.bep.loader.adapter.DatabaseAdapter;
import org.nl.hu.sie.bep.loader.generic.Adapter;
import org.nl.hu.sie.bep.loader.models.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoadAdapterImpl implements Adapter {
	Logger logger = LoggerFactory.getLogger(LoadAdapterImpl.class);
	DatabaseAdapter databaseadadapter= new DatabaseAdapter();

	@Override
	public List<Data> returnDataFromMonth(int month) {
		try {
			return databaseadadapter.returnDataFromMonth(month);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("something went wrong trying to load the data", e);
		}
		return null;
	}
	

}
