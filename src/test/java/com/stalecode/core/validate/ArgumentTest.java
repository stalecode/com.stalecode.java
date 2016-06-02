package com.stalecode.core.validate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ArgumentTest {

	@Test
	public void requireNotNull() {
		final Object obj = new Object();
		assertEquals(obj, new Argument<>(obj).requireNotNull().get());
		try {
			new Argument<>(null)
					// throw exception
					.requireNotNull();
			fail("Should have thrown exception");
		} catch (final IllegalArgumentException cause) {
			assertEquals("Argument required", cause.getMessage());
		}
	}

	@Test
	public void test() {
		assertNull(new Argument<>(null).get());
	}

}
