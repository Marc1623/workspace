package CC1;

import java.util.*;

public class Client {

	private String lastname;//nom
	private String firstname;//prénom
	private String birthdate;
	private BankAccount compte;
	
	public Client(String lastname,String firstname,String birthdate ){
		
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
	}
	
}
