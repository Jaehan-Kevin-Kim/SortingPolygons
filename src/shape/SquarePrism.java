package shape;

/**
 *  Square Prism class represents the Square Prism shape. 
 *  This class extends the Shape abstract class.  
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class SquarePrism  extends Shape{

	/**
	 * The Edge Length of a Square Prism.
	 */
	private double edgeLength;
	
	/**
	 * Constructor of SquarePrism class.
	 * @param height - SquarePrism height.
	 * @param edgeLength - SquarePrism edgeLength.
	 */
	public SquarePrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}
	

	
	/**
	 * Method to calculate the Volume of a Square Prism.
	 * @return volume.
	 */
	public double calcVolume() {
		double volume = this.calcBaseArea()*this.getHeight();
		
		return volume;
	}

	/**
	 * Method to calculate the Base Area of a Square Prism.
	 * @return base area.
	 */
	public double calcBaseArea() {
		double baseArea = this.edgeLength * this.edgeLength;
		
		return baseArea;
	}
	
	
}
