package LPS2IMA.Raynaud.api.impl;

import java.util.ArrayList;
import java.util.List;

import LPS2IMA.Raynaud.api.IContactDAO;

public class ContactDAOImpl implements IContactDAO{
	private List<Contact> contacts = new ArrayList<Contact>() ;	
	
	public void creerContact(Contact c){
		if ( c == null ){
			throw new IllegalArgumentException("parameter ["+c+"] is null ");
		}
		contacts.add(c);
	}
	
	public Contact recuperationContact(String nom){
		for (int i = 0 ; i< contacts.size() ; i ++){
			Contact c  = contacts.get(i);
			if( c.getName().equals(nom)){
				return c ;
			}
		}
		return null ;
	}
	
	public boolean isContactExist(String nom ){
		for (int i = 0 ; i< contacts.size() ; i ++){
			Contact c  = contacts.get(i);
			if( c.getName().equals(nom)){
				return true  ;
			}
		}
		return false ;
	}
	
}
