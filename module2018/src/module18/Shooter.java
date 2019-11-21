package module18;

/**
 * Shooter.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class Shooter extends Player {
	
	private Team myTeam ;

	/**
	 * @param name
	 * @param height
	 * @param weight
	 * @param strength
	 */
	public Shooter(String name, int height, int weight, float strength) {
		super(name, height, weight, strength);
		// TODO Auto-generated constructor stub
	}
	
	public double shoot() {
		return 0 ;
	}
	
	public void scored() {
		myTeam.addGoal() ;
	}
	
	public void setMyTeam(Team myTeam) {
		this.myTeam = myTeam ;
	}

}
