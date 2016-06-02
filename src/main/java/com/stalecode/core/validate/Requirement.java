package com.stalecode.core.validate;

import static java.util.Optional.ofNullable;

import java.util.Optional;

import com.stalecode.core.java.util.function.Gettable;
import com.stalecode.core.value.Immutable;

public class Requirement<T> extends Immutable<Optional<T>> implements Gettable<T> {

	private static final long serialVersionUID = 1035346202739234976L;

	protected Requirement(final T value) {
		super(ofNullable(value));
	}

	@Override
	public T get() {
		return getValue().orElse(null);
	}

}
