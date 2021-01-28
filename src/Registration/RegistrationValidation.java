package Registration;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegistrationValidation {
	public static Map<String,ArrayList> jailormap = new TreeMap<String, ArrayList>();
	public static Map<String,ArrayList> policemap = new TreeMap<String, ArrayList>();
	public static Map<String,ArrayList> cbimap = new TreeMap<String, ArrayList>(); 
	Set<String> emailset = new TreeSet<String>();

	public boolean checkUserDetails(String email, String password, String confirmpassword,char ch,String name,String dpt) {
		if(validEmail(email)&&validPassword(password,confirmpassword)) {
			if(!emailset.contains(email)) {
				if(ch=='j') {
					ArrayList<String> list=new ArrayList<String>();
					list.add(name);
					list.add(dpt);
					list.add(password);
				jailormap.put(email, list);
				emailset.add(email);
		    	return true;
				}
				else if(ch=='p') {
					ArrayList<String> list=new ArrayList<String>();
					list.add(name);
					list.add(dpt);
				policemap.put(email, list);
				emailset.add(email);	
			    	return true;
				}
				else if(ch=='c') {
					ArrayList<String> list=new ArrayList<String>();
					list.add(name);
					list.add(dpt);
				cbimap.put(email, list);
				emailset.add(email);
				    return true;
			    }
			    return false;
		    }
			return false;
		}
		else if(emailset.contains(email)) {
			System.out.println("Email already exists");
			return false;
		}
		else
			return false;}

	private boolean validEmail(String email) {
		
		 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		// System.out.println("Correct email validation");
		 return email.matches(regex);
	}
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
	
}
	

