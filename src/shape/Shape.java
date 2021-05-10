package shape;

/**
 *  Shape abstract class. This class works as a base for each shape compared in this program.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public abstract class Shape implements Comparable<Shape>{
	
	/**
     * The Height of a Shape
     */
	private double height; 
	
	/**
     * The Volume of a Shape
     */
	private double volume;
	
	/**
     * The Base Area of a Shape
     */
	private double baseArea;
	
	
	public Shape (double height) {
		this.height = height;
	}


	/**
	 * Getter of the Height of a shape.
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	
	
	/**
	 * Method to calculate the Volume of a Shape 
	 * @return volume
	 */
	public double calcVolume() {
		return this.volume;
	}
	
	/**
	 * Method to calculate the Base Area of a Shape
	 * @return base area.
	 */
	public double calcBaseArea() {
		return this.baseArea;
	}
	
	 /**
     * CompareTo method from the Comparable interface. This methods compares each polygon's height.
     * If the height of this shape is larger than the other shape, it will return -1.
	 * If the height of this shape is smaller than the other shape, it will return 1.
	 * If the height of this shape and the other shape are same, it will return 0.
     */
	@Override
	public int compareTo(Shape s) {
	     if (this.height==s.height) 
	            return 0;
	     
	     else if (this.height>s.height)
	            return -1;
	     
	     else return 1; //this.height < s.height
	}
	
}
