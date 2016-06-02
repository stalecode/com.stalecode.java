package com.stalecode.core.validate;

import com.stalecode.core.java.lang.ExceptionMessage;

public abstract class ObjectRequirement<T> extends Requirement<T> {

	private static final long serialVersionUID = -3439172657650054957L;

	protected ObjectRequirement(final T value) {
		super(value);
	}

	protected abstract ExceptionMessage<? extends RuntimeException> createExceptionMessage(
			final String exceptionMessage);

	public abstract ObjectRequirement<T> requireNotNull();

	@SuppressWarnings("unchecked")
	public <R extends ObjectRequirement<T>> R requireNotNull(
			final ExceptionMessage<? extends RuntimeException> message) {
		if (!getValue().isPresent()) {
			throw new Argument<>(message).requireNotNull("Message required").get().toException();
		}
		return (R) this;
	}

	@SuppressWarnings("unchecked")
	public <R extends ObjectRequirement<T>> R requireNotNull(final String exceptionMessage) {
		return (R) requireNotNull(createExceptionMessage(exceptionMessage));
	}

}
