package com.stalecode.core.value;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stalecode.core.value.ImmutableBoolean;

public class ImmutableBooleanTest {

	@Test
	public void test() {
		assertEquals(Boolean.TRUE, ImmutableBoolean.valueOf("true").toBoolean());
	}

}
