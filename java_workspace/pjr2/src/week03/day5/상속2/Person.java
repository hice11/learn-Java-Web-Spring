package week03.day5.상속2;

public class Person {
	
	//protected -> 상속관계에서 자식이 접근하는것을 허용하게함
	protected String name; //이름
	protected String id; //주민

	public Person(){
	}
	
	public Person(String name,String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
}
