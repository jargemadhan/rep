package arrayList;
import java.util.ArrayList;

public class UseCar {
	public static void main(String[]args) {
		Car m1=new Car("BMW",4600000,"White",true);
		Car m2=new Car("MG",3600000,"Black",true);
		Car m3=new Car("Maruti",1600000,"Red",false);
		Car m4=new Car("Auti",4000000,"Blue",true);
		Car m5=new Car("Bance",5000000,"Black",true);
		Car m6=new Car("BMW",4600000,"White",true);
		Car m7=new Car("MG",3600000,"Black",true);
		Car m8=new Car("Maruti",1600000,"Red",false);
		Car m9=new Car("Auti",4000000,"Blue",true);
		Car m10=new Car("Bance",5000000,"Black",true);
		
		ArrayList <Car> cars=new ArrayList<>();
		cars.add(m1);
		cars.add(m2);
		cars.add(m3);
		cars.add(m4);
		cars.add(m5);
		cars.add(m6);
		cars.add(m7);
		cars.add(m8);
		cars.add(m9);
		cars.add(m10);
		Car temp=null;
		for(int i=0;i<cars.size();i++) {
			
			if(cars.get(i).getBrand().equalsIgnoreCase("Auti")) {
			//System.out.println(cars.get(i));
				cars.get(i).setPrice(cars.get(i).getPrice()-2);
			}
			else if(cars.get(i).getBrand().equalsIgnoreCase("Bmw")) {
				cars.get(i).setPrice(cars.get(i).getPrice()-3);
			}
		}
		
		cars.forEach(x->System.out.println(x));
		
	}
}


