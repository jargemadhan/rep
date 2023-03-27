package arrayList;

import java.util.ArrayList;

public class UseCar1 {
	public static void main(String[]args) {
		Car m1=new Car("BMW",4600000,"White",true);
		Car m2=new Car("MG",3600000,"Black",true);
		Car m3=new Car("Maruti",1600000,"Red",false);
		Car m4=new Car("Auti",4000000,"Blue",true);
		Car m5=new Car("Bance",5000000,"Black",true);
		Car m6=new Car("BMW",4600000,"White",true);
		Car m7=new Car("MG",3600000,"Black",true);
		Car m8=new Car("Maruti",1600000,"Red",false);
		Car m9=new Car("Audi",4000000,"Blue",true);
		Car m10=new Car("Baz",10000000,"Black",true);
		
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
		for(Car x:cars) {
			
			if(x.getPrice()<2500000&&x.getPrice()>5000000) {
			//System.out.println(cars.get(i));
				x.setPrice(x.getPrice()+x.getPrice()*5/100);
			}
			else if(x.getPrice()<5000000&&x.getPrice()>10000000) {
				x.setPrice(x.getPrice()+x.getPrice()*8/100);
			}
			else if(x.getPrice()<10000000) {
				x.setPrice(x.getPrice()+x.getPrice()*10/100);
			}
		}
		
		cars.forEach(m->System.out.println(m));
		
	}

}
