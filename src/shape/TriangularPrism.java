package shape;

/**
 *  Triangular Prism class represents the Triangular Prism shape. 
 *  This class extends the Shape abstract class.  
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2021
 */
public class TriangularPrism extends Shape{

	/**
	 * The Edge Length of a Triangular Prism.
	 */
	private double edgeLength;
	
	/**
	 * Constructor of TriangularPrism class.
	 * @param height - TriangularPrism height.
	 * @param edgeLength - TriangularPrism edgeLength.
	 */
	public TriangularPrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}
	
	/**
	 * Method to calculate the Volume of a Triangular Prism.
	 * @return volume
	 */
	public double calcVolume() {
		double volume = this.calcBaseArea()*this.getHeight();
		
		return volume;
	}

	/**
	 * Method to calculate the Base Area of a Triangular Prism.
	 * @return base area
	 */
	public double calcBaseArea() {
		double baseArea = (this.edgeLength * this.edgeLength) * Math.sqrt(3) / 4;
		
		return baseArea;
	}
	
	
}

