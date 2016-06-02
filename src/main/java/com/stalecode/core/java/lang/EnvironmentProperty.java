package com.stalecode.core.java.lang;

import static java.util.Optional.ofNullable;

import java.util.Optional;

import com.stalecode.core.java.util.PropertyKey;
import com.stalecode.core.java.util.PropertyValue;

public class EnvironmentProperty extends PropertyKey {

	private static final long serialVersionUID = 6568665076837859150L;

	public static EnvironmentProperty valueOf(final String value) {
		return new EnvironmentProperty(value);
	}

	protected EnvironmentProperty(final String value) {
		super(value);
	}

	public Optional<PropertyValue> getPropertyValue() {
		return ofNullable(System.getenv(getValue())).map(PropertyValue::valueOf);
	}

}
