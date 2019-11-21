package module18;

/**
 * GoalKeeper.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class GoalKeeper extends Player {

	/**
	 * @param name
	 * @param height
	 * @param weight
	 * @param strength
	 */
	public GoalKeeper(String name, int height, int weight, float strength) {
		super(name, height, weight, strength) ;
		// TODO Auto-generated constructor stub
	}
	
	public double stop() {
		return this.strength/(this.strength*Math.random()) ;
	}

}
