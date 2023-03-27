package arrayList;
import java.util.ArrayList;

public class Sample1 {
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
		for(int i=0;i<n.size();i++) {
			System.out.println(n.get(i));
		}
		//for(Integer num:n) {
			//System.out.println(num);
		//}
		//n.forEach(x->System.out.println(x));
	}

}
