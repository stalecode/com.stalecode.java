package com.stalecode.core.value;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import com.stalecode.core.value.ImmutableString;

public class ImmutableStringTest {

	@Test
	public void test() {
		final String value = UUID.randomUUID().toString();
		assertEquals(value, ImmutableString.valueOf(value).toString());
	}

}
