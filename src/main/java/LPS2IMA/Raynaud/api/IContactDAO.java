package LPS2IMA.Raynaud.api;

import LPS2IMA.Raynaud.api.impl.Contact;

public interface IContactDAO {
	public void creerContact(Contact c);
	
	public Contact recuperationContact(String nom);
	
	public boolean isContactExist(String nom );
}
