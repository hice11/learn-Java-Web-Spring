package week04.day2.objectEx;

public class Food {

	String name;
	int price;
	
	//생성자
	public Food() {	}
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//toString
	@Override
	public String toString() {
		return name+" "+price+"원";
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Food) {
			if(this.name.equals(((Food)obj).name) && this.price==((Food)obj).price) {
				return true;
			}else
				return false;
		}
		return false;
	}
	
	
	
	
}
