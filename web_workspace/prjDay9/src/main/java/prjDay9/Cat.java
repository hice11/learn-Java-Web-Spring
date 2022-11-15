package prjDay9;

public class Cat {

	String name;
	int age;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Cat [name:" + name + " age:" + age + "]";
	}
	
}
