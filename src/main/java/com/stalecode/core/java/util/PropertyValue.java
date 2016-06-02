package com.stalecode.core.java.util;

import com.stalecode.core.value.ImmutableString;

public class PropertyValue extends ImmutableString {

	private static final long serialVersionUID = 7778189971393091531L;

	public static PropertyValue valueOf(final String value) {
		return new PropertyValue(value);
	}

	protected PropertyValue(final String value) {
		super(value);
	}

}
