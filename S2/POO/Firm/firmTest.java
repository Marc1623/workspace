package Firm;

public class firmTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaffMember e1 = new Employee ("Marc","Les Charmilles 34", "078555555",2556.10);
		System.out.println(e1);
		
		StaffMember e2 = new Executive("Sacha", "ROutes de babolles 17", "789456123", 6545.45);
		System.out.println(e2);
		((Executive) e2).addBonus(500);
		System.out.println(e2);
		
		
		StaffMember sm1 = new Executive ("robin","route des alpettes 34","789456123",9876);
		System.out.println(sm1);
		
		StaffMember [] tabEmployee = {sm1,e1};
		
	}
	

}
