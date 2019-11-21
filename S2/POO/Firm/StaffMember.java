package Firm;

public abstract class StaffMember {
	
	private String name;
	private String adresse;
	private String phone;
	
	public StaffMember (String name, String adresse,String phone){
		
		this.name = name;
		this.adresse = adresse;
		this.phone = phone;
		
		
	}
	
	public abstract double pay();
	
	public String toString (){
		
		return "Name : "+name + "\n"+
				"Adresse : "+adresse+"\n"+
				"Phone : "+ phone;
	}

}
