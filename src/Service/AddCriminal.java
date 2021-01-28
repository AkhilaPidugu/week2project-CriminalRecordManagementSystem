package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddCriminal {
	static Map<String,String> map=new HashMap<String,String>();
	public void addCriminal(String name,String dept) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Criminal Name:");
		String criminalname=sc.nextLine();
		System.out.println("Enter Department to which criminal belongs to:");
		String deptname=sc.nextLine();
		map.put(criminalname,deptname);
		System.out.println("Successfully added criminal details");
		
		
	}
}
