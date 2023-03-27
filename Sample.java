package arrayList;
import java.util.ArrayList;

public class Sample {
public static void main(String[]args) {
	ArrayList<Integer> l=new ArrayList();
	l.add(20);
	l.add(35);
	l.add(68);
	l.add(75);
	l.set(0, 36);
	l.add(1,75);
	l.remove(2);
	System.out.println(l.get(0));
	System.out.println(l.size());
}
}
