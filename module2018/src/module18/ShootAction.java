package module18;

/**
 * ShootAction.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class ShootAction {
	
	private Player player1 ;
	private Player player2 ;
	
	public ShootAction(Player player1, Player player2) {
		this.player1 = player1 ;
		this.player2 = player2 ;
	}
	
	public void play() {
		
		if (player1.shoot() > player2.stop()) {
			System.out.println("WELL DONE ! Goal by " + player1.getName()) ;
			player1.scored() ;
		}
		else {
			System.out.println("INCREDIBLE ! " + player2.getName() + " stops the shoot !") ;
		}
	}

}