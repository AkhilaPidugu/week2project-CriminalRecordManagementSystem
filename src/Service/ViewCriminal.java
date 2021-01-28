package Service;

import java.util.ArrayList;
import java.util.Map;

import Registration.LoginValidation;
import Registration.RegistrationValidation;

public class ViewCriminal{
	
	public void viewCriminalDetails() {
			// TODO Auto-generated method stub
		AddCriminal obj=new AddCriminal();
		Map<String,String> list1=obj.map;
			if(list1==null) {
				System.out.println("You are not reistered");
			}
			else {
				for (Map.Entry<String,String> entry : list1.entrySet())  
		            System.out.println("Name = " + entry.getKey() + 
		                             ", Department = " + entry.getValue());
			
				}
			
			
	}
}
