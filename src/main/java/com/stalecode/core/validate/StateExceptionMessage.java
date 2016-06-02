package com.stalecode.core.validate;

import com.stalecode.core.java.lang.ExceptionMessage;

public class StateExceptionMessage extends ExceptionMessage<IllegalStateException> {

	public static final StateExceptionMessage DEFAULT = valueOf("Legal state required");
	private static final long serialVersionUID = 1842824439229537250L;

	public static StateExceptionMessage valueOf(final String text) {
		return new StateExceptionMessage(text);
	}

	protected StateExceptionMessage(final String value) {
		super(value);
	}

	@Override
	public IllegalStateException toException() {
		return new IllegalStateException(getValue());
	}

	@Override
	public IllegalStateException toException(final Throwable cause) {
		return new IllegalStateException(getValue(), cause);
	}

}
