package arrayList;

public class Car1 {
	String brand;
	int price;
	String color;
	boolean isTubeLess;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setIsTubeLess(boolean isTubeLess) {
		this.isTubeLess=isTubeLess;
	}
	public boolean getIstubeLess() {
		return isTubeLess;
	}
	
	public Car1(String brand,int price,String color,boolean istubeLess) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isTubeLess=isTubeLess;
	}
     public String toString() {
		return "Brand= "+brand+", Price= "+price+", Color= "+color+", is Tube Less= "+isTubeLess;
	}

}
