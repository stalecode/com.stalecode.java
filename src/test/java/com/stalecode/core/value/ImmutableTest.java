package com.stalecode.core.value;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;

public class ImmutableTest {

	@Test
	public void test() {
		try {
			// throw exception
			new Immutable<>(null);
			fail("Should have thrown exception");
		} catch (final IllegalArgumentException cause) {
			assertEquals("Immutable value required", cause.getMessage());
		}
	}

	@Test
	public void testEquals() {
		final Object value = new Object();
		final Immutable<Object> testable = new Immutable<>(value);
		assertFalse(testable.equals(null));
		assertTrue(testable.equals(testable));
		assertTrue(testable.equals(new Immutable<>(value)));
		assertFalse(testable.equals(new Object()));
	}

	@Test
	public void testGetValue() {
		final Object value = new Object();
		assertEquals(value, new Immutable<>(value).getValue());
	}

	@Test
	public void testHashCode() {
		final String value = UUID.randomUUID().toString();
		assertEquals(value.hashCode(), new Immutable<>(value).hashCode());
	}

	@Test
	public void testToString() {
		final String value = UUID.randomUUID().toString();
		assertEquals(value, new Immutable<>(value).toString());
	}

}
