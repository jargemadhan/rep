package arrayList;
import java.util.ArrayList;

public class StringOdd {
	public static void main(String[]args) {
		ArrayList <String> n=new ArrayList<>();
		n.add("george");
		n.add("Madhan");
		n.add("ganesh");
		n.add("balaji");
		n.add("mani");
		n.add("dinesh");
		n.add("dhilip");
		//int count=0;
		for(int i=0;i<n.size();i++) {
			if(i%2==0) {
				System.out.print(n.get(i).toUpperCase());
			}
		}
		
	}
}
