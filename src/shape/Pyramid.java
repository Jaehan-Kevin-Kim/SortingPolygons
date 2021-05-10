package shape;

/**
 *  Pyramid class represents the pyramid shape. 
 *  This class extends the Shape abstract class.  
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class Pyramid extends Shape{
	
	/**
	 * The Edge Length of a Pyramid.
	 */
	private double edgeLength;
	
	/**
	 * Constructor of Pyramid class.
	 * @param height - Pyramid height.
	 * @param edgeLength - Pyramid edgeLength.
	 */
	public Pyramid(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	/**
	 * Method to calculate the Volume of a Pyramid.
	 * @return volume 
	 */
	public double calcVolume() {
		double volume = this.calcBaseArea()*this.getHeight() * (1.0/3);
		
		return volume;
	}
	
	/**
	 * Getter method for Pyramid's area.
	 * @return height
	 */
	public double calcBaseArea() {
		double baseArea = this.edgeLength * this.edgeLength;
		
		return baseArea;
	}
}
