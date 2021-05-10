package shape;

import java.util.Comparator;

/**
 * Area Comparator class compares each polygon's area, implements Comparator
 * interface.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class BaseAreaComparator implements Comparator<Shape> {

	/**
	 * Compare method for shape base area. 
	 * If the base area of the first shape and the second shape are same,
	 * it will return 0.
	 * If the base area of the first shape is larger than the second shape,
	 * it will return -1.
	 * If the base area of the first shape is smaller than the second shape,
	 * it will return 1.
	 */
	@Override
	public int compare(Shape s1, Shape s2) {
		
		double s1BaseArea = s1.calcBaseArea();
		
		double s2BaseArea = s2.calcBaseArea();
		
		if (s1BaseArea == s2BaseArea)
			return 0;
		else if (s1BaseArea > s2BaseArea)
			return -1;
		else //s1BaseArea < s2 BaseArea
			return 1;
	}

}
