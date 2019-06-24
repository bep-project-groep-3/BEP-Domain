package org.nl.hu.sie.bep.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.nl.hu.sie.bep.domain.domain.Adres;
import org.nl.hu.sie.bep.domain.domain.Persoon;

public class TestEquals {
	@Test 
	public void testEqualsPersoon() {
		Persoon p= new Persoon(1, "1", "1", "1", "1", "1", "1", 1);
		Persoon p2= new Persoon(1, "1", "1", "1", "1", "1", "1", 1);
		assertEquals(p,p2);
	};
	@Test
	public void testEqualsAdres() {
		Adres a= new Adres("1", "1", "1", "1", "1", "1", 7);
		Adres a2= new Adres("1", "1", "1", "1", "1", "1", 6);
		assertNotEquals(a,a2);
	}
}
