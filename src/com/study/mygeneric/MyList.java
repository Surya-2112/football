package com.study.mygenerics;

import java.util.Arrays;

public class MyList<K> {

	private static int size = 10;
	private int NumberOfValue = 0;
	protected K array[];

	public MyList() {
		this.array = (K[]) new Object[size];
	}

	public void add(K k) {
		if (NumberOfValue == size) {
			AddSize();
		}
		array[NumberOfValue++] = k;
	}

	public void remove(K k) {
		boolean flag = false;
		if (isEmpty()) {
			System.out.println("MYList is Empty");
		}
		int j = 0;
		for (int i = 0; i < NumberOfValue; i++) {
			if (array[i].equals(k)) {
				flag = true;
				continue;
			}
			if (flag) {
				array[j] = array[i];
			}
			j++;
		}
		NumberOfValue=j;
	}

	public void remove(int index) {
		if (isEmpty()) {
			System.out.println("MYList is Empty");
		}
		if (index >= NumberOfValue) {
			System.out.println("IndexOutOfBound");
		}
		for (int i = index; i < NumberOfValue; i++) {
			array[i] = array[i + 1];
		}
		NumberOfValue--;
	}

	private void AddSize() {
		size += 10;
		K newArray[] = (K[]) new Object[size];
		newArray = Arrays.copyOf(array, size);
		array = (K[]) newArray;
		// System.out.println(newArray.length + " " + array.length+" "+size);
	}

	public boolean isEmpty() {
		if (NumberOfValue == 0)
			return true;
		return false;
	}

	public int size() {
		return NumberOfValue;
	}

	public K get(int index) {
		if (index < NumberOfValue) {
			return array[index];
		}
		System.out.println("ArrayIndexOutOfBound");
		return null;
	}

	public static <K> boolean compare(K a, K b) // when we use static method we add Generic type before return type
	{
		return a.equals(b);
	}
	
	public void set(int index,K k)
	{
		if (NumberOfValue == size) {
			AddSize();
		}
		for(int i=NumberOfValue ;i>index;i--)
		{
			array[i]=array[i-1];
		}
		array[index]=k;
	}
}
