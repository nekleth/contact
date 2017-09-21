package LPS2IMA.Raynaud.test;

import org.easymock.EasyMockSupport;
import org.easymock.EasyMockRule;
import org.junit.Rule;


public class MockEasy extends EasyMockSupport {
	
	@Rule
	public EasyMockRule rule = new EasyMockRule(this);
}
