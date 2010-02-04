package edu.nyu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AppTest {
	
	@Autowired
	private XythosRemote xythosService;
	
	@Test
	public void weCanConnect() {
		xythosService.ping();
	}
	
	@Test
	public void canCreateANewFile() {
	  xythosService.saveFile("/zach/hello-world.txt", "12asf03459scj", "Hello, I am Zach.".getBytes(), "hello-world.txt", "text/plain", "zach");
	}
	
	@Test
	public void createADirectory() {
	  String newDirName = "hello" + new Date().getTime();
		xythosService.createDirectory("zach", null, "/zach", newDirName);
		System.out.println("Created new directory called " + newDirName);
	}
	
	@Test
	public void canFindFilesForUser() {
		System.out.println(xythosService.findAllFilesForUser("bob"));
	}

}
