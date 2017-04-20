package com.stalecode.java.lang;

import static java.util.Optional.ofNullable;

import java.io.Serializable;

import com.stalecode.core.validate.ArgumentExceptionMessage;

public class Immutable<T extends Comparable<T>> implements Serializable, Comparable<Immutable<T>> {

	private static final long serialVersionUID = -6458577753960520489L;

	private final T value;

	protected Immutable(final T value) {
		this.value = ofNullable(value)
				.orElseThrow(() -> ArgumentExceptionMessage.valueOf("Immutable value required").toException());
	}

	@Override
	public int compareTo(final Immutable<T> o) {
		return getValue().compareTo(o.getValue());
	}

	@Override
	public boolean equals(final Object obj) {
		final boolean result;
		if (obj == null) {
			result = false;
		} else if (obj == this) {
			result = true;
		} else {
			result = obj.getClass().equals(getClass()) ? ((Immutable<?>) obj).getValue().equals(getValue()) : false;
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
