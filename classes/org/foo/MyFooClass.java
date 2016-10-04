package org.foo;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

public class MyFooClass {

	public boolean negate(Boolean b) {
		return BooleanUtils.negate(b);
	}
	
	public String capitalize(String s) {
		return StringUtils.capitalize(s);
	}
}
