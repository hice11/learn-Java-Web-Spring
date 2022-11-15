package week03.day3.클래스만들기;

//개인정보
public class PersonalData {
	//멤버변수
	private int age;
	private String name;
	private String maritalStatus;
	private int nChildren;
	
	//생성자
	public PersonalData(int age,String name,String maritalStatus,int nChildren) {
		this.age = age;
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.nChildren = nChildren;
	}
	
	//출력
	public void printPersonalData() {
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("결혼여부: "+maritalStatus);
		System.out.println("자녀수: "+nChildren);
	}

}
