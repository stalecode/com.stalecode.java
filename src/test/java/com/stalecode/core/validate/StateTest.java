package com.stalecode.core.validate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StateTest {

	@Test
	public void requireNotNull() {
		final Object obj = new Object();
		assertEquals(obj, new State<>(obj).requireNotNull().get());
		try {
			new State<>(null)
					// throw exception
					.requireNotNull();
			fail("Should have thrown exception");
		} catch (final IllegalStateException cause) {
			assertEquals("State required", cause.getMessage());
		}
	}

	@Test
	public void test() {
		assertNull(new State<>(null).get());
	}

}
