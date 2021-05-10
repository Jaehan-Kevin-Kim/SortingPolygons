package shape;

/**
 *  Pentagonal Prism class represents the Pentagonal Prism shape. 
 *  This class extends the Shape abstract class.  
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2020
 */
public class PentagonalPrism  extends Shape{
	
	/**
	 * The Edge Length of a Pentagonal Prism.
	 */
	private double edgeLength;
	
	/**
	 * Constructor of PentagonalPrism class.
	 * @param height - PentagonalPrism height.
	 * @param edgeLength - PentagonalPrism edgeLength.
	 */
	public PentagonalPrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	/**
	 * Method to calculate the Volume of a Pentagonal Prism.
	 * @return volume.
	 */
	public double calcVolume() {
		double volume = this.calcBaseArea()*this.getHeight();
		
		return volume;
	}
	
	/**
	 * Method to calculate the Base Area of a Pentagonal Prism.
	 * @return base area.
	 */
	public double calcBaseArea() {
		double baseArea = 5 *(this.edgeLength * this.edgeLength) * Math.tan(Math.toRadians(54)) / 4;
		
		return baseArea;
	}
	
}