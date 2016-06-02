package com.stalecode.core.java.util;

import static java.util.Optional.empty;
import static org.junit.Assert.assertEquals;

import java.util.Properties;
import java.util.UUID;

import org.junit.Test;

public class PropertyKeyTest {

	@Test
	public void testEmpty() {
		assertEquals(empty(), PropertyKey.valueOf(UUID.randomUUID().toString()).getProperty(new Properties()));
	}

	@Test
	public void testGetProperty() {
		final PropertyKey testable = PropertyKey.valueOf(UUID.randomUUID().toString());
		final Properties properties = new Properties();
		final PropertyValue value = PropertyValue.valueOf(UUID.randomUUID().toString());
		testable.setProperty(properties).set(value);
		assertEquals(value, testable.getProperty(properties).get());
		testable.setProperty(properties).set(null);
		assertEquals(empty(), testable.getProperty(properties));
	}

}
