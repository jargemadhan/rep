package arrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class StringEven {	
	public static void main(String[]args) {
	ArrayList <String> n=new ArrayList<>();
	
	n.add("george");
	n.add("Madhan");
	n.add("ganesh");
	n.add("balaji");
	n.add("mani");
	n.add("dinesh");
	n.add("dhilip");
	HashMap<Integer,String> hm=new HashMap<>();
	//hm.add("george");
	//.add("Madhan");
	//hm.add("ganesh");
	//hm.add("balaji");
	//int count=0;
	StringEven a=null;
	for(int i=0;i<n.size();i++) {
		if(i%2!=0) {
			
			System.out.print(n.get(i).toLowerCase());
		}
		else {
			//System.out.print(n.get(i).toUpperCase());
		}
	}
	//System.out.println(n.get());
	
}

}
