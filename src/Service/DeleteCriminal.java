package Service;

import java.util.ArrayList;
import java.util.Map;

public class DeleteCriminal {

	public void deleteCriminal() {
		// TODO Auto-generated method stub
		AddCriminal obj=new AddCriminal();
		Map<String,String> list1=obj.map;
		if(list1==null) {
			System.out.println("You are not reistered");
		}
		else {
		list1.clear();
		System.out.println("Data deleted successfully");
	}
		

	}

}
