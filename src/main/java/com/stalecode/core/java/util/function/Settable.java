package com.stalecode.core.java.util.function;

import java.util.function.Consumer;

public interface Settable<T> extends Consumer<T> {

	@Override
	default void accept(T t) {
		set(t);
	}

	void set(T value);

}
