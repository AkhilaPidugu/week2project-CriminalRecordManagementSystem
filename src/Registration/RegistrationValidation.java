package Registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class RegistrationValidation {
	static Map<String, String> jailormap = new TreeMap<String, String>();
	static Map<String, String> policemap = new TreeMap<String, String>();
	static Map<String, String> cbimap = new TreeMap<String, String>(); 
	Set<String> emailset = new TreeSet<String>();

	private boolean validPassword(String password, String confirmPassword) {

		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"; 
		Pattern p = Pattern.compile(regex); 

		Matcher m1 = p.matcher(password);
		Matcher m2 = p.matcher(confirmPassword); 
		return (m1.matches() && m2.matches());
		 
	}
	public boolean checkUserDetails(String email, String password, String confirmpassword,char ch) {
		if(validEmail(email)&&validPassword(password,confirmpassword)) {
			if(!emailset.contains(email)) {
				if(ch=='j') {
				jailormap.put(email, password);
		    	return true;
				}
				else if(ch=='p') {
					policemap.put(email, password);
			    	return true;
				}
				else if(ch=='c') {
					cbimap.put(email, password);
				    return true;
			    }
			    return false;
		    }
			return false;
		}
		else
			return false;}

	private boolean validEmail(String email) {
		
		 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";//^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		 System.out.println("Correct email validation");
		 return email.matches(regex);
	}
	
}
	

