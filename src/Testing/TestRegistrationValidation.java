package Testing;

import static org.junit.Assert.*;
import org.junit.Test;
import BusinessLogic.RegistrationValidation;

public class TestRegistrationValidation {
	RegistrationValidation rv = new RegistrationValidation();
	
	@Test
	public void testCheckUserDetails() {
		char j='j',p='p',c='c';
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",j,"abc","jail"));
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",p,"abc","police"));
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",c,"abc","cbi"));
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",j,"xyz","jail"));
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",p,"xyz","police"));
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",j,"xyz","cbi"));
		assertEquals(false, rv.checkUserDetails("abc@gmail.com", "Abc@55", "Abc@55",j,"hal","jail"));
		try {
			rv.checkUserDetails(null, null, null,'\0',null,null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

