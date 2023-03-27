package arrayList;

public class Employee {
	String name;
	int age;
	String gender;
	int salary;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public Employee(String name,int age,String gender,int salary) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		
	}
	public String toString() {
		return name+", "+age+", "+gender+", "+salary;
	}

}
