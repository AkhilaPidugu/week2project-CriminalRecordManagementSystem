package Registration;
import java.util.Scanner;

import User.User;
public class LoginValidation  {
	
public boolean jailer(String name, String pass){
		
		if(name.equals("jailer")&& pass.equals("jailer")) {
			return true;
		}return false;
		
	}
public boolean police(String name, String pass){
	
	if(name.equals("police")&& pass.equals("police")) {
		return true;
	}return false;
	
}
	
public boolean cbi(String name, String pass){
	
	if(name.equals("cbi")&& pass.equals("cbi")) {
		return true;
	}return false;
	
}
	public boolean jailorValidation(String email, String pass) {
		RegistrationValidation rv1=new RegistrationValidation(); 
		if(rv1.jailormap.containsKey(email) && pass.equals(rv1.jailormap.get(email))) {
			return true;
		}return false;
	}
	public boolean policeValidation(String email, String pass) {
		RegistrationValidation rv1=new RegistrationValidation(); 
		if(rv1.policemap.containsKey(email) && pass.equals(rv1.policemap.get(email))) {
			return true;
		}return false;
	}
	public boolean cbiValidation(String email, String pass) {
		RegistrationValidation rv1=new RegistrationValidation(); 
		if(rv1.cbimap.containsKey(email) && pass.equals(rv1.cbimap.get(email))) {
			return true;
		}return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter Password");
		String password=sc.nextLine();
		System.out.println("enter j for jailor,p for police,c for cbi");
		char ch=sc.next().charAt(0);
		User userobj=new User(email,password);
		LoginValidation lv=new LoginValidation();
		boolean res=false;
		if(ch=='j') {
			res=lv.jailorValidation(email, password);
		}
		else if(ch=='p'){
			res=lv.policeValidation(email, password);
		}
		else if(ch=='c'){
			res=lv.cbiValidation(email, password);
		}
		if(res==true) {
			System.out.println("Welcome"+email);
		}
		else {
			System.out.println("First Signup because you are not a user");
			System.out.println("enter your email");
			email=sc.next();
			System.out.println("enter your Password");
			password=sc.next();
			System.out.println("Reenter password");
			String confirmpassword=sc.next();
			System.out.println("enter j for jailor,p for police,c for cbi");
			ch=sc.next().charAt(0);
			RegistrationValidation obj=new RegistrationValidation();
			boolean output=false;
			output=obj.checkUserDetails(email, password, confirmpassword,ch);
			if(output) {
				System.out.println("You are now an admin");
			}
			else {
				System.out.println("enter correct Details");
			}
		}
	}
}
	
	