package utilities;

import java.util.Comparator;

import shape.BaseAreaComparator;
import shape.Shape;
import shape.VolumeComparator;
import sortingMethods.SortingAlgorithms;

/**
 * Utility class. It will sort a collection of comparables and implement sorting
 * algorithms.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 27, 2021
 */
public class Utility {

	/**
	 * Method to implement actual sorting and print the result.
	 * 
	 * @param shapes     : Shape type.
	 * @param sA         : Selected sorting algorithm.
	 * @param comparator : Comparision standard for sorting.
	 */
	public static void sort(Comparable[] shapes, SortingAlgorithms sA, Comparator comparator) {

		double startTime = System.currentTimeMillis();

		/**
		 * Call the sortItems method to sort.
		 */
		sA.sortItems(shapes, comparator);
		
		double finishTime = System.currentTimeMillis();

		double timeSpent = finishTime - startTime;
		double sorted = 0;
		System.out.println("Print values\n");
		System.out.println("total number of shapes: " + shapes.length);

		int index = 1;
		for (Comparable item : shapes) {
			if (comparator instanceof BaseAreaComparator) {
				sorted = ((Shape) item).calcBaseArea();
			} else if (comparator instanceof VolumeComparator) {
				sorted = ((Shape) item).calcVolume();
			} else {
				sorted = ((Shape) item).getHeight();
			}

			if (index == 1) {
				System.out.println("First (" + index + "st): " + sorted);
			}
			if (index % 1000 == 0 && index != 1) {
				System.out.println(index + "th: " + sorted);

			}
			if (index == shapes.length) {
				System.out.println("Last (" + index + "th): " + sorted);

			}
			index++;

		}
		System.out.printf("\nTotal time spent for sorting: %.4f Seconds\n", timeSpent / 1000);

	}

}
