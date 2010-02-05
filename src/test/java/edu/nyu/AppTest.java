package edu.nyu;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class AppTest {
	
	@Autowired
	private XythosRemote xythosService;
	
	@Test
	public void testTruth() {
		assert(true);
	}

}
