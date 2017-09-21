package LPS2IMA.Raynaud.api.impl;

import LPS2IMA.Raynaud.api.IContactDAO;

public class ContactService {
	
	private IContactDAO bdd = new ContactDAOImpl() ;
	
	public void creerContact(String nom, String telephone){
		if ( nom == null ){
			throw new IllegalArgumentException("parameter ["+nom+"] is null ");
		}
		if ( nom.length() <3 || nom.length() > 40 ){
			throw new IllegalArgumentException("The length of the name is not valid ");
		}
		if (telephone == null){
			throw new IllegalArgumentException("parameter ["+telephone+"] is null ");
		}
		if ( telephone.length() != 10){
			throw new IllegalArgumentException("The length of the telephone is not valid ");
		}
		if (bdd.isContactExist(nom)){
			throw new IllegalStateException("the contact already exist");
		}
		Contact contact = new Contact(nom, telephone);
		bdd.creerContact(contact);
		
		
	}
}
