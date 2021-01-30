package Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import BusinessLogic.RegistrationValidation;

public class UpdateCBI {

	Scanner sc=new Scanner(System.in);
	public void updatedetails(String email, int opt) {
		// TODO Auto-generated method stub
		RegistrationValidation obj=new RegistrationValidation();
		Map<String, ArrayList> map1=obj.jailormap;
		ArrayList<String> list=map1.get(email);
		if(list==null) {
			System.out.println("You are not registered");
		}
		else {
		if(opt==1) {
			System.out.println("Enter new name");
			String name=sc.next();
			list.set(0,name);
		}
		else {
			System.out.println("Enter new Department");
			String dept=sc.next();
			list.set(1,dept);
		}
		}
	}

}
