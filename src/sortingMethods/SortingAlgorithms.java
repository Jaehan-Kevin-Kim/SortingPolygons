package sortingMethods;

import java.util.Comparator;

/**
 * Sorting Algorithm interface. This is a parent interface for sorting algorithm
 * classes..
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public interface SortingAlgorithms {
	public abstract void sortItems(Comparable[] shapes, Comparator comparator);

}
