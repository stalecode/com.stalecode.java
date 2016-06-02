package com.stalecode.core.value;

import static java.util.Optional.ofNullable;

import java.io.Serializable;

import com.stalecode.core.validate.ArgumentExceptionMessage;

public class Immutable<T> implements Serializable {

	private static final long serialVersionUID = 1515846095597584292L;

	private final T value;

	protected Immutable(final T value) {
		this.value = ofNullable(value).orElseThrow(
				// Delay instantiation of exception message until needed
				() -> ArgumentExceptionMessage.valueOf("Immutable value required").toException());
	}

	@Override
	public boolean equals(final Object obj) {
		final boolean result;
		if (obj == null) {
			result = false;
		} else if (obj == this) {
			result = true;
		} else if (obj.getClass().equals(getClass())) {
			result = ((Immutable<?>) obj).getValue().equals(getValue());
		} else {
			result = false;
		}
		return result;
	}

	protected T getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return getValue().hashCode();
	}

	@Override
	public String toString() {
		return getValue().toString();
	}

}
