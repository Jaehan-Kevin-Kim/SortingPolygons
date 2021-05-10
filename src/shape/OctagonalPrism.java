package shape;

/**
 *  Octagonal Prism class represents the Octagonal Prism shape. 
 *  This class extends the Shape abstract class.  
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class OctagonalPrism extends Shape{
	
	/**
	 * The Edge Length of an Octagonal Prism.
	 */
	private double edgeLength;
	
	/**
	 * Constructor of OctagonalPrism class.
	 * @param height - OctagonalPrism height.
	 * @param edgeLength - OctogonalPrism edgeLength.
	 */
	public OctagonalPrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}
	
	
	/**
	 * Method to calculate the Volume of a Octagonal Prism.
	 * @return volume
	 */
	public double calcVolume() {
		double volume = this.calcBaseArea()*this.getHeight();
		
		return volume;
	}
	
	/**
	 * Method to calculate the Base Area of a Octagonal Prism.
	 * @return base area
	 */
	public double calcBaseArea() {
		double baseArea = 2 * (1 + Math.sqrt(2)) * (this.edgeLength * this.edgeLength);
		
		return baseArea;
	}
	
}