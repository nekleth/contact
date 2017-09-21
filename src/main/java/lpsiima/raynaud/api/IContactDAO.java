package lpsiima.raynaud.api;

import lpsiima.raynaud.api.impl.Contact;

public interface IContactDAO {
	public void creerContact(Contact c);
	
	public Contact recuperationContact(String nom);
	
	public boolean isContactExist(String nom );
}
