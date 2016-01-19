/** 
 * The DeDup class implements an application that
 * simply removes the duplicate primitive int elements from an array along with managing the elements order.
 */

//Update and enable the package as per actual production package hierarchy.
package com.sei.tech;

import java.util.Set;
import java.util.TreeSet;

import com.sei.util.DeDupUtil;

/**
 * @author srbwin
 * @version 1.0
 *
 */
public class DeDup extends DeDupUtil {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	/**
	 * Main method which demonstrates and displays the unique array element
	 * implementation based on the selection of required sorting util method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DeDup deDup = new DeDup();

		Set<Integer> uniqueOrderedElementSet = removeDupicateFromOrderedIntArray(deDup.randomIntegers);
		System.out.println(uniqueOrderedElementSet);

		Set<Integer> uniqueElementUnorderedSet = removeDupicateFromIntArray(deDup.randomIntegers);
		System.out.println(uniqueElementUnorderedSet);

		Set<Integer> sortedElementArray = removeDupicateElementsWithSort(deDup.randomIntegers);
		System.out.println(sortedElementArray);

		// Displays the elements in reverse order based on the TreeSet property
		System.out.println(((TreeSet<Integer>) sortedElementArray).descendingSet());

	}
}
