package LPS2IMA.Raynaud.api.impl;

public class Contact {
	private String name ;
	private String telephone ;
	
	public Contact(String name ,  String telephone) {
		this.name = name ;
		this.telephone = telephone ;
	}
	public String getName() {
		return name;
	}
	public String getTelephone() {
		return telephone;
	}
}
