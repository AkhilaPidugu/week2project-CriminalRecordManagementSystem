package Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import Registration.RegistrationValidation;

public class ViewJailerDetails {

	RegistrationValidation obj=new RegistrationValidation();
	Map<String, ArrayList> map=obj.jailormap;
	public void viewdetails(String email, char c) {
		// TODO Auto-generated method stub
		ArrayList<String> list=map.get(email);
		if(c=='f') {
			Map<String, ArrayList> map2=obj.jailormap;
			for (Entry<String, ArrayList> entry : map2.entrySet())  
	            System.out.println("email = " + entry.getKey()+",Name of Jailer "+entry.getValue().get(0)+",Name of Jailer"+entry.getValue().get(1)); 
		}
		else {
		if(list==null) {
			System.out.println("You are not reistered");
		}
		else {
		System.out.println("your name:"+list.get(0));
		System.out.println("your department:"+list.get(1));
	}
		}
	}

}
