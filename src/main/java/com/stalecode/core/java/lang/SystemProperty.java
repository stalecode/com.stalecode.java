package com.stalecode.core.java.lang;

import static java.util.Optional.ofNullable;

import java.util.Optional;

import com.stalecode.core.java.util.PropertyKey;
import com.stalecode.core.java.util.PropertyValue;

public class SystemProperty extends PropertyKey {

	public static final SystemProperty FILE_SEPARATOR = SystemProperty.valueOf("file.separator");
	public static final SystemProperty JAVA_CLASS_PATH = SystemProperty.valueOf("java.class.path");
	public static final SystemProperty JAVA_HOME = SystemProperty.valueOf("java.home");
	public static final SystemProperty JAVA_VENDOR = SystemProperty.valueOf("java.vendor");
	public static final SystemProperty JAVA_VENDOR_URL = SystemProperty.valueOf("java.vendor.url");
	public static final SystemProperty JAVA_VERSION = SystemProperty.valueOf("java.version");
	public static final SystemProperty LINE_SEPARATOR = SystemProperty.valueOf("line.separator");
	public static final SystemProperty OS_ARCH = SystemProperty.valueOf("os.arch");
	public static final SystemProperty OS_NAME = SystemProperty.valueOf("os.name");
	public static final SystemProperty OS_VERSION = SystemProperty.valueOf("os.version");
	public static final SystemProperty PATH_SEPARATOR = SystemProperty.valueOf("path.separator");
	private static final long serialVersionUID = 10704846743705490L;
	public static final SystemProperty USER_DIR = SystemProperty.valueOf("user.dir");
	public static final SystemProperty USER_HOME = SystemProperty.valueOf("user.home");
	public static final SystemProperty USER_NAME = SystemProperty.valueOf("user.name");

	public static SystemProperty valueOf(final String value) {
		return new SystemProperty(value);
	}

	protected SystemProperty(final String value) {
		super(value);
	}

	public Optional<PropertyValue> getPropertyValue() {
		return ofNullable(System.getProperty(getValue(), null)).map(PropertyValue::valueOf);
	}

}
