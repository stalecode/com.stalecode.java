package com.stalecode.core.validate;

public class Argument<T> extends ObjectRequirement<T> {

	private static final long serialVersionUID = -1234741684090451641L;

	public Argument(final T value) {
		super(value);
	}

	@Override
	protected ArgumentExceptionMessage createExceptionMessage(final String exceptionMessage) {
		return ArgumentExceptionMessage.valueOf(exceptionMessage);
	}

	@Override
	public Argument<T> requireNotNull() {
		return requireNotNull("Argument required");
	}

}
