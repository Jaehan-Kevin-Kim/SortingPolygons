package sortingMethods;

import java.util.Comparator;

/**
 *  Selection Sort class. This class works to sort objects via selection Sort algorithm.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class SelectionSort implements SortingAlgorithms {

	
	/**
	 * Sorts the Comparable array shapes implementing selection sort.
	 * 
	 * @param shapes - Comparable array of shapes
	 * @param comparator - Comparator interface.
	 */
	@Override
	public void sortItems(Comparable[] shapes, Comparator comparator) {
		
		//One by one move boundary of unsorted subarray
		for (int i=0; i < shapes.length-1; i++) {
			
			//find the minimum element in unsorted array
			int minIndex = i;
			for (int j = i+1; j < shapes.length; j++) {
				
				if (comparator != null) {
					if (comparator.compare(shapes[j], shapes[minIndex]) <= 0){
						minIndex = j;
					}
				} else if ((shapes[j]).compareTo(shapes[minIndex]) <= 0)
				
	                    minIndex = j;
	               
			}
			 //swap the found minimum element with the first element
			Comparable tmp = shapes[minIndex];
			shapes[minIndex] = shapes[i];
			shapes[i] = tmp;
		}
		

	}

}
