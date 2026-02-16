package com.study.mygenerics;

import java.util.Arrays;

public class GenericBounded<T extends Number> extends MyList {

	public void sort() {
		Arrays.sort(array);
	}
}
