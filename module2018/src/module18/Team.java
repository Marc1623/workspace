package module18;

/**
 * Team.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class Team {
	
	private String name ;
	private String country ;
	private int score = 0 ;
	private int nbKeeper = 0 ;
	private Player[] team = new Player[4] ;
	private int counter = 0 ;
	
	public Team(String name, String country) {
		
		this.name = name ;
		this.country = country ;
		
	}
	
	public void addPlayer(Player foot) throws oneGoalKeeperException {
		team[counter] = foot ;
		foot.setTeam(this) ;
		if (foot instanceof GoalKeeper) {
			nbKeeper++ ;
//				try {
//					//String message = "You can only add one goal keeper in a team !" ;
//					if (nbKeeper > 1) {
//						String message = "You can only add one goal keeper in a team !" ;
//						throw new oneGoalKeeperException(message) ;
//					}
//					//throw new oneGoalKeeperException(message) ;
//				} catch (oneGoalKeeperException e) {
//					// TODO Auto-generated catch block
//					System.out.println(e.getMessage()) ;
//				}
		
				if (nbKeeper>1)throw new oneGoalKeeperException(); 
			}
			
		//}
		counter++ ;
	}
	
	public void showTeam() {
		for (int i = 0; i < team.length; i++) {
			System.out.println("The team" + name + " is composed of: " + team[i].getName()) ;
		}
	}
	
	public void addGoal() {
		score++ ;
	}

	public void showScore() {
		System.out.println(name + ": " + score) ;
	}
}
