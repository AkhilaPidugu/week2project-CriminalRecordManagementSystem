package Testing;

import static org.junit.Assert.*;
import org.junit.Test;

import BusinessLogic.LoginValidation;
public class TestLogin {
	
		LoginValidation vu = new LoginValidation();
		
		@Test
		public void testValidate() {
			assertEquals(false,vu.jailorValidation("abc@gmail.com","Abc@55"));
			assertEquals(false,vu.policeValidation("admin", "admin1"));
			assertEquals(false,vu.cbiValidation("admin1", "admin"));
			try {
				vu.jailorValidation(null, null);
				vu.policeValidation(null, null);
				vu.cbiValidation(null, null);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	

}
