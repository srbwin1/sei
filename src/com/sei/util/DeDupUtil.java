package com.sei.util;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeDupUtil {

	/**
	 * This method is used to remove the duplicate values from an integer array
	 * along with retaining the order the elements have been entered in the
	 * integer array
	 * 
	 * @param ints
	 */
	public static Set<Integer> removeDupicateFromOrderedIntArray(int[] ints) {
		Set<Integer> setInteger = new LinkedHashSet<Integer>();
		for (int i = 0; i < ints.length; i++) {
			setInteger.add(ints[i]);
		}
		return setInteger;
	}

	/**
	 * This method is used to remove the duplicate values from an integer array
	 * only without a watch on order
	 * 
	 * @param ints
	 */
	public static Set<Integer> removeDupicateFromIntArray(int[] ints) {
		Set<Integer> uniqueSet = new HashSet<>();
		for (int i = 0; i < ints.length; i++) {
			uniqueSet.add(ints[i]);
		}
		return uniqueSet;
	}

	/**
	 * This method is used to remove the duplicate values from an integer array
	 * along with sorting the array based on the value
	 * 
	 * @param ints
	 */
	public static Set<Integer> removeDupicateElementsWithSort(int[] ints) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int i : ints) {
			set.add(i);
		}
		return set;
	}

	public DeDupUtil() {
		super();
	}

}