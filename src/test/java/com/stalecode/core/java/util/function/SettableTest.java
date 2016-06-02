package com.stalecode.core.java.util.function;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import com.stalecode.core.java.util.function.Settable;

public class SettableTest {

	@Test
	public void test() {
		final String t = UUID.randomUUID().toString();
		new Settable<String>() {

			@Override
			public void set(final String value) {
				assertEquals(t, value);
			}
		}.accept(t);
	}

}
