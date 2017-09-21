package lpsiima.raynaud.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lpsiima.raynaud.api.impl.ContactService;

public class testFonctionnelContactService {
	private ContactService service ;
	private static final String CTE = "0200000000";
	@Before
	public void setUp() {
		service = new ContactService() ;
	}
	@Test
	public void testCreerContactWithCorrectParameter() {
		service.creerContact("ALbert", CTE);
		assertTrue(true);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameLengthUnderThree() {
		service.creerContact("AL", CTE);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameLengthSuperiorToTheLimit() {
		service.creerContact("ALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","0200000000");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithTelephoneLengthMinimal() {
		service.creerContact("Toto","02");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithTelephoneLengthMaximal() {
		service.creerContact("Toto","02020202020");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCreerContactWithTelephoneEqualsNull() {
		service.creerContact("Toto",null);
	} 
	@Test(expected = IllegalArgumentException.class)
	public void testCreerContactWithNameEqualsNull() {
		service.creerContact(null,"02020202020");
	} 
	@Test (expected = IllegalStateException.class)
	public void testCreerContactWithContactAlreadyExist() {
		service.creerContact("Toto","0202020202");
		service.creerContact("Toto","0202020211");
	}
	

}
