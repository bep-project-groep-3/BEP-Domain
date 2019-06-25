package org.nl.hu.sie.bep.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.nl.hu.sie.bep.domain.adapter.CommandAdapterImpl;

public class TestAdapters {
	@Test
	public void testCommandAdapterCreate() {
		CommandAdapterImpl impl= new CommandAdapterImpl();
		impl.createIEFFilesFromMonthNumber(1);
		assertNotNull(impl);
	}
}
