package Service;

import java.util.ArrayList;
import java.util.Map;

import Registration.LoginValidation;
import java.util.Scanner;
public class UpdateCriminal {
Scanner sc=new Scanner(System.in);
	public void updateCriminalDetails(String name) {
		// TODO Auto-generated method stub
		AddCriminal obj=new AddCriminal();
		Map<String,String> list1=obj.map;
		
		if(list1==null) {
			System.out.println("You are not registered");
		}
		else {
			System.out.println("Choose 1 for name updation 2 for department updation");
			int opt=sc.nextInt();
			if(opt==1) {
			System.out.println("Enter new name");
			String name1=sc.next();
		//list.set(0, name1);
		}
		else {
			System.out.println("Enter new Department");
			String dept=sc.next();
		//	list.set(1, dept);
		}
		}
		
	}

}
