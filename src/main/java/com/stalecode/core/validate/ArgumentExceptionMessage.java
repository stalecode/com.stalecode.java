package com.stalecode.core.validate;

import com.stalecode.core.java.lang.ExceptionMessage;

public class ArgumentExceptionMessage extends ExceptionMessage<IllegalArgumentException> {

	public static ArgumentExceptionMessage DEFAULT = valueOf("Legal argument required");
	private static final long serialVersionUID = -4964991984773509615L;

	public static ArgumentExceptionMessage valueOf(final String text) {
		return new ArgumentExceptionMessage(text);
	}

	protected ArgumentExceptionMessage(final String value) {
		super(value);
	}

	@Override
	public IllegalArgumentException toException() {
		return new IllegalArgumentException(getValue());
	}

	@Override
	public IllegalArgumentException toException(final Throwable cause) {
		return new IllegalArgumentException(getValue(), cause);
	}

}
