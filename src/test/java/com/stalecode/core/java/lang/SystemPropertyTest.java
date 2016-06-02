package com.stalecode.core.java.lang;

import static java.util.Optional.empty;
import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import com.stalecode.core.java.lang.SystemProperty;

public class SystemPropertyTest {

	@Test
	public void testEmpty() {
		assertEquals(empty(), SystemProperty.valueOf(UUID.randomUUID().toString()).getPropertyValue());
	}

	@Test
	public void testValue() {
		final String key = UUID.randomUUID().toString();
		final String value = UUID.randomUUID().toString();
		System.setProperty(key, value);
		try {
			assertEquals(value, SystemProperty.valueOf(key).getPropertyValue().get().toString());
		} finally {
			System.clearProperty(key);
		}
	}

}
