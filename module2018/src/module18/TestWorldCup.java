package module18;

/**
 * TestWorldCup.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class TestWorldCup {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws oneGoalKeeperException {
		// TODO Auto-generated method stub
		
		// French Team
		Player HugoLloris = new GoalKeeper("Hugo Lloris", 175, 75, 9f) ;
		Player LucasHernandez = new Defender("Lucas Hernandez", 172, 75, 7f) ;
		Player OlivierGiroud = new Attacker("Olivier Giroud", 168, 70, 7f) ;
		Player PaulPogba = new Attacker("Paul Pogba", 180, 70, 10f) ;
		
		// Portugal Team
		Player RuiPatricio = new GoalKeeper("Rui Patricio", 170, 73, 9f) ;
		Player BrunoAlves = new Defender("Bruno Alves", 175, 70, 7f) ;
		Player CristianoRonaldo = new Attacker("Cristiano Ronaldo", 169, 75, 7f) ;
		Player PepeTest = new Attacker("Pepe Test", 169, 75, 7f) ;
		
		// Test goal keeper
		GoalKeeper lambda = new GoalKeeper("lambda", 170, 73, 10f) ;
		
		// Adding teams
		Team France = new Team("FRA", "France") ;
		Team Portugal = new Team("POR", "Portugal") ;
		
		HugoLloris.addToTeam(France);
		LucasHernandez.addToTeam(France);
		OlivierGiroud.addToTeam(France);
		PaulPogba.addToTeam(France);
		
		
		RuiPatricio.addToTeam(Portugal);
		CristianoRonaldo.addToTeam(Portugal);
		BrunoAlves.addToTeam(Portugal);
		PepeTest.addToTeam(Portugal);
		//lambda.addToTeam(Portugal);
		
		France.showTeam() ;
		Portugal.showTeam() ;
		
		new ShootAction(LucasHernandez, RuiPatricio).play();
		new ShootAction(OlivierGiroud, RuiPatricio).play();
		new ShootAction(BrunoAlves, HugoLloris).play();
		new ShootAction(CristianoRonaldo, HugoLloris).play();
		
		France.showScore();
		Portugal.showScore();
	}

}