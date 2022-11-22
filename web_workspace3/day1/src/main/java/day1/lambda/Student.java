package day1.lambda;

public class Student implements Comparable<Student> {
	// public class Student {
	String name;
	String address;
	
	@Override
	public int compareTo(Student o) {
		//기준이 비교대상보다 작으면 음수, 크면 양수
		return this.name.compareTo(o.name);
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	 
 }

