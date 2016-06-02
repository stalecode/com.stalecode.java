package com.stalecode.core.validate;

public class State<T> extends ObjectRequirement<T> {

	private static final long serialVersionUID = -5520953372747975817L;

	public State(final T value) {
		super(value);
	}

	@Override
	protected StateExceptionMessage createExceptionMessage(final String exceptionMessage) {
		return StateExceptionMessage.valueOf(exceptionMessage);
	}

	@Override
	public State<T> requireNotNull() {
		return requireNotNull("State required");
	}

}
