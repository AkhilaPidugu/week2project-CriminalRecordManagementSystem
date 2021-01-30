package BusinessLogic;
import java.util.Scanner;
import Service.AddCriminal;
import Service.DeleteCBI;
import Service.DeleteCriminal;
import Service.DeleteJailer;
import Service.DeletePolice;
import Service.UpdateCBI;
import Service.UpdateJailer;
import Service.UpdatePolice;
import Service.ViewCBIDetails;
import Service.ViewCriminal;
import Service.ViewJailerDetails;
import Service.ViewPoliceDetails;
import User.User;
public class LoginValidation  {
	Scanner sc=new Scanner(System.in);
	public boolean jailorValidation(String email, String pass) {
		RegistrationValidation rv1=new RegistrationValidation(); 
		if(rv1.jailormap.containsKey(email) && pass.equals(rv1.jailormap.get(email).get(2))) {	
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
	public void registerfun() {
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your Password");
		String password=sc.next();
		System.out.println("Reenter password");
		String confirmpassword=sc.next();
		System.out.println("enter j for jailor,p for police,c for cbi");
		char ch=sc.next().charAt(0);
		System.out.println("Enter Department");
		String dept=sc.next();
		RegistrationValidation obj=new RegistrationValidation();
		boolean output=obj.checkUserDetails(email, password, confirmpassword,ch,name,dept);
		if(output) {
			System.out.println("Thank you for Registering");
			
			}
		else {
			System.out.println("enter correct Details");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Select the option 1.login 2.register 3.update 4.Delete 5.View 6.CriminalDetails 7.Exit 1/2/3/4/5/6/7");
		int option=sc.nextInt();
		if(option==1) {
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter Password");
		String password=sc.next();
		System.out.println("enter j for jailor,p for police,c for cbi");
		char  ch=sc.next().charAt(0);
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
			System.out.println("Welcome "+email);
		}
		else {
			System.out.println("Register first because you are not a user");
			LoginValidation loginv=new LoginValidation();
			loginv.registerfun();
			boolean output=false;
			
			if(output) {
				System.out.println("You are now an admin");
			}
			else {
				System.out.println("enter correct Details");
			}
		}

		}
		else if(option==2) {
			LoginValidation obj=new LoginValidation();
			obj.registerfun();
		}
		else if(option==3) {
			System.out.println("Enter whether you are a jailor/police/cbi press j for jailor,p for police,c for cbi");
			char ch=sc.next().charAt(0);
			System.out.println("Enter your email");
			String email=sc.next();
			if(ch=='j') {
			UpdateJailer update=new UpdateJailer();
			System.out.println("Select option 1.name 2.department");
			int opt=sc.nextInt();
			update.updatedetails(email,opt);
			}
			else if(ch=='p') {
				UpdatePolice update=new UpdatePolice();
				System.out.println("Select option 1.name 2.department");
				int opt=sc.nextInt();
				update.updatedetails(email,opt);
				}
			
			else if(ch=='c') {
				UpdateCBI update=new UpdateCBI();
				System.out.println("Select option 1.name 2.department");
				int opt=sc.nextInt();
				update.updatedetails(email,opt);
				}
		}
		
		else if(option==4) {
			System.out.println("Enter whether you are a jailor/police/cbi press j for jailor,p for police,c for cbi");
			char ch=sc.next().charAt(0);
			System.out.println("Enter your email");
			String email=sc.next();
			if(ch=='j') {
			DeleteJailer delete=new DeleteJailer();
			delete.deletedetails(email);
			}
			else if(ch=='p') {
				DeletePolice delete=new DeletePolice();
				delete.deletedetails(email);
			}
			else if(ch=='c') {
				DeleteCBI delete=new DeleteCBI();
				delete.deletedetails(email);
				}
		}
		else if(option==5) {
			System.out.println("Enter whether you are a jailor/police/cbi press j for jailor,p for police,c for cbi");
			char ch=sc.next().charAt(0);

			System.out.println("Enter your email");
			String email=sc.next();
			if(ch=='j') {
				ViewJailerDetails view=new ViewJailerDetails();
				view.viewdetails(email);
				}
				else if(ch=='p') {
					ViewPoliceDetails vp=new ViewPoliceDetails();
					vp.viewdetails(email);
				}
				else if(ch=='c') {
					ViewCBIDetails vd=new ViewCBIDetails();
					vd.viewdetails(email);
					}
		}
		else if(option==6) {
			System.out.println("Select and Option accordingly 1.AddCriminal 2.ViewCriminal 3.DeleteCriminalData 4.Exit 1/2/3/4");
			int opt=sc.nextInt();
			if(opt==1) {
			AddCriminal adc=new AddCriminal();
			String name="",dept="";
			adc.addCriminal(name,dept);
			}

			else if(opt==2) {
				ViewCriminal vc=new ViewCriminal();
				vc.viewCriminalDetails();
			}
			else if(opt==3) {
				DeleteCriminal dc=new DeleteCriminal();
				dc.deleteCriminal();
			}
			else if(opt==4) {
				System.out.println("Exit successfully done.Thank you."); 
				break;
			}	
			
		}
		else if(option==7) {
			System.out.println("You are logged out done.Thank you."); 
			break;
		}
		
		}
	}
			
	
}
	
	