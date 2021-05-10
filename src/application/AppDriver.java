package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;

import shape.*;
import sortingMethods.*;
import utilities.Utility;

/**
 * AppDriver class for this application. It will load a file from the local
 * storage to sort a number of shapes by height, base area or volume. Also user
 * can choose a sorting algorithm among merge, insert, selection, quick, bubble
 * and bucket to sort.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class AppDriver {

	/**
	 * Launcher of this program.
	 * 
	 * @param args - Arguments requested by user input.
	 */
	public static void main(String[] args) {

		String filename = "";
		Comparator comparator = null;
		SortingAlgorithms sA = null;
		String printDetails = "";

		for (int i = 0; i < args.length; i++) {

			char indicator = args[i].charAt(0);

			if (indicator != '-') {
				continue;
			}

			char option = args[i].charAt(1);
			String optionDetails = args[i].substring(2);
			char compareSortType = optionDetails.charAt(0);

			// File name checker
			if (option == 'f' || option == 'F') {
				printDetails = optionDetails + " file is loaded";
				filename = optionDetails;
			} // Compare type checker
			else if (option == 't' || option == 'T') {
				if (compareSortType == 'h' || compareSortType == 'H') {

					printDetails = "Compared by Height";
					comparator = null;
				} else if (compareSortType == 'v' || compareSortType == 'V') {
					printDetails = "Compared by volume";
					comparator = new VolumeComparator();
				} else if (compareSortType == 'a' || compareSortType == 'A') {
					printDetails = "Compared by Base Area";
					comparator = new BaseAreaComparator();
				}
				// Sorting type checker
			} else if (option == 's' || option == 'S') {
				if (compareSortType == 'b' || compareSortType == 'B') {
					printDetails = "Sorted by Bubble Sort";
					sA = new BubbleSort();
				} else if (compareSortType == 's' || compareSortType == 'S') {
					printDetails = "Sorted by Selection Sort";
					sA = new SelectionSort();
				} else if (compareSortType == 'i' || compareSortType == 'I') {
					printDetails = "Sorted by Insertion Sort";
					sA = new InsertionSort();
				} else if (compareSortType == 'm' || compareSortType == 'M') {
					printDetails = "Sorted by Insertion Sort";
					sA = new MergeSort();
				} else if (compareSortType == 'q' || compareSortType == 'Q') {
					printDetails = "Sorted by Quick Sort";
					sA = new QuickSort();
				} else if (compareSortType == 'z' || compareSortType == 'Z') {
					printDetails = "Sorted by My Sort: Heap Sort";
					sA = new HeapSort();
				}
			}
			System.out.println(printDetails);
		}

		/**
		 * Load and read a text file to assign and store appropriate comparison
		 * classes.
		 */

		if (!(filename == null && sA == null)) {
			try {
				Scanner scanner = new Scanner(new File(filename));

				int numOfShapes = scanner.nextInt();
				Comparable[] comparables = new Comparable[numOfShapes];

				int shapeNumber = 0;
				String shapeType = "";
				double firstValue = 0;
				double secondValue = 0;

				while (scanner.hasNext()) {
					shapeType = scanner.next();
					firstValue = scanner.nextDouble();
					secondValue = scanner.nextDouble();

					if (shapeType.equals("Cone")) {
						Cone cone = new Cone(firstValue, secondValue);
						comparables[shapeNumber] = cone;

					} else if (shapeType.equals("Cylinder")) {
						Cylinder cylinder = new Cylinder(firstValue, secondValue);
						comparables[shapeNumber] = cylinder;

					} else if (shapeType.equals("OctagonalPrism")) {
						Shape octaPrism = new OctagonalPrism(firstValue, secondValue);
						comparables[shapeNumber] = octaPrism;

					} else if (shapeType.equals("PentagonalPrism")) {
						Shape pentaPrism = new PentagonalPrism(firstValue, secondValue);
						comparables[shapeNumber] = pentaPrism;

					} else if (shapeType.equals("Pyramid")) {
						Shape pyramid = new Pyramid(firstValue, secondValue);
						comparables[shapeNumber] = pyramid;

					} else if (shapeType.equals("SquarePrism")) {
						Shape squarePrism = new SquarePrism(firstValue, secondValue);
						comparables[shapeNumber] = squarePrism;

					} else if (shapeType.equals("TriangularPrism")) {
						Shape triPrism = new TriangularPrism(firstValue, secondValue);
						comparables[shapeNumber] = triPrism;

					}

					shapeNumber++;
				}
				scanner.close();

				/**
				 * Call sort method defined in the Utility class
				 */
				Utility.sort(comparables, sA, comparator);
				
				
			} catch (FileNotFoundException e) {
				System.out.println("error");
				e.printStackTrace();
			}

		}

	}

}
