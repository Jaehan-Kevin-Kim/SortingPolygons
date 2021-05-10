package sortingMethods;

import java.util.Comparator;

/**
 *  Merge Sort class. This class works to sort objects via insertion Sort algorithm.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */

public class MergeSort implements SortingAlgorithms {
	
	/**
	 * Sorts the Comparable array shapes implementing Merge sort.
	 * 
	 * @param shapes     - Comparable array of shapes.
	 * @param comparator - Comparator interface.
	 */
	@Override
	public void sortItems(Comparable[] shapes, Comparator comparator) {
		if (shapes.length <= 1) {
			return;
		}

		// Create sub arrays
		Comparable[] first = new Comparable[shapes.length / 2];
		Comparable[] second = new Comparable[shapes.length - first.length];

		// Copy the first half into first
		for (int i = 0; i < first.length; i++) {
			first[i] = shapes[i];
		}
		// Copy the second half into second
		for (int i = 0; i < second.length; i++) {
			second[i] = shapes[first.length + i];
		}

		//Sort first and second halves
		sortItems(first, comparator);
		sortItems(second, comparator);
		//Merge the sorted halves
		merge(first, second, shapes, comparator);
	}

	/**
	 * Merges two sorted subarrays into an array.
	 * 
	 * @param first      - First sorted array
	 * @param second     - Second sorted array;
	 * @param shapes     - Comparable shapes into which to merge first and second.
	 * @param comparator - Comparator interface.
	 */
	private void merge(Comparable[] first, Comparable[] second, Comparable[] shapes, Comparator comparator) {
		// Initial indexes of first and second subarrays
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;

		// Move the smaller element into shapes array
		while (iFirst < first.length && iSecond < second.length) {

			if (comparator != null) {
				if (comparator.compare(first[iFirst], second[iSecond]) <= 0) {
					shapes[j] = first[iFirst];
					iFirst++;
				} else {
					shapes[j] = second[iSecond];
					iSecond++;
				}
			} else {
				if ((first[iFirst].compareTo(second[iSecond]) <= 0)) {
					shapes[j] = first[iFirst];
					iFirst++;
				} else {
					shapes[j] = second[iSecond];
					iSecond++;
				}
			}
			j++;
		}

		// Copy any remaining entries of the first half of shapes
		while (iFirst < first.length) {
			shapes[j] = first[iFirst];
			iFirst++;
			j++;
		}

		// Copy any remaining entries of the second half of shapes
		while (iSecond < second.length) {
			shapes[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}
}