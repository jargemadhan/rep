package arrayList;

import java.util.ArrayList;

public class FiftyAbove {
	public static void main(String[]args) {
		ArrayList <Integer> n=new ArrayList();
		n.add(20);
		n.add(35);
		n.add(68);
		n.add(75);
		n.add(28);
		n.add(84);
		n.add(84);
		n.add(97);
		n.add(10);
		
		int count=0;
		for(int i=0;i<n.size();i++) {
			if(n.get(i)>50) {
				
				count++;
				
			}
		}
		System.out.println(count);
	}
}
