package sortingMethods;

import java.util.Comparator;

/**
 *  QuickSort class sorts an Comparable array using quick sort algorithm.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */

public class QuickSort implements SortingAlgorithms{

	/**
	 * Sort method. This method calls the quickSort() method.
	 */
	@Override
	public void sortItems(Comparable[] shapes, Comparator comparator) {
		 quickSort(shapes, comparator, 0, shapes.length-1);	
	}
	
	/**
	 * Sorts the Comparable array shapes implementing quick sort.
	 * 
	 * @param shapes - Comparable array of shapes
	 * @param comparator - Comparator interface.
	 * @param begin - starting index
	 * @param end - ending index
	 */
	public void quickSort(Comparable[] shapes, Comparator comparator, int begin, int end) {
		if (begin < end) {
			int partIndex = partition(shapes, comparator, begin, end);
			
			quickSort(shapes, comparator, begin, partIndex-1);
			quickSort(shapes, comparator, partIndex+1, end);
		}
		
	}
	
	/**
	 * Partition method takes the last element as pivot, places pivot element at 
	 * the correct position in sorted array and places smaller elements to the left and 
	 * greater elements to the right of pivot.
	 * 
	 * @param shapes - array to be sorted
	 * @param comparator - Comparator interface.
	 * @param begin - starting index
	 * @param end - ending index
	 * @return (i+1) final sorted position.
	 */
	private int partition (Comparable[] shapes, Comparator comparator, int begin, int end) {
		
		Comparable pivot = shapes[end];
		//Index of smaller element. Indicates the right position of pivot found so far
		int i = (begin - 1);
		
		for (int j = begin; j < end; j++) {
			
			//if current element is smaller than the pivot
			if (comparator != null) {
				
				if (comparator.compare(shapes[j], pivot) <= 0){
					//Increment index of smaller element
					i++;
					Comparable tmpSwap = shapes [i];
					shapes [i] = shapes [j];
					shapes[j] = tmpSwap;
				}
			} else if ((shapes[j].compareTo(pivot) <= 0)) {
				//Increment index of smaller element
				i++;
				Comparable tmpSwap = shapes [i];
				shapes [i] = shapes [j];
				shapes[j] = tmpSwap;
			}
		
		}
		
		
		Comparable tmpSwap = shapes[i+1];
		shapes[i+1] = shapes[end];
		shapes[end] = tmpSwap;
		return (i + 1);
	}
	
	

}
