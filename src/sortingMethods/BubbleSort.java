package sortingMethods;

import java.util.Comparator;

import shape.Shape;
import sortingMethods.SortingAlgorithms;

/**
 * Bubble Sort class. This class works to sort objects via selection Sort
 * algorithm.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 27, 2021
 */
public class BubbleSort implements SortingAlgorithms {

	/**
	 * Sorts the Comparable array shapes implementing Bubble sort.
	 * 
	 * @param shapes - Comparable array of shapes
	 * @param comparator - Comparator interface.
	 */
	@Override
	public void sortItems(Comparable[] shapes, Comparator comparator) {
		
		int n = shapes.length;
		
		for (int i = 0; i < n - 1; i++) 
			for (int j = 0; j < n - i - 1; j++) {
				
				if ((comparator != null)) {
					 
					if (comparator.compare(shapes[j], shapes[j+1]) >= 0) {
						//swap shapes[j+1] and shapes[j]
						Comparable tmp = shapes[j];
						shapes[j] = shapes[j+1];
						shapes[j+1] = tmp;
					}
				} else {
					if (shapes[j].compareTo(shapes[j+1]) >= 0) {
						//swap shapes[j+1] and shapes[j]
						Comparable tmp = shapes[j];
						shapes[j] = shapes[j+1];
						shapes[j+1] = tmp;
					}
				}
			}
		
	}

}
