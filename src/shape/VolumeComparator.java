package shape;

import java.util.Comparator;

/**
 * Volume Comparator class compares each polygon's volume, implements Comparator
 * interface.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class VolumeComparator implements Comparator<Shape> {

	/**
	 * Compare method for shape volumes. 
     * If the volume of the first shape and the second shape are same,
	 * it will return 0.
	 * If the volume of the first shape is larger than the second shape,
	 * it will return -1.  
	 * If the volume of the first shape is smaller than the second shape,
	 * it will return 1. 
	 */
	@Override
	public int compare(Shape s1, Shape s2) {
		
		double s1Volume = s1.calcVolume();
		
		double s2Volume = s2.calcVolume();
		
		if (s1Volume == s2Volume)
			return 0;
		
		else if (s1Volume > s2Volume) 
			return -1;
		
		 else // s1Volume < s2Volume
			return 1;
		
	}

}