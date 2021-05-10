package sortingMethods;

import java.util.*;

/**
 *  HeapSort class sorts an Comparable array using Heap sort algorithm.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class HeapSort implements SortingAlgorithms {

	/**
	 * Sorts the Comparable array shapes implementing Heap sort.
	 * 
	 * @param shapes - Comparable array of shapes
	 * @param comparator - Comparator interface.
	 */
	@Override
	public void sortItems(Comparable[] shapes, Comparator comparator) {
		
		int n = shapes.length;
		
		//Build heap (rearrange array)
		for (int i = n/ 2 - 1; i >= 0; i--)
			heapify(shapes, comparator, n, i);
		
		//One by one extract an element from heap
		for (int i = n - 1; i > 0; i--) {
			//Move current root to end
			Comparable temp = shapes[0];
			shapes[0] = shapes [i];
			shapes[i] = temp;
			
			//Call max heapify on the reduced heap
			heapify(shapes, comparator, i, 0);
		}
	}
	
	/**
	 * To heapify a subtree rooted with node i which is an index in shapes[].
	 * n is size of heap.
	 * 
	 * @param shapes - Comparable array of shapes
	 * @param comparator - Comparator interface.
	 * @param n - Size of heap/ size of shapes[]
	 * @param i - node.
	 */
	void heapify(Comparable[] shapes, Comparator comparator, int n, int i) {
		
		//Initialize largest as root
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if (comparator != null) {
			//If left child is larger than root
			if (left < n && (comparator.compare(shapes[left], shapes[largest]) >= 0) ) 
				largest = left;
			
			//If right child is larget than largest so far
			if ( right < n && (comparator.compare(shapes[right], shapes[largest]) >= 0)) 
				largest = right;
		} else {
			//If left child is larger than root
			if ( left < n && (shapes[left].compareTo(shapes[largest]) >= 0)) 
				largest = left;
			
			//If right child is larget than largest so far
			if ( right < n && (shapes[right].compareTo(shapes[largest]) >= 0)) 
				largest = right;
		}
		
		
		//If largest is not root
		if (largest != i) {
			Comparable swap = shapes [i];
			shapes[i] = shapes[largest];
			shapes[largest] = swap;
			
			//Recursively heapify the affected sub-tree
			heapify (shapes, comparator, n, largest);
		}
	}

}
