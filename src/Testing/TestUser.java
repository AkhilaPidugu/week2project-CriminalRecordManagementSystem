package Testing;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import User.User;

public class TestUser {
	LocalDateTime ld = LocalDateTime.of(2005, 4, 9, 22, 05, 12);
	User user = new User ( "amin@gmail.com","Amin@556");
	
	@Test
	public void testSetterGetter() {
		user.setEmail("abc@gmail.com");
		user.setPassword("Abc@55");
		assertEquals("abc@gmail.com",user.getEmail());
		assertEquals("Abc@55",user.getPassword());

		try {
			user.setEmail(null);
			user.setPassword(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

