package shape;

/**
 * Cone class represents the Cone shape. This class extends the Shape abstract
 * class.
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version February 25, 2020
 */
public class Cone extends Shape {

	/**
     * The Radius of a Cone
     */
	private double radius;

	/**
	 * Constructor of Cone class.
	 * @param height - Cone height.
	 * @param radius - Cone radius.
	 */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;

	}

	/**
	 * Method to calculate the volume of a cone
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		double volume = calcBaseArea() * this.getHeight() / 3;

		return volume;
	}

	/**
	 * Method to calculate the base area of a cone
	 * @return baseArea
	 */
	@Override
	public double calcBaseArea() {
		double baseArea = Math.PI * radius * radius;
		
		return baseArea;
	}

}
