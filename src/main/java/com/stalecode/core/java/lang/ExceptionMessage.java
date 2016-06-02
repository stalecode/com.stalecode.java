package com.stalecode.core.java.lang;

import com.stalecode.core.value.ImmutableString;

public abstract class ExceptionMessage<T extends Exception> extends ImmutableString {

	private static final long serialVersionUID = -2224894813835788805L;

	protected ExceptionMessage(final String value) {
		super(value);
	}

	public abstract T toException();

	public abstract T toException(final Throwable cause);

}
