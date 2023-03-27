package arrayList;

import java.util.ArrayList;

public class FiveStr {
	public static void main(String[]args) {
		ArrayList <String> n=new ArrayList<>();
		n.add("george");
		n.add("Madhan");
		n.add("ganesh");
		n.add("balaji");
		n.add("mani");
		n.add("dinesh");
		n.add("dhilip");
		n.add("john");
		n.add("geo");
		
		
		for(String x:n) {
			if(x.length()>5) {
				
				System.out.println(x.toLowerCase());
			}
			else {
				System.out.println(x.toUpperCase());
			}
		}
		
		
	}

}
