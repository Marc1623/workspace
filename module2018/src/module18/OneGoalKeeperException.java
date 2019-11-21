package module18;

/**
 * oneGoalKeeperException.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class oneGoalKeeperException extends Exception {
	
//	public oneGoalKeeperException(String message) {
//		super(message) ;
//	}
	
	public oneGoalKeeperException()
	{
		super("Vous ne pouvez ajouter que un gardien par équipe !");
	}

}
