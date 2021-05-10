package shape;

/**
 *  Cylinder class represents the cylinder shape. This class extends the Shape abstract class.  
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2020
 */
public class Cylinder extends Shape{

	/**
	 * The Radius of a Cylinder
	 */
	private double radius;

	/**
	 * Constructor of Cylinder class.
	 * @param height - Cylinder height.
	 * @param radius - Cylinder radius.
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}


	/**
	 * Method to calculate the volume of a cylinder
	 * @return volume.
	 */
	@Override
	public double calcVolume() {
		double volume = calcBaseArea() * this.getHeight();
		
		return volume;
	}


	/**
	 * Method to calculate the base area of a cylinder
	 * @return baseArea.
	 */
	@Override
	public double calcBaseArea() {
		double baseArea = Math.PI * radius * radius;
		
		return baseArea;
	}

}
