package module18;

/**
 * Attacker.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class Attacker extends Shooter {
	
	public Attacker(String name, int height, int weight, float strength) {
		super(name, height, weight, strength) ;
	}
	
	public double shoot() {
		return this.strength*1.15/(this.strength*Math.random()) ;
	}

}