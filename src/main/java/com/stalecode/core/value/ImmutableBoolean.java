package com.stalecode.core.value;

public class ImmutableBoolean extends Immutable<Boolean> {

	public static final ImmutableBoolean FALSE = new ImmutableBoolean(Boolean.FALSE);
	private static final long serialVersionUID = 6798249765628034422L;
	public static final ImmutableBoolean TRUE = new ImmutableBoolean(Boolean.TRUE);

	public static ImmutableBoolean valueOf(final String text) {
		return new ImmutableBoolean(Boolean.parseBoolean(text));
	}

	protected ImmutableBoolean(final Boolean value) {
		super(value);
	}

	public Boolean toBoolean() {
		return getValue();
	}

}
