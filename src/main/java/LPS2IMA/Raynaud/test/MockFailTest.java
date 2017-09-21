package LPS2IMA.Raynaud.test;

import static org.junit.Assert.*;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

import LPS2IMA.Raynaud.api.IContactDAO;
import LPS2IMA.Raynaud.api.impl.Contact;
import LPS2IMA.Raynaud.api.impl.ContactService;

public class MockFailTest extends MockEasy {

	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock
	private IContactDAO dao ;
	
	@Test
	public void testCreerContactErr() throws IllegalArgumentException,IllegalStateException {
		
	}
	
	@Test
	public void testCreerContactCasValide() throws IllegalStateException {
		String name = "Albert";
		EasyMock.expect(dao.isContactExist(name)).andReturn(false);
		
		Capture<Contact> newCapture = EasyMock.newCapture();
		dao.creerContact(EasyMock.capture(newCapture));
		EasyMock.expectLastCall();
		
		replayAll();
		
		service.creerContact(name, "0202481532");
		
		verifyAll();
		
		assertEquals("0202481532", newCapture.getValue().getTelephone(),"Error");
		
	}
}
