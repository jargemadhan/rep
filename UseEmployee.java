package arrayList;
import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[]args) {
		Employee m1=new Employee("ganesh",25,"male",30000);
		Employee m2=new Employee("Balaji",36,"male",25000);
		Employee m3=new Employee("jamuna",30,"female",20000);
		Employee m4=new Employee("mani",25,"male",26000);
		Employee m5=new Employee("dinesh",25,"male",30000);
		Employee m6=new Employee("Priya",27,"female",35000);
		
		
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(m1);
		emps.add(m2);
		emps.add(m3);
		emps.add(m4);
		emps.add(m5);
		emps.add(m6);
		for(int i=0;i<emps.size();i++) {
			if(emps.get(i).getAge()>=30) {
				//emps.get(i).setSalary(emps.get(i).getSalary()*5/100);
				System.out.println("Age 30 above name: "+emps.get(i).getName()+", Salary:"+emps.get(i).getSalary());
			}
		}
		for(int i=0;i<emps.size();i++) {
			if(emps.get(i).getGender().equals("female")) {
				emps.get(i).setSalary(emps.get(i).getSalary()+emps.get(i).getSalary()*5/100);
			}
			else {
				emps.get(i).setSalary(emps.get(i).getSalary()+emps.get(i).getSalary()*4/100);
			}
			System.out.println(emps.get(i));
		}
		//System.out.println(emps);
		//emps.forEach(x->System.out.println(x));
	}

}
