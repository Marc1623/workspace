package module18;

/**
 * Player.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public abstract class Player {
	
	protected String name ;
	protected int height ;
	protected int weight ;
	protected float strength ;
	
	private Team myTeam ;
	
	public Player(String name, int height, int weight, float strength) {
		this.name = name ;
		this.height = height ;
		this.weight = weight ;
		this.strength = strength ;
	}
	
	public void addToTeam(Team team) throws oneGoalKeeperException {
		team.addPlayer(this) ;
	}
	
	public String getName() {
		return name ;
	}
	
	public double shoot() {
		return 0 ;
	}
	
	public double stop() {
		return 0 ;
	}
	
	public void setTeam(Team myTeam) {
		this.myTeam = myTeam ;
	}
	
	public void scored() {
		
	}

}
