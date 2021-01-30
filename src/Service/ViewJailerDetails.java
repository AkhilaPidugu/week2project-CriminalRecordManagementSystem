package Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import BusinessLogic.RegistrationValidation;

public class ViewJailerDetails {

	RegistrationValidation obj=new RegistrationValidation();
	Map<String, ArrayList> map=obj.jailormap;
	
	public void viewdetails(String email) {
		// TODO Auto-generated method stub
	ArrayList<String> list=map.get(email);

		if(list==null) {
			System.out.println("You are not reistered");
		}
		else {
		System.out.println("your name:"+list.get(0));
		System.out.println("your department:"+list.get(1));
		
		
		
		}
		
	}
	
	
}


