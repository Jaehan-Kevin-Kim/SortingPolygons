package sortingMethods;

import java.util.Comparator;

import shape.Shape;

/**
 * Insertion Sort class. This class works to sort objects via insertion Sort
 * algorithm.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 27, 2021
 */

public class InsertionSort implements SortingAlgorithms {

	/**
	 * Sorts the Comparable array shapes implementing insertion sort.
	 * 
	 * @param shapes - Comparable array of shapes.
	 * @param comparator - Comparator interface.
	 */
	@Override
	public void sortItems(Comparable[] shapes, Comparator comparator) {
		for (int i = 0; i < shapes.length; i++) {
			Comparable key = shapes[i];

			int j = i - 1;
			
			//Move elements of shapes[0..i-1] that are greater than key, to one position ahead of their current position
			if (comparator != null) {
				while (j >= 0 && comparator.compare(shapes[j], key) >= 0) {
					shapes[j + 1] = shapes[j];
					j--;
				}
			} else {
				while (j >= 0 && (shapes[j]).compareTo(key) >= 0) {
					shapes[j + 1] = shapes[j];
					j--;
				}
			}
			
			shapes[j + 1] = key;
		}

	}

}
