package com.stalecode.core.value;

public class ImmutableString extends Immutable<String> {

	public static ImmutableString EMPTY = valueOf("");
	private static final long serialVersionUID = -6408447280481204229L;

	public static ImmutableString valueOf(final String text) {
		return new ImmutableString(text);
	}

	protected ImmutableString(final String value) {
		super(value);
	}

	@Override
	public String toString() {
		return getValue().toString();
	}

}
