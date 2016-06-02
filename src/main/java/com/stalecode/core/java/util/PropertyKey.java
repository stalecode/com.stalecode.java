package com.stalecode.core.java.util;

import static java.util.Optional.ofNullable;

import java.util.Optional;
import java.util.Properties;

import com.stalecode.core.java.util.function.Settable;
import com.stalecode.core.validate.Argument;
import com.stalecode.core.value.ImmutableString;

public class PropertyKey extends ImmutableString {

	private static final long serialVersionUID = -9176553542804313293L;

	public static PropertyKey valueOf(final String value) {
		return new PropertyKey(value);
	}

	protected PropertyKey(final String value) {
		super(value);
	}

	public Optional<PropertyValue> getProperty(final Properties source) {
		new Argument<>(source).requireNotNull("Property source required");
		return ofNullable(source.getProperty(getValue(), null)).map(PropertyValue::valueOf);
	}

	public Settable<PropertyValue> setProperty(final Properties target) {
		new Argument<>(target).requireNotNull("Property target required");
		return new Settable<PropertyValue>() {

			@Override
			public void set(final PropertyValue value) {
				if (value == null) {
					target.remove(getValue());
				} else {
					target.setProperty(getValue(), value.toString());
				}
			}
		};
	}

}
