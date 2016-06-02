package com.stalecode.core.java.lang;

import static java.util.Optional.empty;
import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import com.stalecode.core.java.lang.EnvironmentProperty;

public class EnvironmentPropertyTest {

	@Test
	public void testEmpty() {
		assertEquals(empty(), EnvironmentProperty.valueOf(UUID.randomUUID().toString()).getPropertyValue());
	}

}
