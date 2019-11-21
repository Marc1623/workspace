package module18;

/**
 * Defender.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class Defender extends Shooter {

	/**
	 * @param name
	 * @param height
	 * @param weight
	 * @param strength
	 */
	public Defender(String name, int height, int weight, float strength) {
		super(name, height, weight, strength);
		// TODO Auto-generated constructor stub
	}
	
	public double shoot() {
		return this.strength/(this.strength*Math.random()) ;
	}

}
